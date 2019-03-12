public class Cisla {

    public static void nasobenie (Number n) {
        Double d=0.0;
        int i = 0;

        if (n instanceof Double) {
            d = (Double) n;
            d=d*10;
            System.out.println(d);
        }

        if (n instanceof Integer) {
            i = (Integer) n;
            i=i*10;
            System.out.println(i);
        }



    }

    public static void main(String[] args) {
        nasobenie (11.1);
        nasobenie (9);


    }
}
