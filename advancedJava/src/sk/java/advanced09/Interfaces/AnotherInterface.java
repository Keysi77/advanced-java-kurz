package sk.java.advanced09.Interfaces;

public interface AnotherInterface {
    default void chodSam(){
        System.out.println("z AnotherInterface");
    }
}
