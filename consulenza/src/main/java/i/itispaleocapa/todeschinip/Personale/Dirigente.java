package i.itispaleocapa.todeschinip.Personale;

public class Dirigente extends Personale {
    public Dirigente(String codice, String cognome, String nome,int annoAssunzione){
        this.setCodice(codice);
        this.setCognome(cognome);
        this.setNome(nome);
        this.setAnnoAssunzione(annoAssunzione);
    }
    public int calcola(int ore){return ore*100;}
}
