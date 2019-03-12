package sk.java.advanced12.streamAPI;

import sk.java.advanced01.Osoba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenerovanieStream {
    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Michal", "Bella2", 25),
                new Osoba("Michal2", "Bella3", 51),
                new Osoba("Michal3", "Bella4", 28),
                new Osoba("Karol", "Beno", 28),
                new Osoba("AAAA", "BBB", 20),
                new Osoba("Michal4", "Bella5", 88)
        );
        // Sposoby generovania Streamov
      //  osoby.stream();
        // musi sa pretypovat na Int cez mapToInt(), aby bola spristupnena funkcia sum();
        System.out.println(osoby.stream().mapToInt(Osoba::getAge).sum());
        //Arrays.stream();
        //Stream.of("string: ", "text");
    }
}
