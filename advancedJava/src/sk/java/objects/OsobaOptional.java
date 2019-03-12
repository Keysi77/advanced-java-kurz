package sk.java.objects;

import sk.java.advanced01.Osoba;

import java.util.Optional;

public class OsobaOptional implements Comparable<OsobaOptional>{
    private String name;
    private Optional<String> surname; // v uloze OptionExample vyuzity tento druh Optional String
    private int age;
    // String surname aby mohlo prisť hocico (tym padom aj null)
    public OsobaOptional(String name, String surname, int age) {
        this.name = name;
        this.surname = Optional.ofNullable(surname);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getSurname() {
        return surname;
    }

    public void setSurname(Optional<String> surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // import do ulohy StaticImport
    public static void vypis(){
        System.out.println("staticka metoda");
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(OsobaOptional o) {
        // triedenie podla priezviska
        int porovnaniePriezvisk = o.getSurname().orElse(" ").compareTo(this.getSurname().orElse(""));
        return porovnaniePriezvisk !=0 ? porovnaniePriezvisk : o.getName().compareTo(this.getName());
        // ak nieje null vrati porovnanie priezvisk
        // ak sa priezviska rovnali, tak sa bude triediť podla mena
    }
}
