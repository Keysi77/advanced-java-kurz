package sk.java.advanced11.lambda;

public class NasobenieLambda {
    public static void main(String[] args) {
        // netreba 'int a' stači len 'a' lebo je uz v Nasob definovany
        Nasob nasobPiatimi = a -> a*5;
        // 5*10
        printNasob(nasobPiatimi);
    }

    interface Nasob{
        int nasobInterface(int a);
    }

    public static void printNasob(Nasob nasobMetoda){
        // bude nasobit desiatimy
        System.out.println(nasobMetoda.nasobInterface(10));

    }
}
