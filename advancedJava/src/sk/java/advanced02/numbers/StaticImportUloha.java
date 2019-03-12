package sk.java.advanced02.numbers;

import static java.lang.Math.ceil;
/*
Napíš metódu, ktorá na vstupe bude prijímať desatinné číslo a na výstupe bude vracať toto
číslo zaokrúhlené nahor. Vo vnútri použi metódu z triedy Math, ktorú si staticky importneš
a potom ju budeš používať bez toho aby si zavolal Math.nazvoMetody() ale len nazovMetody().
 */
public class StaticImportUloha {
    public static void main(String[] args) {
        staticUloha();
        System.out.println(zaokruhlit (10.1));
    }

    public static void staticUloha(){
        double d = 12.5;
        d = ceil(d);
        System.out.println(d);
    }

    public static double zaokruhlit (double d){ // spravna verzia
        return ceil(d);
    }

}




