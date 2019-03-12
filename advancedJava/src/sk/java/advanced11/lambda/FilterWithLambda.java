package sk.java.advanced11.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Prerobenie ulohy FilterWithoutLambda do Lambdy

public class FilterWithLambda {
    public static void main(String[] args) {
        // zonam miest Arraylist
        List<String> mesta = Arrays.asList("Banská Bystrica", "Prešov", "Levice", "Banská Štiavnica", "Liptovský Mikuláš");

        // Vypise zoznam miest: Vstupy o1 a o2, typ pozna zvnutra metody
        Collections.sort(mesta,(o1, o2)->o1.compareTo(o2));
        System.out.println("------ZOZNAM MIEST PODLA ABECEDY--------------");
        printFilter(mesta, s-> true); // vypise mesta cize sa splni podmienka
        System.out.println("---------MESTA S JEDNYM SLOVOM-----------");
        printFilter(mesta,s -> !s.contains(" ") );   // vstup String s -> metoda ktora sa vykona
        System.out.println("------MESTA, KTORE ZACINAJU NA 'B'--------------");
        printFilter(mesta,s -> s.startsWith("B"));
    }

    // FilterWithoutLambda kde bude spravanie metody
    private static void printFilter(List<String> mesta, FilterWithoutLambda.Filter filter){
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
