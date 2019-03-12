package sk.java.advanced08.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerickeMetody {
    //  metody ktore pouzivaju generika a su pouzite len v danej metode

    private static <T> ArrayList<T> prekloMaNaList  (HashMap<Long, T> collection){
       // Hashmap vstupuje a ten sa preklopi na ArrayList
        ArrayList<T> list = new ArrayList<>();

        for (Long key:collection.keySet()){
            list.add(collection.get(key));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedHashMap<Long, String> stringLinkedHashMap = new LinkedHashMap<>();

        stringArrayList = prekloMaNaList(stringLinkedHashMap);

    }
}
