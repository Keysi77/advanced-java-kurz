package sk.java.advanced08.generic;

import sk.java.objects.Pes;
import sk.java.objects.extendedPes;

// Obmedzenia parametrov Bounded Type
// generikujem extenduje dedi od objektu Pes
// keby neoblo extends Pes tak nemoze pracovat s objektom Pes


public class BoundedType <P extends Pes> {
    // tato trieda moze pracovat len s tymi objektami, ktore patria objektu Pes

    private P objectPes;

    // getter a setter
    public P getObjectPes() {
        return objectPes;
    }

    public void setObjectPes(P objectPes) {
        this.objectPes = objectPes;
    }

    public void stekaj(){
        objectPes.stekaj();
    }

    public static void main(String[] args) {
       // BoundedType<Pes> pes = new BoundedType<>();
       // BoundedType<extendedPes> extendedPes = new BoundedType<>();
        BoundedType<extendedPes> extendedPes = new BoundedType<>();
        extendedPes.setObjectPes(new extendedPes());

        extendedPes.stekaj(); // z objektu Pes metoda stekaj()


    }
}
