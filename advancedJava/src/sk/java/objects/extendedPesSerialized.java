package sk.java.objects;


import java.io.Serializable;

// Dedi od objektu Pes
public class extendedPesSerialized extends Pes implements Serializable {
// tento objekt dedi od triedy Pes a implemetuje rozhranie Serializable


    private String meno;

    public extendedPesSerialized(String meno) {
        this.meno = meno;
    }




}
