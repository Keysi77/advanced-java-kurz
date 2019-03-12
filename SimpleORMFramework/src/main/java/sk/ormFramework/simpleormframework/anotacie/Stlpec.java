package sk.ormFramework.simpleormframework.anotacie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // dostupna na FIELD-och
public @interface Stlpec {
    String value();
}
