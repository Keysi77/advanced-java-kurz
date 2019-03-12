package sk.ormFramework.simpleormframework.reflection;

import sk.ormFramework.simpleormframework.anotacie.Id;
import sk.ormFramework.simpleormframework.anotacie.Stlpec;
import sk.ormFramework.simpleormframework.anotacie.Tabulka;
import sk.ormFramework.simpleormframework.vynimky.MissingIdException;
import sk.ormFramework.simpleormframework.vynimky.MissingStlpecAnnotationException;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ObjectReflector {

    public static <T> boolean isTable(Class<T> clazz) {
       return clazz.isAnnotationPresent(Tabulka.class);
    }

    public static <T> String getTableName(Class<T> clazz) {
        // ziskanie anotacie z objektu Osoba
        return clazz.getAnnotation(Tabulka.class).value();
    }

    public static <T> List<String> getColumnNames(Class<T> clazz) {
        List<String> stlpce = new ArrayList<>();
        for (Field f : clazz.getDeclaredFields()){
            // ziskanie vsetkych privatnch Fieldov
            if (f.isAnnotationPresent(Stlpec.class)){
                // ak anotacia existuje vytiahne anotaciu Stlpec
                // ziskkanie nazvov zo Stlca tabulky Table ID, NAME, SURNAME, AGE, ADRESS
                Stlpec stlpec = f.getAnnotation(Stlpec.class);
                stlpce.add(stlpec.value()); // pri do zoznamu nazvy stlca
                System.out.println("Stlpec: " +stlpec.value());
            }

        }
        return stlpce;
    }

    public static <T> String getIdColumnName(Class<T> clazz) {
        // ziskanie nazvu stlpca ktory ma ID
        String idColumnName = null;
        for (Field f : clazz.getDeclaredFields()){
            if (f.isAnnotationPresent(Id.class)){
                if (f.isAnnotationPresent(Stlpec.class)){
                    // ci anotacia Id existuje a aj Stlpec
                    idColumnName = f.getAnnotation(Stlpec.class).value();
                }else{
                    throw new MissingStlpecAnnotationException("Pri hladani ID sa nenasiel stlpecoanotovany ako Stlpec");

                }
            }
        }
        if (idColumnName ==null)
            throw new MissingIdException("Chyba anotacia Id v entite "+clazz.getName());

        return idColumnName;
    }

    public static <T> T getFilledData(ResultSet resultSet, Class<T> clazz) throws Exception {
        // naplna data do Objektu
        T object =null;
        // vytvorenie instancie pomocou reflexie
        object = clazz.newInstance();

        for (Field field : object.getClass().getDeclaredFields()){
            // vsetky Fieldy, vratane privatnych
            field.setAccessible(true); // mozeme upravovat privatny Field
            // podmienka ktora zisti či ma anotacia stlpec
            if(field.isAnnotationPresent(Stlpec.class)){
                // zistenie akeho je typu (String, int, Long...)
                String typElementu = field.getType().getName();
                // vyberie nazov stlpcu cez value
                String nazovStlpca = field.getAnnotation(Stlpec.class).value();
                // podmienky aby vybralo prislusny typ (ak je String bude String a aj ostatne tak)
                if(typElementu.equals(String.class.getName())){
                    // nasetuje string
                    field.set(object, resultSet.getString(nazovStlpca));
                }else if(typElementu.equals(Long.class.getName())){
                    // nasetuj Long
                    field.set(object, resultSet.getLong(nazovStlpca));
                }else if (typElementu.equals(Integer.class.getName())){
                    // nasetuje Integer
                    field.set(object, resultSet.getInt(nazovStlpca));
                }
            }
        }
    return object;
    }
}
