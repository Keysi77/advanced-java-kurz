package sk.java.advanced06.io_streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamUlohy {
    /*
1. úloha: Napíš program, ktorý prečíta jednoduchý textový súbor a vypíše jeho text na konzolu.

2. úloha: Napíš program, ktorý k textovému súboru pridá ďalší riadok.

3. úloha: Napíš program, ktorý nájde najdlhšie slovo z textového súboru a vypíše ho na konzolu.

4. úloha: Napíš program, ktorý vypíše veľkosť súboru na konzolu.

5. úloha: Napíš metódu. Vstupom metódy bude String predstavujúci cestu k súboru. Metóda zistí, či je daný String súbor alebo priečinok. Na konzolu vypíš názov súboru alebo priečinku.

6. úloha: Napíš program, ktorému zadáš cestu na priečinok. Program vypíše názvy všetkých súborov priamo v danom priečinku.

7. úloha: Napíš metódu, ktorá zmaže súbor na základe zadaného Stringu, ktorý ako hodnotu má cestu k súboru.

8. úloha: Napíš program, ktorý skopíruje súbor z jedného priečinku do druhého.

9. úloha: Napíš metódu, ktorej vstupom bude názov súboru. Napríklad text.txt. Metóda vytvorí nový súbor s týmto názvom.

10. úloha: Modifikuj úlohu 9. Metóda vráti plnú cestu na tento súbor.
     */
    public static void main(String[] args) throws IOException {
        //uloha1("resources/text.txt");
        //uloha1_v2();
        uloha2_v2();
    }


    static void uloha1(String s) { // metoda vypise obsah suboru na konzolu. ako parameter berie String s cestou k suboru.

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(s));

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void uloha1_v2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }

    public static void uloha2_v2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("resources/text.txt"));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine()+"sdfsdfsdf");
        }
    }
}
