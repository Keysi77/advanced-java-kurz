package sk.java.advanced06.io_streamy;

import sk.java.advanced06.io_streamy.OsobaObject;
import java.io.*;
// Pre ukladanie rozpracovanych objektov
// ulozia sa a potom sa mozu nacitat kde boli rozpracovane
public class ObjectStream {

    public static void main(String[] args) {
        OsobaObject o = new OsobaObject("Jaro", "Beno",30);
        // objekt ktory chcem zapisat OsobaObject a do neho meno, priezvisko a vek

        ObjectInput objectInput;
        ObjectOutput objectOutput;

        ObjectInputStream objectInputStream; //readObject
        ObjectOutputStream objectOutputStream; //writeObject

        try{

            FileOutputStream fout = new FileOutputStream("resources/object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            // obalili do ObejctStreamu lebo ideme zapisovat objekty
            oos.writeObject(o);
            oos.close();
            System.out.println("Done!");

        }catch(Exception ex){
            ex.printStackTrace();
        }

        try{

            FileInputStream fin = new FileInputStream("resources/object.txt");
            // nacit ainformacie z object.txt
            ObjectInputStream ois = new ObjectInputStream(fin);
            // obali sa do objektu aby bola spristupnema funkcionalita na pracu s objektami
            OsobaObject osoba = (OsobaObject) ois.readObject();
            ois.close();
            // vypis z Objektu na konzolu
            System.out.println(osoba.getMeno());
            System.out.println(osoba.getPriezvisko());
            System.out.println(osoba.getVek());

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
