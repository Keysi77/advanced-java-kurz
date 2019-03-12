package sk.java.advanced01;

import java.net.Inet4Address;

public class BoxingUnboxing {

    public static void main(String[] args) {
        // primitivne datove typy
        boolean b = true;
        // Wrappery - obalovacie triedy, ktore primitivny datovy typ prezentuju ako Objekt
        Boolean b2;
        char c;
        Character c2;
        byte bt;
        Byte bt2;
        short s;
        Short s2;
        long l;
        Long l2;
        float f;
        Float f2;
        double d;
        Double d2;


        // BOXING z int -> Integer
        Integer i_objekt = new Integer(10); // rovnake ale netreba davat new lebo Java vie ze to ma hned zboxovat
        Integer i_objekt2 = 10; // Zaboxovany integer
        // UNBOXING z Integer -> int
        int i_primitivny = i_objekt; // z Objektu na primitivnu datovu hodnotu

        daco(b); // a tu prijima uz primitivny datovy typ
        System.out.println(i_objekt + i_objekt2 + i_primitivny); // 10 +10 + 10 -> Objekt + Objekt + primitivny datovy typ
        // vyhodou je ze maju v sebe dalsie metody ktore sa mozu pouzivat čo sa nedalo pri primitivnych typoch
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(10,20));
    }

    private static void daco(Object o){ // metoda ktora prijima objekt
        o.toString();
    }
}
