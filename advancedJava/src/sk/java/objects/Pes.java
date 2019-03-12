package sk.java.objects;

public class Pes {

    private String meno;

    public Pes(){

    }

    public Pes(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void stekaj(){
        System.out.println("STEKAM !!!");
    }
    @Override
    public String toString() {
        return "Pes{" +
                "meno='" + meno + '\'' +
                '}';
    }
}
