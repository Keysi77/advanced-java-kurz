package sk.java.advanced11.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
// Prerobena uloha FilterWithLambda do Funkcionalnych rozhrani

public class FilterFunctionalInterface {    public static void main(String[] args) {
    // zonam miest Arraylist
    List<String> mesta = Arrays.asList("Banská Bystrica", null, "Prešov", "Levice", "Banská Štiavnica", "Liptovský Mikuláš");
    // vypise chybu pri null osetrene vo wrapperi
    System.out.println("------VYPIS POMOCOU WRAPPER FUNKCIE--------------");
    printFilter(mesta,s-> true, s-> System.out.println(s), wrapperFunction(s-> s.toUpperCase())); // vypise mesta cize sa splni podmienka

    // Vypise zoznam miest: Vstupy o1 a o2, typ pozna zvnutra metody
    Collections.sort(mesta,(o1, o2)->o1.compareTo(o2));
    System.out.println("------ZOZNAM MIEST PODLA ABECEDY--------------");
    printFilter(mesta,s-> true, s-> System.out.println(s), s-> s.toUpperCase()); // vypise mesta cize sa splni podmienka
    System.out.println("---------MESTA S JEDNYM SLOVOM-----------");
    printFilter(mesta,s -> !s.contains(" "),s-> System.out.println(s), s-> s.toLowerCase() );   // vstup String s -> metoda ktora sa vykona
    System.out.println("------MESTA, KTORE ZACINAJU NA 'B'--------------");
    printFilter(mesta,s -> s.startsWith("B"),s-> System.out.println(s), s-> s.replaceAll(" ", "_"));

}

    // Pouzijeme triedu Predicate ktora vracia boolean z objektu
    private static void printFilter(List<String> mesta,
                                    Predicate<String> predicate,
                                    Consumer<String> consumer,
                                    Function<String,String> function)
                                     {
        for(String mesto : mesta){
            // funkcia test testuej či niečo prejde vracia true/false
            if(predicate.test(mesto)){
                // aplikuje v metode accept funkciu apply
                consumer.accept(function.apply(mesto));
            }
        }
    }
    // Osetrenie vynimky v Wrapper metode
    // Metoda, ktora akceptuje Lambda vyraz
    private static Function<String,String> wrapperFunction(Function<String,String> function) {
        return s -> {
            try{
                s= function.apply(s);
            }catch (Exception e){
                System.err.println("error");
            }
            return s;
        }; // koniec lambda vyrazu
    }


}
