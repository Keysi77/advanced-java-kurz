package sk.lukas.kontakty;
import java.util.Scanner;

public class Kontakt {
    private String meno;
    private String telefon;
    private String mobil;
    private String email;

    public Kontakt (String me, String te, String mo, String em){
        meno=me+"; ";
        telefon=te+"; ";
        mobil=mo+"; ";
        email=em;
    }

    public static Kontakt kontaktZKonzoly (String s) {  //vytvori kontakt z udajov zadanych do konzoly

        s = s.replace("add contact ", "");

        String[] zaznamy = new String[4];
        for (int i=0; i<3; i++){
            zaznamy[i] = s.substring(0,s.indexOf(';'));
            s= s.substring(s.indexOf(';')+1);
            //System.out.println("index i: " + i + " "+ zaznamy[i]);
        }
        zaznamy[3]=s;

        return new Kontakt(zaznamy[0], zaznamy[1], zaznamy[2], zaznamy[3] );
    }

    public static Kontakt vytvorKontakt(){  // vytvori kontakt - ziada udaje zadat do konzoly
        Scanner s = new Scanner(System.in);

        System.out.println("****vytvaram novy kontakt ***");
        System.out.print("zadaj meno: ");
        String meno = s.nextLine();

        System.out.print("zadaj telefon: ");
        String tel = s.nextLine();

        System.out.print("zadaj mobil: ");
        String mob = s.nextLine();

        System.out.print("zadaj email: ");
        String mail = s.nextLine();

        return new Kontakt(meno, tel, mob, mail);
    }


    public String getMeno() {
        return meno;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getMobil() {
        return mobil;
    }

    public String getEmail() {
        return email;
    }
}
