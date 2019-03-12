package sk.java.advanced12.streamAPI;

import sk.java.advanced01.Osoba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import sk.java.objects.OsobaOptional;
// Vylepsenie ulohy Streamy.java
public class Streamy2 {
    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                null,
                new Osoba("Michal", "Bella2", 25),
                new Osoba("Michal2", "Bella3", 51),
                new Osoba("Michal3", "Bella4", 28),
                new Osoba("Karol", "Beno", 28),
                new Osoba("AAAA", "BBB", 20),
                new Osoba("Michal4", "Bella5", 88)
        );
//        List<Integer> veky = osoby.stream()
//                .filter(osobaLambda -> osobaLambda.getAge() <50) // vypise vsetkych pod 50 rokov
//                .sorted(Comparator.comparing(Osoba::getAge)) // sortovanie podla veku cez MethodReference
//                .map(Osoba::getAge) // premapovanie na zoznam Integerov
//                .collect(Collectors.toList()); // Stream Integerpv sa spravi do Listu
//                // aby sa vypisal treba pred Stream vlozit List Integerov
//                // vypise sa uz len Integery veku ktore su zoradene
//                veky.forEach(System.out::println);
//                 //vrati prvu osobu a ak existuje tak ju vypise
//                osoby.stream().findFirst().ifPresent(System.out::println);
                // treba premapovat aby nehadza NullPointerException
                osoby.stream().map(Optional::ofNullable).findFirst().ifPresent(System.out::println);
                // map(Optional::ofNullable) zabezpeči aj v Optionale ze nebude hadzat NullPointer
    }
}
