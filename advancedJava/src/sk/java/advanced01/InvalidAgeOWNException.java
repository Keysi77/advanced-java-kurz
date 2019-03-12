package sk.java.advanced01;

public class InvalidAgeOWNException extends Exception{
    // Trieda pre vlastnu vynimku
    public InvalidAgeOWNException(String message){
        // treba zavolat konstruktor ktory dedime cez super
        // zavolanie konstruktora nadriadenej triedy
        super(message);
    }
}
