package sk.java.advanced07.kolekcie;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    // Sety neobsahuju duplicitne elementy (nemoze ich obsahovat)
    // hashset neuchovava poradie v akom boli elementy ulozene
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        String s = "string";
        set1.add("element1");
        set1.add("element2");
        set1.add("element3");
        set1.add("element4");
        set1.add(s);

        System.out.println(set1.contains("string"));
        // pouzietie Iteratora - to iste ako v metode pomocou foru
        Iterator i = set1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("--------------------------------------");

        Set<String> set2 = new HashSet<>();
        set2.add("element3");
        set2.add("element4");
        set2.add("element5");
        set2.add("element6");

        // sopytame sa či su vsetky leemnety zo set1 aj v set2
        System.out.println("Contains all: ");
        System.out.println(set1.containsAll(set2));
        printSet(set1);
        printSet(set2);
        System.out.println("--------------------------------------");

        // vymaze vsetky zhodne elementy zo setu1 a set2
        System.out.println("Remove all: ");
        System.out.println(set1.removeAll(set2));
        printSet(set1);
        printSet(set2);
        System.out.println("--------------------------------------");

        // vsetko zo set2 prida do  set1 (okrem zhodnych !!! )
        System.out.println("Add all: ");
        System.out.println(set1.addAll(set2));
        printSet(set1);
        printSet(set2);
        System.out.println("--------------------------------------");

        // zoberie elementy zo set1 a set2 a vypie len tie ktore su zhodne

        System.out.println("retain all: ");
        System.out.println(set1.retainAll(set2));
        printSet(set1);
        printSet(set2);
        System.out.println("--------------------------------------");

    }

    private static void printSet(Set<String> set){
        System.out.println("set: ");
        for (String s : set){
            System.out.println(s);
        }
    }
}
