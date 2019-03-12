package sk.java.advanced12.streamAPI;


import sk.java.objects.OsobaOptional;
// ako pracovat ak v objekte pride NULL

public class OptionalExample {
    public static void main(String[] args) {
        realLife();
    }

    private static void realLife() {
        OsobaOptional o = new OsobaOptional("Michal",  null, 30);

        o.getSurname().ifPresent(System.out::println);
        o.getSurname().ifPresent(sr -> System.out.println(sr.toUpperCase()));
    }
}
