package sk.java.advanced02.numbers;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class CharactersAndStrings {
    public static void main(String[] args) {
        // charactersPriklady();
        formatovanie();

    }
    private static void charactersPriklady(){
        char ch ='a';
        char charArray[] = {'a','b','c'};
        for (char characters : charArray) {
            System.out.println(characters);
        }
        // alebo pole Charov mozeme dat do Stringu
        String s = new String(charArray);
        System.out.println(s);


        Character ch2 = ch;
        ch = ch2;

        // operacie s objektom Character
        System.out.println("Char " +ch);
        System.out.println("isletter " +Character.isLetter(ch));
        System.out.println("isdigit " +Character.isDigit(ch));
        System.out.println("iswhitespace " +Character.isWhitespace(ch));
        System.out.println("isupperCase " +Character.isUpperCase(ch));
        System.out.println("islowerCase " +Character.isLowerCase(ch));
        System.out.println("toUpperCase " +Character.toUpperCase(ch));
        System.out.println("toLowerCase " +Character.toLowerCase(ch));
        System.out.println("toString " +Character.toString(ch));
        System.out.println("----------------------------------");

        // Escapy znakov
        System.out.println("Some \t nice text. tab");
        System.out.println("Some \b nice text. backspace");
        System.out.println("Some \n nice text. new line");

        System.out.println("Some \r nice text. new carriage return");

        System.out.println("Some \" nice text. uvodzovka");
        System.out.println("Some \\ nice text. lomitko");
        System.out.println("----------------------------------");

        int i = 0;
        String s1 = ""+i;
        System.out.println(s1); // prevedie na String a spravi toString preto to funguje
        // Substing

        String substring = "michal bella";
        System.out.println("dlzka je " + substring.length());
        System.out.println("10ty znak je: "+substring.charAt(5));
        System.out.println("Substring znakov od 1 do 3 je: " +substring.substring(1,3));

        // metoddy na porovnavanie
        System.out.println("----------------------------------");
        System.out.println(substring.indexOf(' '));
        System.out.println(substring.indexOf("bella"));
        System.out.println(substring.lastIndexOf("a"));
        System.out.println(substring.contains("michal"));
        System.out.println(substring.equals("bella"));
        System.out.println(substring.equalsIgnoreCase("MiChaL bella")); // ignoruje velke/male pismena

        // metody na nahradczanie Stringov (replace)
        System.out.println("----------------------------------");
        System.out.println(substring.replace("m", "M"));
        System.out.println(substring.replace('m', 'M'));
        System.out.println(substring.replaceAll("a", "A"));
        String text = "Michal ma 25 rokov a 199 centimetrov";
        System.out.println(text.replaceAll("[0-9]", "?")); // vsetky cisla za otazniky
        System.out.println(text.replaceFirst("[0-9]", "?"));

        // formatovanie retazcvo v2 - printf pre formatovanie stringov


    }
    private static void formatovanie(){

        System.out.println("----------------------------------");
        String meno = "Michal";
        //String s2 = String.format("%b", true); // %b je text
        System.out.printf("%b %n", true);
        System.out.printf("%b %n", meno);
        System.out.printf("%c %n", 'm'); // %c je character
        System.out.printf("%d %n", 10); // %d je integer
        System.out.printf("%f %n", 10.15); // float
        System.out.printf("a%nb %n"); // novy riadok
        System.out.printf("V roku %d %s robil java kurz %f %n" , 2017,"jaro", 2.5);

        // pokrocile formatovanie
        // https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
        Calendar calendar = Calendar.getInstance(Locale.forLanguageTag("sk_SK"));
        //String s = String.format("Narodeniny ma:  %$1TD %$1TB  %$1TY ", calendar); // TB - den, TB mesiac, TY rok
        // 1 preto lebo vstupuje len jeden parameter calendar
        System.out.printf("%2$s ma: %d rokov %n",10, "Jaro"); // odkazujem sa na druhy parameter (jaro)

    }

}
