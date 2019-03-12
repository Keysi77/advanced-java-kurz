package sk.java.advanced09.Interfaces;

public interface DefaultMethodInteface {
    void zastav();
    void pohniSa();

    default void chodSam(){
        // default metoda ma pristup len k svojim premennym vo vnutry metody k inym NIE
        // default metosa sa neda overridnuť
        int i = 0;
        System.out.println("z DefaultMethodInteface");
    }
}
