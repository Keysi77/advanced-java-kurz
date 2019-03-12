package sk.ormFramework.fiktyvnyprogram.entity;

import sk.ormFramework.simpleormframework.anotacie.Id;
import sk.ormFramework.simpleormframework.anotacie.Stlpec;
import sk.ormFramework.simpleormframework.anotacie.Tabulka;

@Tabulka("OSOBA")
public class Osoba {
    @Id
    @Stlpec("ID")
    private static Long id;

    @Stlpec("NAME")
    private static String meno;


    @Stlpec("SURNAME")
    private static String priezvisko;

    @Stlpec("AGE")
    private static Integer vek;

    @Stlpec("ADRESS")
    private static String adresa;

    // getery a setery pre vypis udajov


    public static Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public static String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public static Integer getVek() {
        return vek;
    }

    public void setVek(Integer vek) {
        this.vek = vek;
    }

    public static String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
