package sk.ormFramework.simpleormframework.dbaccess;

import sk.ormFramework.fiktyvnyprogram.entity.Film;
import sk.ormFramework.simpleormframework.reflection.ObjectReflector;
import sk.ormFramework.simpleormframework.sql.SqlBuilder;
import sk.ormFramework.simpleormframework.vynimky.AnnotationMissingException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DBManager {

    // manazer databazy
    public <T> T getEntityByiId(Long id, Class<T> clazz) throws Exception {
        T o = null;

        if (id == null){
            throw new IllegalArgumentException("id nemoze byt prazdne");
        }

        // podmienka či je to tabulka
        if(!ObjectReflector.isTable(clazz)){
            // ak neni tabulka vyhodi vlastnu vynimku
            throw new AnnotationMissingException("Objekt nema anotaciu tabulky");
        }else{
            System.out.println("is table "+clazz.getName());
        }

        // nacitat data z DB
        ResultSet resultSet = loadData(id, clazz);
        System.out.println(resultSet.getString("ADRESS"));
        // nasetovat na objekt

        o = ObjectReflector.getFilledData(resultSet,clazz);
        return o;
    }

    private <T> ResultSet loadData(Long id, Class<T> clazz) throws Exception {
        String tableName = ObjectReflector.getTableName(clazz);
        // nazvy stlpcov
        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);
        // zistime IDečka
        String idColumnName = ObjectReflector.getIdColumnName(clazz);

        String query = SqlBuilder.buildQuery(id, tableName, idColumnName, tableColumns);
        System.out.println(query);

        // ulozenie do fiktivnej databazy
        DatabaseAccess databaseAccess = null;
        ResultSet rs = null;
        try {
            databaseAccess = new DatabaseAccess();
            rs = databaseAccess.executeQuery(query);
            databaseAccess.commit();
        }catch (Exception e){
            if (databaseAccess!= null){
                databaseAccess.rollBack();
            }
            throw new Exception(e);
        }finally {
            if (databaseAccess!=null){
                databaseAccess.disconnect();
            }
        }

        return rs;

    }
    // INSERT do DB - vlozenie nasetovanych dat do databazy

    public <T> void insertEntity(T object) {
//        Class<?> clazz = object.getClass();
//        String tableName = ObjectReflector.getTableName(clazz);
//        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);
//        Map<String,Object> data = ObjectReflector.getObjectData(clazz);
//        String query = SqlBuilder.builtInsertQuery(tableColumns, tableColumns, data);
//        DatabaseAccess databaseAccess = new DatabaseAccess();
//        databaseAccess .insert(query);

        // insert into MOVIE (REZISER, HLAVNA_ULOHA, ID) VALUES ('', '', 0);

        Class<?> clazz = object.getClass();
        String tableName = ObjectReflector.getTableName(clazz);
        List<String> tableColumns = ObjectReflector.getColumnNames(clazz);

    }
}
