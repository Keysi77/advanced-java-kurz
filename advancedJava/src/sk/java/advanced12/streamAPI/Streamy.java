package sk.java.advanced12.streamAPI;

import sk.java.advanced01.Osoba;

import java.util.Arrays;
import java.util.List;

public class Streamy {
    public static void main(String[] args) {
        //  kolekcia
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Michal", "Bella2", 25),
                new Osoba("Michal2", "Bella3", 51),
                new Osoba("Michal3", "Bella4", 28),
                new Osoba("Michal4", "Bella5", 88)
        );
        // zobrat osoby pod 50 rokov a vypisat ich na konzolu (po starom dva cykly)
        // Ak pouzijeme Stream tak stači jeden univerzalny cyklus, ktory bude obsluhovat svetky metofdy

        osoby.stream()
                // pomocou Predicate() vrati true/false
                .filter(osobaLambda -> osobaLambda.getAge()<50) //vypise len osoby pod 50 rokov
                .distinct() // vracia znova stream
                .forEach(System.out::println);
                // ukončovak, vysledok ale nieje stream uz
    }
}
