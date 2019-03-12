package sk.java.advanced06.io_streamy;

import java.io.Serializable;

public class OsobaObject implements Serializable {
    // implementovat Serializable aby sme ju mohli serializabloavat

    private static final long serialVersionUID = 1L;
    // serialVersionUID predstavuje verziu Objektu 1L
    private String meno;
    private String priezvisko;
    transient private int vek;
    // transient znamena ze ho nechceme ukladat

    public OsobaObject(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public static void vypis(){
        System.out.println("ahoj som staticka");
    }

    @Override
    public String toString() {
        return "OsobaObject{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }
}
