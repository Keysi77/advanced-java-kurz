package sk.java.advanced14.reflection;

import sk.java.advanced01.Osoba;

public class Reflexia {

    public static void main(String[] args) {
        // ZISKANIE OPISU TRIEDY CLASS - vieme ziskat vsetky informacie o nej

        Class clazz = "Michal".getClass();

        Osoba osoba = new Osoba("Michal", "Bella", 25);
        clazz = osoba.getClass();

        // ziskanie opisu Osoby
        Class clazz2 = Osoba.class;
        // ziskanie opisu Stringu
        Class clazz3 = String.class;


    }
}
