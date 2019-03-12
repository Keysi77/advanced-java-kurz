package sk.java.advanced07.kolekcie;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    // Mapa obsahuje hodnoty viazane na kluc - kluc:hodnota
    // kluce musia byt unikatne

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        // key(Integer) : value(String)
        map.put(10,"jaro");
        map.put(1,"fero");
        map.put(1,"fero2");
        map.put(3,"duro");
        map.put(4000,"karol");
        map.put(4000,"peter"); // prepise predchadzajuci element

        System.out.println(map.get(1));
        // FOREACH aky objekt vytahujem : z coho ten objekt vytahujem
        for (Map.Entry m: map.entrySet()){
            System.out.printf("key: %d, value %s %n", m.getKey(), m.getValue());
        }
        System.out.println("------------------------------");
        // Druhy sposob prechadzania po mape
        for (Integer k : map.keySet()){
            System.out.println(map.get(k));
        }
        System.out.println("------------------------------");
        System.out.println(map.values());
        System.out.println(map.containsKey(3)); // ci obsahuje kluc 3
        System.out.println(map.containsValue(3));

    }
}
