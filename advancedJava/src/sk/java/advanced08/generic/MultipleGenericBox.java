package sk.java.advanced08.generic;


import sk.java.advanced01.Osoba;

public class MultipleGenericBox<P,T> {
    // pouzitie dvoch generickych datovych typov
    private P object1;
    private T object2;

    public void add(P object1, T object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    public static void main(String[] args) {
        // prvy genericky box s dvoma parametrami v metode String, Integer

        MultipleGenericBox<String, Integer> multipleGenericBox = new MultipleGenericBox<>();
        multipleGenericBox.add("sdfsf", 45);

        // druhy genericky box s dvoma parametrami v metode Osoba, String

        MultipleGenericBox<Osoba, String> multipleGenericBox1 = new MultipleGenericBox<>();
        multipleGenericBox1.add(new Osoba("Michal", "Bella", 45), "sjkdfskjfd");


    }
}
