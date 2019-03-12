//   VLASTNA ANOTACIA
package sk.java.advanced13.anotacie;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
// ked sa bude vytvarat dokumentacia, aby bola tato anotacia Author v nej zahrnuta

// Obmedzenia v anotaciach:

// Retention - v akom stadiu v nasom programe bude tato anotacia dostupna
@Retention(RetentionPolicy.RUNTIME)
// SOURCE - je dostupna len ked pisem zdrojovy kod, pri kompilovani uz nebude dostupna
// CLASS - len pri nacitavani tried, neni pouzitelna ked uz bezi program
// RUNTIME - len ked program bezi





// VLastna anotacia ktora ma dalsie uz vytvorene anotacie na pracu snou
public @interface Author {
    // hodnoty ktore bude anotacia prijimat
    String[] name(); // pre viacero nazvov (pr: viac autorovo)
    String date();
    // ak tam company nechcem niekedy dat treba dat default
    String company() default "moja kampan";
    // nemozu sa pouzivat objekty napr Osoba osoba(); len primitivne datove typy
    int vek();

}
