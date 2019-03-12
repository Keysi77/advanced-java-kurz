package sk.java.advanced13.anotacie;
// od Java 8 mozeme pouzit anotaciu ktora sa viac krat opakuje s inmi hodnotami

import java.lang.annotation.Repeatable;

// ze sa moze dana anotacia opakovat
@Repeatable(Cars.class)
public @interface Car {
    // treba vytvorit kontajner -> Cars
    String nazov();
}
