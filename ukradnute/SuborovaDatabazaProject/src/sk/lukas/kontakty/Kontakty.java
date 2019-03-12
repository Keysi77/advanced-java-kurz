package sk.lukas.kontakty;
import java.io.*;
import java.util.Scanner;


public class Kontakty {
    private static String databasePath = "data/zoznamKontaktov.txt";

    public static void main(String[] args) {
        System.out.println("*** vitaj v databaze kontaktov ***");
        System.out.println("Ovladanie: ");
        System.out.println("p - pridaj novy kontakt , q - ukonci program");
        System.out.println("Prikazy v konzole:");
        System.out.println("list contacts - vypise vsetky zaznamy");
        System.out.println("add contact <meno>; <telefon>; <mobil>; <email> - pridat novy kontakt. ");
        System.out.println("search <meno> - vyhladat kontakt podla mena");
        System.out.println("");

        Scanner s = new Scanner (System.in);
        String input="";

       label:  while (input!="q") {
           System.out.print("zadaj prikaz: ");
           input = s.nextLine();

            switch (input){
                case "p" : pridajKontakt(Kontakt.vytvorKontakt()); break;
                case "list contacts" : vypisKontakty(); break;
                case "q": System.out.println("koniec programu"); break label;
                default: if (input.matches("add contact.*;.*;.*;.*"))  {
                    addKontakt(input);
                } else if (input.matches("search.*")){ vyhladatKontakt(input);}
                else { System.out.println("Niekde sa stala chyba");} break;
            }
        }
    }


    static void vyhladatKontakt (String s) {

        s = s.replace("search ", "");
        s=s+".*";

        File fileToBeModified = new File(databasePath);
        BufferedReader reader = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            int count =1; // cislo riadku, kt. je nacitavany
            String line = reader.readLine();


            while (line != null)
            {
                if(count>3 && line.matches(s)) {
                    System.out.println(line);
                } else { //nerob nic

                }

                count++;
                line = reader.readLine();
            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources

                reader.close();


            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    static void addKontakt (String s) { // prida kontakt do databazy cez prikaz add contact
        pridajKontakt(Kontakt.kontaktZKonzoly(s));

    }


    static void vypisKontakty(){ // prida kontakt a zmeni cislo udavajuce pocet kontaktov



        File fileToBeModified = new File(databasePath);

        //String oldContent = "";

        BufferedReader reader = null;

        //FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of input text file into oldContent

            int count =1; // cislo riadku, kt. je nacitavany
            String line = reader.readLine();


            while (line != null)
            {
                if(count>3) {
                    System.out.println(line);
                } else {

                }

                count++;
                line = reader.readLine();
            }



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources

                reader.close();


            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    static void pridajKontakt (Kontakt k){

        File fileToBeModified = new File(databasePath);

        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));

            //Reading all the lines of input text file into oldContent

            int count =1; // cislo riadku, kt. je nacitavany
            String line = reader.readLine();


            while (line != null)
            {
               if(count!=2) {
                   oldContent = oldContent + line + System.lineSeparator();
               } else {
                   oldContent=oldContent + (Integer.parseInt(line)+1) + System.lineSeparator();
               }

                count++;
                line = reader.readLine();
            }


            oldContent =oldContent+ k.getMeno()+k.getTelefon()+k.getMobil()+k.getEmail() +System.lineSeparator();


            writer = new FileWriter(fileToBeModified);

            writer.write(oldContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources

                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Kontakt bol pridany.");
    }
    }



