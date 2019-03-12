package collectionsHW;

import sk.michal.object.Osoba;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CollectionMain {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> nameList = new ArrayList<>();
    private static List<String> nameList2 = new ArrayList<>();
    private static Collection<String> collList = new HashSet<>();
    private static Map<Integer,String> nameMap = new HashMap<>();


    public static void main(String[] args) {
        importNamesList();
        importNameMap();
        tasksMenu();
        scanner.close();
    }

    private static void importNameMap() {
        int i = 0;
        for (String name : nameList){
            nameMap.put(i++,name);
        }
    }

    private static void importNamesList() {
        nameList.add("Adam");
        nameList.add("Barano");
        nameList.add("Zdenda");
        nameList.add("Xenia");
        nameList.add("Livia");
        nameList.add("Hugo");

        nameList2.add("Abraham");
        nameList2.add("Barabias");
        nameList2.add("Izachias");


        collList.add("aaa");
        collList.add("bbb");
        collList.add("ccc");
        collList.add("ddd");


    }

    private static void tasksMenu() {
        while (true){
            System.out.println("vyberte si ulohu od 1 do 15 \n " +
                    "q - Quit");
            String line = scanner.nextLine();
            if(line.matches("[1-9]||1[0-5]")){
                tasksSwitch(Integer.parseInt(line));
            }else if(line.matches("[qQ]")){
                System.out.println("Quit");
                break;
            }else {
                System.out.println("Zadali ste zlu moznost \n");
            }
        }
    }

    private static void tasksSwitch(int number) {
        switch (number){
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
//                String[] names = {"Adam","Brano","Hugo","Xena","Fero"}; ???
                System.out.println(task4(nameMap,"Xenia"));
                break;
            case 5:
                task5();
                break;
            case 6:
                task6();
                break;
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
            case 11:
                task11();
                break;
            case 12:
                task12(111);
                break;
            case 13:
                task13();
                break;
            case 14:
                task14();
                break;
            case 15:
                // neviem ci som spravne pochopil zadanie
                task15(collList);
                task15(nameList);
                break;
        }
    }

    private static void task15(Collection<String> collection) {
//        System.out.println(collection.toString());
        for(String text :collection){
            System.out.println(text);
        }
        System.out.println("\n ------ \n");
    }

    private static void task14() {
        Path path = Paths.get("src\\collectionsHW\\persons.txt");
        Scanner textScanner = null;
        try {
            textScanner = new Scanner(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        textScanner.useDelimiter(System.lineSeparator());
        List<String> list = new ArrayList<>();
        int i = 0;
        while (textScanner.hasNext()){
            String line = textScanner.next();
            list.add(line);
        }
        for (String name : list){
            System.out.println(name);
        }
        textScanner.close();
    }

    private static void task13() {
        Map<Integer,Osoba> map = task11();
        System.out.println("--------");
        List<Osoba> osoba = new ArrayList<Osoba>(map.values());
        for(int i = 0; i<osoba.size(); i++) {
            System.out.println(osoba.get(i).toString());
        }
    }

    private static void task12(int number) {
        Map<Integer,Osoba> map = task11();
         if(map.get(number) == null){
             System.out.println("Nie je priradena osoba k indexu");
         }else {
             System.out.println("Je priradena osoba k indexu");
         }
     }

    private static Map<Integer, Osoba> task11() {
        Map<Integer,Osoba> map = new HashMap<>();
        map.put(0,new Osoba("Jano", "Kano",19));
        map.put(1,new Osoba("Jaro", "Kano",39));
        map.put(2,new Osoba("Palo", "Onak",29));
        map.put(3,new Osoba("Juro", "Onak",49));
        for(int i = 0; i<map.size(); i++) {
            System.out.println(map.get(i).toString());
        }
        return map;
    }

    private static void task10() {
        for (int i = 0; i < nameList.size() ; i++){
            System.out.println(nameList.get(i));
        }
    }

    private static void task9() {
        List<String> emptyList = new ArrayList<>();
        System.out.println(emptyList.isEmpty());
    }

    private static void task8() {
        task1();
        System.out.println("---------");
        Collections.swap(nameList,0,2);
        task1();
    }

    private static void task7() {
        nameList.addAll(nameList2);
        task1();
    }

    private static void task6() {
        task1();
        System.out.println("------------\n sort \n");
        Collections.sort(nameList);
        task1();
    }

    private static void task5() {
        System.out.println(nameMap.get(task4(nameMap,"XeniaX")));
    }

    private static Integer task4(Map<Integer,String> names,String name) {
        for (Map.Entry<Integer,String> m : names.entrySet()) {
            if(m.getValue() == name){
                return m.getKey();
            }
        }
        return null;
    }

    private static void task3() {
        System.out.println(nameMap.get(1));
        nameMap.replace(1,"Novota");
        System.out.println(nameMap.get(1));
    }

    private static void task2() {
        nameList.add(0,"Gustav");
        task1();
    }

    private static void task1() {
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
