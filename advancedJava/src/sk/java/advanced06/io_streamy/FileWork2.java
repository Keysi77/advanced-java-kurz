package sk.java.advanced06.io_streamy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;


public class FileWork2 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\temp\\text.txt");
        Path path2 = Paths.get("C:\\temp\\text2.txt");
        Path path3 = Paths.get("C:\\");

//        System.out.println("Files.exists " + Files.exists(path));
//        System.out.println("Files.notExists " + Files.notExists(path));
//        System.out.println("Files.isReadable " + Files.isReadable(path));
//        System.out.println("Files.isHidden " + Files.isHidden(path));
//        System.out.println("Files.isDirectory " + Files.isDirectory(path));
//        // porovna ci su rovnake dve cesty
//        System.out.println(Files.isSameFile(path,path2));
//        // zmaze subor ktory odkazuje na dany path
//        Files.delete(path);
// na osetrenie vynimiek keby subor neexistoval

//        try {
//            Files.delete(path);
//        } catch (NoSuchFileException x) {
//            System.err.println("neexistujem danĂ˝ sĂşbor "+path);
//        } catch (DirectoryNotEmptyException x) {
//            System.err.println("priecinok nie je prazdny "+path);
//        } catch (IOException x) {
//            System.err.println(x);
//        }

    // KOPIROVANIE suborov

      //  Files.copy(path,path2,StandardCopyOption.REPLACE_EXISTING);

        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        System.out.println("isDirectory: " + attr.isDirectory());
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());
        // precita vsetky riadky a ulozi ich do Listu a pomocou cyklu s a mozu vypisať
        Files.readAllLines(path);


    }


    }

