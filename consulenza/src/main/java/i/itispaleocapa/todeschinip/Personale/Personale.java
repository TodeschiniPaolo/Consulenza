package i.itispaleocapa.todeschinip.Personale;

public abstract class Personale{
    private String codice;
    private String cognome;
    private String nome;
    private int annoAssunzione;
    public int calcola(int ore){return 0;}
    public String getCodice(){return this.codice;}
    public String getCognome(){return this.cognome;}
    public String getNome(){return this.nome;}
    public int getAnnoAssunione(){return this.annoAssunzione;}
    public void setCodice(String codice){this.codice=codice;}
    public void setCognome(String cognome){this.cognome=cognome;}
    public void setNome(String nome){this.nome=nome;}
    public void setAnnoAssunzione(int annoAssunzione){this.annoAssunzione=annoAssunzione;}
}