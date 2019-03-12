package sk.java.advanced06.io_streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerStream {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
        // pouziva sa ked nehccem čitat cele riadky ale tokeny
        // token - citanie po kuskoch Meno, priezvisko... (napr: vsetko medzi medzerami)
//        scanner.useDelimiter(","); // oddelovac rokenov pomocou ciarky
        if(scanner.hasNextInt()){
            int i = scanner.nextInt(); // scannovat cisla - integery
            System.out.println(i);
            System.out.println("-------------------------------------------");

        }

        while(scanner.hasNext()){
            // kym vie scanner najsť token, tak bude vypisovat
            System.out.println(scanner.next());
        }
        // default: oddelvac tokenov je na medzeru, vypise kazde slovo pod seba


    }
}
