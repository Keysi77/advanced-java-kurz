package sk.java.advanced01;

public class Vynimky {

    public static double delenie(double x, double y ) throws Exception{
        if(y == 0){ // vyhodiť vynimku ak sa rovna y=0
            throw new Exception("Argument y je 0"); // Vynimka, ktoru musim osetrovať
        }
        return x/y;
    }
    public static double delenie2(double x, double y ) { // netreba davať throws lebo je Aritmetic patri do Runtime exceptions
        if(y == 0){ // vyhodiť vynimku ak sa rovna y=0

            throw new ArithmeticException(" Argument je 0");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try {
            delenie(10,0);
        } catch (Exception e) {
             e.printStackTrace();
            System.err.println(e.getMessage());
        }

        delenie2(10,0);
    }
}
