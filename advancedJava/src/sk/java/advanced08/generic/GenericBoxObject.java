package sk.java.advanced08.generic;
// <P> predstavuje generiku - mozu sa pouzit aj viacere <E,T,U ...>

public class GenericBoxObject<P> {
    private P object;
    // Generika P je niečo ako Object ale mozno pouzivat pre viacero datovych typov bez
    // nutnosti pretypovania ClassCastu

    public void addObject(P object){ this.object = object;}

    public P getObject(){return object;}

    public static void main(String[] args) {
        // generic ako String
        GenericBoxObject<String> stringGenericBoxObject = new GenericBoxObject<>();
        stringGenericBoxObject.addObject("45");

        String s = stringGenericBoxObject.getObject();

        // Generic ako Integer
        GenericBoxObject<Integer> integerGenericBoxObject = new GenericBoxObject<>();
        integerGenericBoxObject.addObject(45);

        Integer i = integerGenericBoxObject.getObject();

        // mozeme pouzit aj ako String aj ako Integer
        System.out.println("Generic ako String: "+ s);
        System.out.println("Generic ako Integer: "+ i);
    }

}
