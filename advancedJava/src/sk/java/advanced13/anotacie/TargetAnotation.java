package sk.java.advanced13.anotacie;



import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Target hovori o tom nad cim moze byt dana anotacia pouzita ElementType.TYP_ELEMENTU
@Target(ElementType.TYPE_USE)
// TYPE_USE moze sa pouzivat pred Stringami, Listami, KOnstroktore...
// METHOD - ak pouzijeme anotaciu nad metodou
// LOCAL_VARIABLE - pre lokalne premenne
// CONSTRUCTOR - validna len pre konstruktore
// PACKAGE - pri identifikovani packagu
public @interface TargetAnotation {

}
