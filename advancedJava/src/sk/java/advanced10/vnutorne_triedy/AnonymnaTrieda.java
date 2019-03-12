package sk.java.advanced10.vnutorne_triedy;

import sk.java.advanced10.vnutorne_triedy.rozhranie.IVypisNaKonzolu;

public class AnonymnaTrieda {

    public static void main(String[] args) {
        AnonymnaTrieda anonymnaTrieda = new AnonymnaTrieda();
        // anonymna trieda - konstruktory s implementaciou vo vnutri
        anonymnaTrieda.vypisNieco(new IVypisNaKonzolu() {
            @Override
            public void vypisNaSystemOut() {
                System.out.println("OUT");
            }

            @Override
            public void vypisNaSystemErr() {
                System.out.println("ERROR");
            }
        });
    }

    public void vypisNieco(IVypisNaKonzolu vypisNaKonzolu){
        vypisNaKonzolu.vypisNaSystemOut();
        vypisNaKonzolu.vypisNaSystemErr();
    }


}
