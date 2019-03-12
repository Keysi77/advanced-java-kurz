package sk.java.advanced11.lambda;

public class DelenieLambda {


    public static void main(String[] args) {
        // nebudeme pouzivat implementaciu triedu
        // premenna kde je ulozeny lambda vyraz s navratom
        Delenie deleniePremenna  = (int x, int y) -> {
            // je na viac riadkov treba zatvorky
            if (x==0){
                return 0;
            }
            return x/y;
        };
        // vypsis premenna.metoda(cislo1, cislo2)
        double vysledok = deleniePremenna.delenieMetoda(10,2);
        System.out.println(vysledok);
    }

    interface Delenie{
        // musi vraciat to čo ma, bude to double s dvoma integermi na vstupe
        // implementacia metoda
        double delenieMetoda(int x , int y);
    }
}
