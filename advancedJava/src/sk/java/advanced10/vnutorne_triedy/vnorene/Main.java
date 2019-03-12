package sk.java.advanced10.vnutorne_triedy.vnorene;

public class Main {
    public static void main(String[] args) {
        Hrac hrac = new Hrac(10);
        // isntancia triedy Hrac a triedy ktora je v nej vnorena SkoreHraca
        Hrac.SkoreHraca skoreHraca = hrac.new SkoreHraca(10);
    }
}
