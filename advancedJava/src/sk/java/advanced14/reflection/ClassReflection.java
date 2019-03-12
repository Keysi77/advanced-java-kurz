package sk.java.advanced14.reflection;

import java.io.PrintStream;
// Reflexia 3 ziskavanie clenov triedy
public class ClassReflection {
    static PrintStream out = System.out;

    public static void main(String[] args) {
//        <?> ze je to Class  hociakeho typu
        Class<?> c = String.class;
        // vypise meno classy

        // getDeclaredField()/getDeclaredFields()
        //  - nevracia zdedenych clenov
        //  - vracia privatnych clenov

        // getField()/getFields()
        //  - vracia zdedench clenov
        //  - nevracia privatnych clenov

        out.format("Class:%n  %s%n%n", c.getCanonicalName());

        Package p = c.getPackage();
        out.format("Package:%n  %s%n%n",
                (p != null ? p.getName() : "-- No Package --"));
//
//        printMembers(c.getConstructors(), "Constructor");
//        printMembers(c.getFields(), "Fields");
//        printMembers(c.getMethods(), "Methods");
//
//        printClasses(c);

    }

    private static void printClasses() {
    }

    private static void printMembers() {
    }
}
