package sk.java.advanced03.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// REGULARNE VYRAZY
public class Regex {
/*
        {} - pocetnost kolko krat ma byť dana vec najdena
        *  - 0-n krat
        ^ - negacia okrem toho
        + 1-n-krat
        [] - skupina znakov jedno alebo druhe alebo n-te
        ostatne: https://www.learn2code.sk/aplikacia/skupiny#/java-pre-pokrocilych/chapters/14-regularne-vyrazy-3-character-classes-a-character-sety/resources
 */
    public static void main(String[] args) {
        // Patern pre regularne vyrazy
        // - musi obsahovat male alebo velke pismeno od a-z A-Z a male a velke pismeno s ro
//        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z]ro");
//        // Matcher pre porovnanie vyrazov
//        Matcher m = p.matcher("jaro"); //true
//        System.out.println(m.matches());
//        System.out.println("-------------------------------");
//         prehladavanie();
//        boundaryMatchers();
        splitRegex();
    }
    private static void prehladavanie(){
      //  displayResults("9*", "");
        // TRUE - ci prazdny text sedit danemu regularnemu vyrazu (hlada 9, ktora tam je 0 až n-krat)
      //  displayResults("9*", "a a");
        //  displayResults("9[4]", "99");
          // FALSE - či sa nachadza 9tka v texte 4x
        //displayResults("9[4]", "99999999"); // 2x najde
//        displayResults("[abc]{3}", "abcabcccbbbc");
//        displayResults("[abc]{3}", "axbccabaaaccbbbc");

greedyReluctantPossessive();
    }

    private static void displayResults(String pattern, String text){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        boolean found = false;

        while (m.find()){ // bude vypisovať pokial niečo najde
            System.out.println("Našiel som text: "+ m.group());
            // našiel text ktory sedi paternu
            System.out.println("začiatok: " + m.start());
            System.out.println("koniec: " + m.end());
            // začiatok a koniec na indexe
            System.out.println("-------------------------------");
            found = true;
        }
        if(!found){
            System.out.println("nič som nenašiel");
            System.out.println("-------------------------------");
        }
    }

    private static void greedyReluctantPossessive(){
        System.out.println("gready:"); // co najdlhsie vyskyty
        displayResults("foo.*bar","xfooxxbarxxxxfooxbarxxxx");

        System.out.println("reluctant:"); // co najmenšie vyskyty
        displayResults("foo.*?bar","xfooxxbarxxxxfooxbarxxxx");

        System.out.println("possesive:"); // nevracia sa už pri vyhladavani
        displayResults("foo.*+bar","xfooxxbarxxxxfooxbarxxxx");

    }
    private static void boundaryMatchers(){
        displayResults("^hus", "Hus sa hra na pozemku");
        // na zaciatku vety musi byť 'hus' ale je false lebo je s velkym H 'Hus'
        displayResults("^hus", "hus sa hra na pozemku");
        // uz honajde
        displayResults("^[hH]us", "hus sa hra na pozemku");
        // matchne male alebo veke h/H na zaciatku vety
        displayResults("^hus", "Moja hus sa hra na pozemku");
        // nenajde lebo hus neni na zaciatku vety
    }


    private static void splitRegex() {
        String regex = ":";
        String text = "jeden:dva:tri:styri:pat";
        Pattern p = Pattern.compile(regex);
        String[] items = p.split(text);
//        for(String s : items) {
//            System.out.println(s);
//        }

// tam kde matchol cisla tak tie vyhodil a rozdelil cely vyrazz na zvysky
        regex = "\\d";
        text = "jeden4dva7tri9styri1pat";
        p = Pattern.compile(regex);
        items = p.split(text);
        for(String s : items) {
            System.out.println(s);
        }
        String[] s = text.split(regex);
        System.out.println(s.length);

        System.out.println("dfjsafkds".matches("\\w*"));

        //jaro@jaro.sk
        // \w+@\w+\.sk
        // Matchne email - pismena 1x-n krat + zavinac + pismena + .sk
        regex = "\\w+@\\w+\\.sk";
        System.out.println("jaro@jaro.sk".matches(regex)); // true
        System.out.println("jaro@jaro.com".matches(regex)); // false

    }



}
