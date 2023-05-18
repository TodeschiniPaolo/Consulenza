package i.itispaleocapa.todeschinip.Personale;

import java.util.Date;

public class Funzionario extends Personale{
    public Funzionario(String codice, String cognome, String nome,int annoAssunzione,int ore){
        this.setCodice(codice);
        this.setCognome(cognome);
        this.setNome(nome);
        this.setAnnoAssunzione(annoAssunzione);
        this.setOre(ore);
    }
    public int calcola(int ore){
        if((new Date().getYear())-this.getAnnoAssunione()>=10){ return ore*80;}
        return ore*70;
    }
}