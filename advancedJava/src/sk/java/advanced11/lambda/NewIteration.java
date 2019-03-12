package sk.java.advanced11.lambda;

import sk.java.advanced01.Osoba;

import java.util.Arrays;
import java.util.List;

public class NewIteration {
    public static void main(String[] args) {
        //  kolekcia
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Michal", "Bella2", 25),
                new Osoba("Michal2", "Bella3", 15),
                new Osoba("Michal3", "Bella4", 28),
                new Osoba("Michal4", "Bella5", 48)
        );


        // Stary sposob iterovania
        System.out.println("-----CEZ KLASICKY FOR ------");
        for (int i=0; i< osoby.size(); i++){
            System.out.println(osoby.get(i).getName());
        }

        // sposob cez foreach
        System.out.println("-----CEZ KLASICKY FOREACH ------");
        for(Osoba osoba: osoby){
            System.out.println(osoba.getSurname());
        }

        // NOVY sposob iterovanie pomocou Lambda
        // cez metodu foreach ktora prima Consumer() a ten prima accept()

        System.out.println("-----POMOCOU forEach() metody a Lambdy------");
        osoby.forEach(os->System.out.println(os.getAge()));// java vie ze 'os' = 'osoba'


        // zjednoduseny sposob cez Method Reference - ale vypise vsetko čo je v objekte Osoba

        System.out.println("-----POMOCOU forEach() metody a Lambdy a Method Reference------");
        osoby.forEach(System.out::println);

    }




}
