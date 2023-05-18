package i.itispaleocapa.todeschinip.Personale;
public abstract class Personale{
    private String codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;
    private int ore;
    public int calcola(int ore){return 0;}
    public String getCodice(){return this.codice;}
    public String getCognome(){return this.cognome;}
    public String getNome(){return this.nome;}
    public int getAnnoAssunione(){return this.annoAssunzione;}
    public int getOre(){return this.ore;}
    public void setCodice(String codice){this.codice=codice;}
    public void setCognome(String cognome){this.cognome=cognome;}
    public void setNome(String nome){this.nome=nome;}
    public void setAnnoAssunzione(int annoAssunzione){this.annoAssunzione=annoAssunzione;}
    public void setOre(int ore){this.ore=ore;}
}