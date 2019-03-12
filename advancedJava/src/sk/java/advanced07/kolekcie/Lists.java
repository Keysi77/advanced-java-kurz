package sk.java.advanced07.kolekcie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {
    // Uchovava poradie elementov
    // su pristupne pomocou indexu
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add("list5");

        System.out.println(list.get(list.size()-1)); // posledny element
        System.out.println(list.isEmpty()); // ci je prazdny alebo nie
        list.add(2,"sdf");
        list.remove(3);
        // Trieda Collections

        Collections.sort(list); // utriedeny zoznam
        Collections.shuffle(list); // nahodnym sposobom pomiesa
        Collections.reverse(list); // reverzne obrati elementy v liste
        Collections.rotate(list,2);// od elementu 2 sa pomiesaju dalsie elementy
        Collections.swap(list,0,1); // prehodi nulty element za prvy
        Collections.replaceAll(list,"list4","new list4"); // element "list4" vymeni za novy element
        Collections.fill(list,"jaro"); // vypln objektom

    }

}
