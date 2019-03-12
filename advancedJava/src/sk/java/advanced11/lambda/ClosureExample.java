package sk.java.advanced11.lambda;

import sk.java.advanced01.Osoba;

public class ClosureExample {

    // zmrazenie hodnot
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // zavolanie pomocou vnutornej anonymnej triedy
        addToIt(a, new Process() {
            @Override
            public void process(int i) {
                // parameter 'i' reprezentuje parameter 'a'
                // parameter 'b' sa nachadza mimo anonymnej triedy tak sa neda menit
                System.out.println("-----------Stary sposob cez override----------");
                System.out.println(i+b);
            }
        });

        Osoba osoba = new Osoba("Michal", "Bella", 25);
        // prepisane do Lambdy
        System.out.println("-----------Sposob cez Lambdu----------");
        addToIt(a, i->System.out.println(i+b));
        // uz sa moze nasetovat novy vek
        addToIt(a, i->{
            // zmena premenej v lambda vyraze ktora je nadeklarovana mimo lambda vyraz
            // v jave 8 je to uz mozne
            osoba.setAge(35);
            System.out.println("-----------Osoba -> vek + i ----------");
            System.out.println(i+osoba.getAge());
        });
    }


    // metoda ktora si zoberie cislo a implementaciu rozhrania
    // prvym parametrom bude cislo, druhym bude rozhranie
    static void addToIt(int i, Process process){
        process.process(i);
    }
    interface Process{
        void process(int i);
    }

}
