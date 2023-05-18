package i.itispaleocapa.todeschinip.Personale;
import java.util.Date;

public class Tecnico extends Personale{
    public enum Ruolo{Informatica_Telecomunicazioni,Elettronica_Automazione};
    public enum InternoEsterno{interno,esterno};
    Ruolo ruolo;
    InternoEsterno internoEsterno;
    public Tecnico(String codice, String cognome, String nome,int annoAssunzione,int ore,Ruolo ruolo,InternoEsterno internoEsterno){
        this.setCodice(codice);
        this.setCognome(cognome);
        this.setNome(nome);
        this.setAnnoAssunzione(annoAssunzione);
        this.setOre(ore);
        this.ruolo=ruolo;
        this.internoEsterno=internoEsterno;
    }
    
    public int calcola(int ore){
        switch (ruolo){
            case Informatica_Telecomunicazioni: 
                switch (internoEsterno){
                    case interno: return (40)*ore+((new Date().getYear())-this.getAnnoAssunione());
                    case esterno: return 40*ore;
                }
            case Elettronica_Automazione:
                switch (internoEsterno){
                    case interno: return (50)*ore+((new Date().getYear())-this.getAnnoAssunione())*ore;
                    case esterno: return 50*ore;
                }
            default: return ore; 
        }
    }
}
