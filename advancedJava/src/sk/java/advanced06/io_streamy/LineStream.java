package sk.java.advanced06.io_streamy;

import java.io.*;

public class LineStream {
    // z text.txt prepise data do output.txt (ktory bol na zaciatku prazdny)
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        PrintWriter out = null;
        // dokaze citat a zapisovat po riadkoch pomocou BufferedReader a PrintWriter
        try {
            // nacita vsetky znaky z daneho riadku BufferedReader + FileReader
            in = new BufferedReader(new FileReader("resources/text.txt"));
            out = new PrintWriter(new FileWriter("resources/output.txt"));
            String c;
            // NECITA terat Byt po Byt ale cita charactery
            while ((c = in.readLine()) != null) { // citanie z input streamu
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
