package sk.ormFramework.fiktyvnyprogram;

import sk.ormFramework.fiktyvnyprogram.entity.Film;
import sk.ormFramework.fiktyvnyprogram.entity.Osoba;
import sk.ormFramework.simpleormframework.dbaccess.DBManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        DBManager dbManager = new DBManager();
        // osoba je table lebo ma anotaciu Table takze podmienka funguje
        Osoba osoba = dbManager.getEntityByiId(0L, Osoba.class);
        Film f = dbManager.getEntityByiId(0L, Film.class); // vytvori select

        // pomocny vypis ze vypise z Osoby udaje
        System.out.println(Osoba.getId());
        System.out.println(Osoba.getMeno());
        System.out.println(Osoba.getPriezvisko());
        System.out.println(Osoba.getVek());
        System.out.println(Osoba.getAdresa());


        // do Databazy
        Film film = new Film();
        film.setNazov("Blade");
        film.setReziser("Blade2");
        film.setvHlavnejUlohe("Whesley Snipers");
        dbManager.insertEntity(film);


    }
}
