package sk.java.advanced12.streamAPI;
// vyhodne ked moze prisť NULL a nemusime robit podmienky
// nestane sa ze bude NullPointerException pocas behu apliakcie
public class Optional {
    public static void main(String[] args) {

        //basicOptional();

        moreOptional();

    }



    private static void moreOptional() {
        java.util.Optional<String> meno = java.util.Optional.of("Jaro");
        java.util.Optional<String> prazdne = java.util.Optional.empty();
        System.out.println("----------POMOOU metody isPresent() a if-else-----------");
        if(meno.isPresent()){            // vracia TRUE ak Optional objekt neni prazdny (neni NULL)
            System.out.println("meno je: "  + meno.get());
        }else{
            System.out.println("NULL");
        }
        System.out.println("----------POMOOU metody ifPresent()-----------");
        meno.ifPresent(m -> System.out.println("Meno je: "+m));
        // nevykona opreciu vo vnutry ak je FALSE
        prazdne.ifPresent(m -> System.out.println("Meno je: "+m));
        // nespusti sa lebo je NULL (empty)
        System.out.println("----------POMOOU metody orElse()-----------");
        System.out.println("meno je: " +meno.orElse("NULL"));
        System.out.println("meno je: " +prazdne.orElse("NULL"));
        // other je hodnota ELSE ak sa nevykona to pred tym
        System.out.println("----------POMOOU metody orElseGet()-----------");
        // orElseGet prijima na vstupe Lambda vyraz
        System.out.println("meno je: "+meno.orElseGet(()->"NULL"));
        System.out.println("meno je: "+prazdne.orElseGet(()->"NULL"));
    }



    private static void basicOptional() {
        java.util.Optional<String> meno = java.util.Optional.of("Jaro");
        String hodnota1 = "daco";
        String hodnota2 = null;

        System.out.println("neprazdnom Optional: " + meno);
        System.out.println("neprazdnom Optional: meno: " + meno.get());
        System.out.println("prazdny Optional: " + java.util.Optional.empty()); // vytvori prazdny optional (ako keby NULL)


        System.out.println("ofNullable na neprazdnom Optional: " + java.util.Optional.ofNullable(hodnota1));
        System.out.println("ofNullable na prazdnom Optional: " + java.util.Optional.ofNullable(hodnota2)); // NULL = Optional.empty()

//        // java.lang.NullPointerException
        System.out.println("ofNullable na neprazdnom Optional: " + java.util.Optional.of(hodnota2));
    }
}
