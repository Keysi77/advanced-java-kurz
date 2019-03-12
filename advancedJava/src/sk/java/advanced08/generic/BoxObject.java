package sk.java.advanced08.generic;

public class BoxObject {
    private Object object;

    public void addObject(Object object){ this.object = object;}

    public Object getObject(){return object;}

    public static void main(String[] args) {
        // NEBUDE FUNGOVAT -> prerobene v triede GenericBoxObject
        BoxObject integerBox = new BoxObject();
        integerBox.addObject("pridat objekt");
        // Integerbox ale pridavam string

        Integer integer = (Integer) integerBox.getObject();
        //  vyberiem objekt a pretypujem ho na integer
        System.out.println(integer);
    }
}
