package sk.java.advanced11.lambda;
// referencia na metodu - alternativa napisania lambda vyrazu


import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {
        // pouzite ako lambda vyraz
        //doSomething("Michal", a-> System.out.println(a));

        // replacnute referenciou na metodu
        doSomething("Michal", System.out::println);

        //zavolame pomocnu triedu UtilClass
        summIt(5,10, MethodReferenceUtilClass::sumIt);
    }

    private static void summIt(int a, int b, BiConsumer<Integer, Integer> biConsumer) {
        // Biconsumer vrati dva objekty v tomto pripade integery
        biConsumer.accept(a,b);
    }

    private static<T> void doSomething(T item, Consumer<T> consumer) {
        consumer.accept(item);
    }

}
