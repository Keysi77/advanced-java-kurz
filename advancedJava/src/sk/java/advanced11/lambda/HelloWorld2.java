package sk.java.advanced11.lambda;

public class HelloWorld2 {
    // vlozenie premennej typu lambda do metody

    public void printHelloWorld(ILambdaExamples printHello){
        // v tejto metode zavolame metodu print(), ktora je vytvorena v rozhrani ILambdaExamples
        printHello.print();
    }

    public static void main(String[] args) {
        // treba importnut vytvorene rozhranie ILambdaExamples
        ILambdaExamples printHello = () -> System.out.println("Hello World");
        HelloWorld2 helloWorld2 = new HelloWorld2();
        helloWorld2.printHelloWorld(printHello);
    }
}
