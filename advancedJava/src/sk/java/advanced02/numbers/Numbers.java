package sk.java.advanced02.numbers;

public class Numbers {
    public static void main(String[] args) {
        basic();
        modulo();
        mathPriklady();
        randomNumbers();
    }

    private static void basic() {
        Byte b = 127;
        int i = b.intValue(); // spravi int z double
        System.out.println(i);
        String s = "2.5";
        String s2 = "2.5a"; // nebdue fungovať lebo to neni decimalna hodnota
        double d = Double.parseDouble(s); // spravi zo stringu double

        try {
             d = Double.parseDouble(s); // spravi zo stringu double
        }catch (NumberFormatException ex){
            System.err.print(ex.getMessage());
        }
            System.out.println(d);
    }

    private static void modulo(){
        // modulo (%) je zvysok po deleni
        for (int i = 0; i < 32; i++) {
            rozdaj(i%4,i);
        }
    }

    private  static void rozdaj(int hrac, int karta){
        System.out.println("Rozdavam hracovi " +hrac+ " kartu s cislom "+karta);

    }

    // priklady z Math kniznice
    private static void mathPriklady(){
        double a = -192.25;
        double b = 45.12;
        int c = 12, d=45;

        System.out.println("a "+a+" abs " + Math.abs(a)); // absolutna hodnota
        System.out.println("b "+b+" ceil " + Math.ceil(b)); // zaokruhlovanie nahor
        System.out.println("b "+b+" floor " + Math.floor(b)); // zaokruhlovanie nadol
        System.out.println("b "+b+" rint " + Math.rint(b)); // klasicke zaokruhlovanie double
        System.out.println("b "+b+" round " + Math.round(b)); // klasicke zaokruhlovanie integer
        System.out.println("c "+c+" a d "+d+" max " + Math.max(c,d)); // maximalna hodnota z dvoch cisel
        System.out.println("c "+c+" a d "+d+" min " + Math.min(c,d)); // minimalna hodnota z dvoch cisel
    }

    // nahodne cisla

    private static void randomNumbers(){
            int number= (int)(Math.random() *10); // nahodne cislo od 0 po 10
            System.out.println(number);
    }



}
