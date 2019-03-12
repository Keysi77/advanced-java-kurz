package sk.java.advanced10.vnutorne_triedy.nevnorene;

public class Hrac {
    private SkoreHraca skoreHraca;
    private int bonusHraca;

    public Hrac(int bonusHraca) {
        this.bonusHraca = bonusHraca;
    }

    public void upravSkoreHraca(int oCoUpravSkore){
        this.skoreHraca = new SkoreHraca(oCoUpravSkore+bonusHraca);
    }
}
