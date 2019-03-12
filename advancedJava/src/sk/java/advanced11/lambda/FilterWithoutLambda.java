package sk.java.advanced11.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Komplexnejšia úloha

public class FilterWithoutLambda {

    public static void main(String[] args) {
        // zoznam miest Arraylist
        List<String> mesta = Arrays.asList("Banská Bystrica", "Prešov", "Levice", "Banská Štiavnica", "Liptovský Mikuláš");
        // zotriedenie zoznamu
        Collections.sort(mesta, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // compareTo zoradi mesta podla abecedy
                return o1.compareTo(o2);
            }
        });
        // metoda ktora vypise vsetko zo znamu miest
        printMesta(mesta);
        System.out.println("--------------------");
        printKratkeMesta(mesta);
        System.out.println("--------------------");
        printFilter(mesta, new Filter() {
            @Override
            public boolean odfiltruj(String s) {
                return !s.contains(" ");
                // ak obsahuje medzeru tak sa odfiltruje
            }
        });

        // mozeme volat dynamicky printFilter ale s inou podmienkou
        System.out.println("--------------------");
        printFilter(mesta, new Filter() {
            @Override
            public boolean odfiltruj(String s) {
                return s.startsWith("B");
                // ak zacina pismenom B
            }
        });
    }

    // metoda ktora vypise len tie mesta, ktore sa skladaju len z jedneho slova

    private static void printKratkeMesta(List<String> mesta) {
        for(String mesto : mesta){
            // ak mesto NEobsahuje medzeru tak sa vypise
            if(!mesto.contains(" ")){
                System.out.println(mesto);
            }
        }
    }

    private static void printMesta(List<String> mesta) {
        // pre svetky Stringy mesto v zoname mesta vypiseme dane mesto

        for(String mesto : mesta){
            System.out.println(mesto);
        }
    }

    // FilterWithoutLambda kde bude spravanie metody
    private static void printFilter(List<String> mesta, Filter filter){
        for(String mesto : mesta){
            // ak prejde Filtrom tak odfiltrujem 'mesto'
            if(filter.odfiltruj(mesto)){
                System.out.println(mesto);
            }
        }
    }

    // Interface pre filter
    interface Filter{
        // Funkcionalita filtra
        // ak prejdem cez nejaku podmienku vrati true/false
        boolean odfiltruj(String s); // boolean lebo bude true/false
        // String je vstup, pride tam nejake mesto

    }

}
