package sk.java.advanced02.numbers;

// importovanie všetkych statickych členov (aj metod) z urcitej metody napr z Math
import static java.lang.Math.*;
// importovanie metody z triedy Osoba
import static sk.java.advanced01.Osoba.vypis; // import pre metodu z triedy Osoba
public class StaticImport {
    public static void main(String[] args) {
        System.out.println(Math.PI); // ak si ich importneme nemusime pisat Math ale len PI
        System.out.println(PI); // ked je imporovane netreba pisať Math. ...
        vypis(); // vypis statickej metody
    }

}
