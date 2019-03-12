package sk.java.advanced07.kolekcie;

import sk.java.advanced01.Osoba;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorts {
    // premenna (konstanta) pre triedenie podla veku
    private static final Comparator<Osoba> VEK_SORT = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            // stary sposob
            //             return o1.getAge() == o2.getAge() ? 0 :(o1.getAge() < o2.getAge() ? -1 : 1);
            return Integer.compare(o1.getAge(), o2.getAge());
            // porovna veky
        }
    };


    public static void main(String[] args) {
        Osoba[] osobaArray = {
            new Osoba("Jaro", "Beno", 20),
            new Osoba("Michal", "Bella", 25),
            new Osoba("Peter", "Beno", 18),
            new Osoba("Karol", "Slepec", 18)
        };
        // kolekcia osob ako list
        List<Osoba> osoby = Arrays.asList(osobaArray);
        System.out.println(osoby);

        Collections.sort(osoby);
        System.out.println(osoby);
        Collections.sort(osoby, VEK_SORT);
        System.out.println(osoby);

    }
}