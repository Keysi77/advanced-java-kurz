package sk.java.advanced01;

public class OwnExceptionsMain {
    //  VLASTNA VYNIMKA
    public static void main(String[] args) throws InvalidAgeOWNException { // vyhodenie vynimky
        // da sa pouzit aj priama cesta - keby sme mali viac tried s nazvom Osoba
        //sk.java.advanced01.Osoba osoba = new sk.java.advanced01.Osoba("Mikhjk", "Bella", 15 );

        Osoba osoba = new Osoba("Mikhjk", "Bella", 15 );

        // vynimka, ktora ocekuje či ma osoba viac ako 18 rokov
        if (osoba.getAge() < 18){
            // Vlastna vynimka - treba vytvorit na nu triedu
            throw new InvalidAgeOWNException("osoba nieje dospela");
        }else{
            System.out.println(" ma viac ako 18 rokov");
        }
        // vynimka na checker dlzky mena
        if(osoba.getName().length() > 3){
            throw new NoneTooLongOWNException("Meno je priliz dlhe");

        }else{
            System.out.println("Meno je OK");
        }
    }
}
