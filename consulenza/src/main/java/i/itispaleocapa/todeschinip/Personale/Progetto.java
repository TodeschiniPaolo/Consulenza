package i.itispaleocapa.todeschinip.Personale;

import java.util.LinkedList;

public class Progetto {
    private LinkedList<Personale> impiegati;

    public void aggiungi(Personale impiegato){
        this.impiegati.add(impiegato);
    }

    public int calcola() {
        int somma = 0;
        for (Personale impiegato : impiegati) {
            somma += impiegato.calcola(0);
        }
        return somma;
    }
}

