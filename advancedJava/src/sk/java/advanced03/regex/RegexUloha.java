package sk.java.advanced03.regex;

import java.util.regex.*;
/*
1. úloha: Napíš metódu, ktorá bude akceptovať na vstupe String predstavujúci email. Metóda overí, či je email v správnom formáte. Metóda vráti true ak áno inak false.

2. úloha: Napíš metódu, ktorá overí zložitosť zadaného hesla. Na vstupe metódy bude heslo. Metóda preverí či heslo spĺňa nasledovné kritéria:

minimálne 8 znakov
musí obsahovať aspoň jedno veľké písmeno
musí obsahovať aspoň jedno číslo
3. úloha: Napíš metódu, ktorá overí, či daný String je obrázok = koncovka je jedna z nasledujúcich: .jpg, .png, .jpeg, .bmp

4. úloha: Napíš metódu, ktorá zistí, či daný String má správny tvar dátumu. Uvažuj, že správny tvar je nasledujúci: dd/mm/yyyy. Kde dd je den vo formáte 01 pre prvý deň. Kde mm je mesiac vo formáte 02 pre február. Kde yyyy je rok vo formáte 2018.

5. úloha: Napíš metódu, ktorá pomocou regulárneho výrazu vypíše na konzolu všetky slová začínajúce na veľké písmeno.

6. úloha: Napíš metódu, ktorá pomocou regulárneho výrazu nájde všetky čísla v texte a vypíše ich na konzolu.

 */

public class RegexUloha {

    static String text = "Lorem ipsum dolor 4 sit amet 789, Consectetuer, 12587 adipiscing elit. Aenean et est 54 a dui semper facilisis. Pellentesque placerat elit a Nunc";


    static boolean overmail (String s){

        return s.matches("\\w+@\\w+\\.\\w+") ;
    }

    static boolean overheslo (String s){
        int a=0;
        int b=0;
        int c=0;

        if(s.matches(".{8,}")) {a=1;}
        if(s.matches(".*[A-Z]+.*")){b=1;}
        if(s.matches(".*\\d+.*")){c=1;}

        if ((a+b+c) == 3) {return true;} else {return false;}

    }

    static boolean overobrazok (String s){
        return s.matches (".+\\.(jpg|png|jpge|bmp)");
    }

    static boolean overdatum(String s){

        return s.matches("([012]\\d|3[01])/(0[1-9]|1[012])/\\d{4}");
    }


    static void vypisslova(String s){
        Pattern p = Pattern.compile("[A-Z].*?\\b");
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group());
        }
    }

    static void vypiscisla (String s) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);

    while(m.find()){
        System.out.println(m.group());
    }

}

    public static void main(String[] args) {
        System.out.println("Uloha 1.:");
        System.out.println(overmail("fgdf@gdfg.sk"));

        System.out.println("Uloha 2.:");
        System.out.println(overheslo("hhDDDDD2222"));

        System.out.println("Uloha 3.:");
        System.out.println(overobrazok("bkjbkjbui.png"));

        System.out.println("Uloha 4.:");
        System.out.println(overdatum("01/12/2018"));

        System.out.println("Uloha 5.:");
        vypisslova(text);

        System.out.println("Uloha 6.:");
        vypiscisla(text);

    }
}
