package genericsHW;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GenericMain {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }



    private static void task1() {
        System.out.println("\n Uloha 1 ");
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setObject(55);
        System.out.println(integerGenericBox.getObject()+5);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setObject("55");
        System.out.println(stringGenericBox.getObject()+5);
    }

    private static void task2() {
        System.out.println("\n Uloha 2 ");
        DoubleBox<Integer,String> doubleBox = new DoubleBox<>();
        doubleBox.setObj2("aaa");
        doubleBox.setObj(66);
        System.out.println(doubleBox.getObj2() + doubleBox.getObj());
    }

    private static void task3() {
        System.out.println("\n Uloha 3 ");
        CollectionMedium<Book> bookCollectionMedium = new CollectionMedium<>();
        bookCollectionMedium.setSetMedium(new Book("Hmla","King",1980));
     //   bookGenericLibrary.setSetMedium(new Osoba("asd","asda",65465));
        System.out.println(bookCollectionMedium.toString());
        CollectionMedium<CD> cdCollectionMedium = new CollectionMedium<>();
        cdCollectionMedium.setSetMedium(new CD("fotky","ja",2014,true));
        System.out.println(cdCollectionMedium);

        System.out.println("-----------\n");
//
//        Medium libraryBook = new Book("Zakladna","Asimov",1951);
//        System.out.println(libraryBook.toString());
//        Medium libraryCD = new CD("Komplikovana", "Polemic",2000,false);
//        System.out.println(libraryCD.toString());

        Library libraryBook = new Library();
        libraryBook.setLibraryList(Collections.singletonList(new Book("Zakladna", "Asimov", 1951)));
        System.out.println(libraryBook.getLibraryList().get(0));

        Library libraryCD = new Library();
        libraryCD.setLibraryList(Collections.singletonList(new CD("Komplikovana", "Polemic", 2000, false)));
        System.out.println(libraryCD.getLibraryList().get(0));
     }

    private static void task4() {
        System.out.println("\n Uloha 4 ");
//        Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            System.out.println("Vyberte z moznosti: \n 1 pridaj tlacitko \n 2 odober tlacitko " +
//                    "\n 3 pridaj formular \n 1 odober formular");
//        }
    }
}
