package sk.java.advanced06.io_streamy;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWork {

    public static void main(String[] args) {
        Path path;
//        \home\skuska\text.txt
//        /home/skuska

        Path p = Paths.get("C:\\temp\\daci\\text.txt");
        // vypise informacie o nasej ceste
        System.out.format("toString: %s%n", p.toString());
        System.out.format("getFileName: %s%n", p.getFileName());
        System.out.format("getName(0): %s%n", p.getName(0));
        System.out.format("getNameCount: %d%n", p.getNameCount());
        System.out.format("subpath(0,2): %s%n", p.subpath(0,2));
        System.out.format("getParent: %s%n", p.getParent());
        System.out.format("getRoot: %s%n", p.getRoot());

        // Trieda Files sluzi na manipulaciu s priečinkami  a suborami

        // Try with resources - sluzi na uzatvorenie
        // v normalnych zatvorkach je resources ktore chceme citat z premennej 'p'
        try(BufferedReader br = Files.newBufferedReader(p)) {
            // BufferReader automaticky zatvori vsetko netreba to ručne pisat
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Scanner scanner = new Scanner(Files.newBufferedReader(p))) {
            scanner.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
// bude hadzat CHYBY todo : opravit
    }


    }

