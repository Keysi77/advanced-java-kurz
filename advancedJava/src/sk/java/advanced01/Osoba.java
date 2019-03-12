package sk.java.advanced01;

import sk.java.advanced13.anotacie.TargetAnotation;

import java.sql.Date;

// Skuska advanced13.anotacie -> TargetAnotation
@TargetAnotation
public class Osoba implements Comparable<Osoba> {
    public Date datumNarodenia;
    private String name;
    private String surname;
    private int age;

    public Osoba(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Date getDatumNarodenia() {
        return datumNarodenia;
    }

    public void setDatumNarodenia(Date datumNarodenia) {
        this.datumNarodenia = datumNarodenia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
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
    public int compareTo(Osoba o) {
        // triedenie podla priezviska
        int porovnaniePriezvisk = o.getSurname().compareTo(this.getSurname());
        return porovnaniePriezvisk !=0 ? porovnaniePriezvisk : o.getName().compareTo(this.getName());
        // ak nieje null vrati porovnanie priezvisk
        // ak sa priezviska rovnali, tak sa bude triediť podla mena
    }
}
