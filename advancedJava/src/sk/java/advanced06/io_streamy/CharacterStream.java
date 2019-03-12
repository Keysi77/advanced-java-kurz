package sk.java.advanced06.io_streamy;

import java.io.*;

public class CharacterStream {
    // z text.txt prepise data do output.txt (ktory bol na zaciatku prazdny)
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("resources/text.txt");
            out = new FileWriter("resources/output.txt");
            int c;
            // -1 znamena koniec takze uz dalej nemusi citat
            // NECITA terat Byt po Byt ale cita charactery
            while ((c = in.read()) != -1) { // citanie z input streamu
                out.write(c); // nacitane data zapise do output streamu
            }
        } finally { // zatvori vzdy input a aoutput stream aj ked sa vykona try aj ked nie
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
