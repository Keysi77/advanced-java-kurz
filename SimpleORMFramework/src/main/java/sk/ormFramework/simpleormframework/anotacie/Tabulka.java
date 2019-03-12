package sk.ormFramework.simpleormframework.anotacie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// ma byt dostupna za behu programu
@Retention(RetentionPolicy.RUNTIME)
// ale musi byt dostupna nad Classom
@Target(ElementType.TYPE)
public @interface Tabulka {
    String value(); // nazov tabulky na ktoru mapujem
}
