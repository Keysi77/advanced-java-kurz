package sk.java.advanced08.generic;
// hlbsie obmedzenie dedi triedu a za nou rozhrania:
// <T extends A & B&C > A je trieda B a C su implementovane rozhrania
// trieda musi byt vzdy prva, ak sa nenachadza trieda, tak na poradi nezalezi
import sk.java.objects.Pes;
import sk.java.objects.extendedPesSerialized;

import java.io.Serializable;

public class MultipleBound<P extends Pes & Serializable> {
    // pojdu len objekty a metody ktore dedia od Psa a implementuju rozhranie Serializable
    // extenduje triedu Pes a implementuje rozhranie Serializable

    public P objekt;

    public P getObjekt() {
        return objekt;
    }

    public void setObjekt(P objekt) {
        this.objekt = objekt;
    }

    public static void main(String[] args) {
        MultipleBound<extendedPesSerialized> extendedPesSerialized = new MultipleBound<>();
        extendedPesSerialized.setObjekt(new extendedPesSerialized("extendovany pes: NERO"));
        // extendedPes by nesiel lebo neimplementuje rozhranie Serializable
        // extendedPesSerializable ide lebo dedi od Pes a imlementuje rozhranie Serializable

    }
}
