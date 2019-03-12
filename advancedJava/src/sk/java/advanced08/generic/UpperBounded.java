package sk.java.advanced08.generic;

import java.util.List;

public class UpperBounded {

    public static void main(String[] args) {

    }
    // metoda pre scitanie objektov pomocou GENERIKY
    // nemusime pouzit tento zapis:
    //public static <P extends Number> double sumOfList(List<P> list){

    // ale pouzijeme tento? ze ocakavame nejaky obejkt
    // ? je wildcard ktory extenduje Number
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        // program vie pouzit vsetky dostupne metody z tiredy Number
        for (Number elem : list){
            s+= elem.doubleValue();
        }
        return s;
        // nemozno vkladať, pouziva sa len ked z kolekcie niečo 'vytahujem'

    }
}
