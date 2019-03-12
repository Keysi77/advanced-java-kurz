package sk.java.advanced08.generic;
// Typova inferencia: mechanizmus ktorym JAVA zistuje aky typ ma pouzit


import java.io.Serializable;
import java.util.ArrayList;

public class Inferencia {

    static <T> T pick(T a1, T a2){return a1;}

    public static void main(String[] args) {
       Serializable serializable =  pick("prvy parameter", new ArrayList<>());
       // String a ArrayList budu fungovat lebo obe implementuju rozhranie Serializable
        // pick() ma dva parametre typu T
        // inferencie algoritmus zisti ze maju spolocny serializable preto to bude fungovat
        Object object =  pick("prvy parameter", new ArrayList<>());
        // alebo pouzit Object ktory je skoro vsade
    }
}
