package sk.java.advanced08.generic;

import java.util.ArrayList;
import java.util.List;

public class LoweBounded {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addInteger(list);
        addInteger(list);
        addInteger(list);
    }

    public static void  addInteger(List<? super Integer> list){
      // obmedzenia na 'super' typy - nadradene

        int i = (int) (Math.random()*10);
        System.out.println(i);
        list.add(i);
    }
}
