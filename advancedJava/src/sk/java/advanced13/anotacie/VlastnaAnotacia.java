package sk.java.advanced13.anotacie;

// Priklad vlastnej anotacie Anotacia.java

@Author(
        name = {"Michal Bella","Autor druhy", "Autor Treti"},
        date = "17/09/2018",
        vek = 25
)
// anotacia s value() tj len s jednou hodnotou
@OneValueAnotation("Jedna hodnota bez nazvu len s hodnotou")

// anotacia ktora  sa opakuje pomocou kontajneru Cars a anotacie Car
@Car(nazov = "Audi")
@Car(nazov = "Mazda")
public class VlastnaAnotacia {
    public static void main(String[] args) {

    }

}
