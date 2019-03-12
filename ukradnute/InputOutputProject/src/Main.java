import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        uloha1("resources/subor.txt");
        uloha2("resources/subor.txt", "Text vlozeny do posledneho riadku suboru");
        uloha3("resources/subor.txt");
        uloha4("resources/subor.txt");
        uloha5("resources/");
        uloha5("resources/subor.txt");
        uloha6("resources/");
        uloha7("resources/logoL2C.png");
        uloha8("resources/priecinok/logoL2C.png", "resources");
        uloha9("text.txt");
        uloha10("text2.txt");

    }


    static void uloha10(String s){ //Modifikuj úlohu 9. Metóda vráti plnú cestu na tento súbor.
        s="resources/"+s;
        Path p = Paths.get(s);

        try {
            if (Files.notExists(p)){ Files.createFile(p);}
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p);

    }

    static void uloha9(String s){ //Napíš metódu, ktorej vstupom bude názov súboru. Napríklad text.txt. Metóda vytvorí nový súbor s týmto názvom.
        s="resources/"+s;
        Path p = Paths.get(s);

        try {
            if (Files.notExists(p)){Files.createFile(p);}
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void uloha8(String pathCopyingFile, String pathTargetDirectory){ // program, kt. skopiruje subor z jedneho priecinka do druheho
        Path pCF = Paths.get(pathCopyingFile);
        Path pTD = Paths.get(pathTargetDirectory);

        if (Files.isRegularFile(pCF) && Files.isDirectory(pTD)){
            try {
                Files.copy(pCF, pTD.resolve(pCF.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    static void uloha7(String path) { // zmaze subor na zaklade zadaneho Stringu, kt. obsahuje cestu k suboru
        Path p = Paths.get(path);
        if (Files.isRegularFile(p)){
            try {
                Files.deleteIfExists(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static void uloha6(String path){ // vypise vsetky subory v danom priecinku
        Path p = Paths.get(path);
        if (Files.isDirectory(p)){
            System.out.println("Vypis vsetkych suborov z priecinka: " +p.getName(p.getNameCount()-1));
            File f = new File(path);
            File [] files = f.listFiles();

            for (File file : files){
                if (!file.isDirectory()){
                    System.out.println(file.getName());
                }

            }
        } else {
            System.out.println("Nezadal si adresu priecinku");
        }


    }

    static void uloha5(String path){ // zisti, ci dana cesta je subor, alebo priecinok
        Path p = Paths.get(path);
        if(Files.isRegularFile(p)){
            System.out.println("Cesta: " + p + " odkazuje na subor s menom: " + p.getFileName());


        } else if (Files.isDirectory(p)){
            System.out.println("Cesta: " + p + " odkazuje na priecinok s menom: " + p.getName(p.getNameCount()-1));
        }

        else {
            System.out.println("Niekde sa stala chyba.");
        }

    }

    static void uloha4 (String path){ //vypise velkost suboru na konzolu
        try {
            BasicFileAttributes atr = Files.readAttributes(Paths.get(path), BasicFileAttributes.class);
            System.out.println("Velkost suboru je: "+atr.size() + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void uloha3(String path){ // najde najdlhsie slovo v textovom subore
        String longest = "";
        String temp ;

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(path));
            scanner.useDelimiter("\\b");

            while (scanner.hasNext()){
                temp =scanner.next();
                if (temp.length()>longest.length()) {longest = temp;}
            }
            System.out.println(longest);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    static void uloha2(String path, String line){ // metoda pridaa String path na koniec textoveho suboru s cestou path

        PrintWriter outputStream =null;

        try {
            outputStream = new PrintWriter(new FileWriter(path, true));
            outputStream.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream!=null) {
                outputStream.close();
            }
        }


    }

    static void uloha1(String s) { // metoda vypise obsah suboru na konzolu. ako parameter berie String s cestou k suboru.

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(s));

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
