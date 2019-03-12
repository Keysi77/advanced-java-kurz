package sk.java.advanced06.io_streamy;

public class Varargs {
    // Varargs su premenne ktore moze metoda obsahovat
    // moze obsahovat 0 az n premennych
    // zapis metoda(typ ... options)

    public static void main(String[] args) {
        int max = max("sadfa",1,2,3,10,0,15,17,100,1597,-4567);
        System.out.println(max);
        System.out.println(max("jaro"));
    }

    private static int max(String s, int... values) {
        // do tejto metody moze prisť 0 až n atributov typu int
        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
