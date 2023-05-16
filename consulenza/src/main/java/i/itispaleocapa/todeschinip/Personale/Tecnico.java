package i.itispaleocapa.todeschinip.Personale;

import java.util.Date;

public class Tecnico extends Personale{
    private enum ruolo{Informatica_Telecomunicazioni,Elettronica_Automazione};
    private enum internoEsterno{interno,esterno};
    ruolo x;
    internoEsterno y;
    public int calcola(int ore){
        switch (x){
            case Informatica_Telecomunicazioni: 
                switch (y){
                    case interno: return (40+((new Date().getYear())-this.getAnnoAssunione()))*ore;
                    case esterno: return 40*ore;
                }
            case Elettronica_Automazione:
                switch (y){
                    case interno: return (50+((new Date().getYear())-this.getAnnoAssunione()))*ore;
                    case esterno: return 50*ore;
                }
            default: return ore; 
        }
    }
}
