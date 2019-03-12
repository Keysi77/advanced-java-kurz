package sk.java.advanced09.Interfaces;

// implementuje nami vytvorene rozhrania
public class KonfliktyVInterfaci implements AnotherInterface, DefaultMethodInteface {
    @Override
    public void zastav() {
        //
    }

    @Override
    public void pohniSa() {
        //
    }


    @Override
    public void chodSam() {
        AnotherInterface.super.chodSam();
        DefaultMethodInteface.super.chodSam();
        // cez super ide do metody chodSam ktora je implmentovana v interfacy
        System.out.println("z KonfliktyVInterfaci");
    }

    public static void main(String[] args) {
        KonfliktyVInterfaci konfliktyVInterfaci = new KonfliktyVInterfaci();
        konfliktyVInterfaci.chodSam();
        // vypise dve metody z interfacu a jednu z triedy
    }
}
