package sk.java.advanced02.numbers;
/*
Napíš si metódu, ktorá na vstupe bude prijímať premennú typu Number.
Potom si túto metódu zavolaj dvakrát a vlož do nej raz int a raz Double.
Vo vnútri metódy vynásob toto číslo 10timi a vypíš na konzolu. Naučíš sa
ako pracovať s rôznymi typmi údajov. Úloha je kus náročnejšia. Možno budeš
potrebovať pretypovanie a instanceof.
 */

public class NumbersUloha {

    private static void uloha(Number n) {
        Double d=0.0;
        Integer i=0;

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
        uloha(10);
        uloha(11.23);

    }
}
