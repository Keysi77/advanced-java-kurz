package sk.java.advanced11.lambda;

public class HelloWorld {
    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();

        helloWorld.hello2(helloWorld.new HelloWorldC());
        // vlozi sa do tela lambda
        helloWorld.hello2( () -> System.out.println("Hello WOrld LAMBDA"));
    }


    public void hello(){
        System.out.println("Hello World");
    }
    // ako LAMBDA - bude prijimať v sebe mieso argumentu rozhranie
    // do metody sa podsunulo 'spravanie' ako argument
    // vlozenie bloku kodu do premennej ktora sa bude dať niekde vlozit
    /*
    // nepotrebuje public, void ani nazov metody - vsetko ide cez nazov premennej a telo

        nazovPremennej = () -> {
            // kod
            // viac riadkov
        }

        nazovPremennej = () -> // kod, jeden riadok

     */

    public void hello2(HelloWOrldFunctions helloWOrldFunctions){
        helloWOrldFunctions.sayHello();

    }


    class HelloWorldC implements HelloWOrldFunctions{
        @Override
        public void sayHello() {
            System.out.println("Hello WORLD 2");
        }
    }
}
