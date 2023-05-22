package i.itispaleocapa.todeschinip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import i.itispaleocapa.todeschinip.Personale.Dirigente;
import i.itispaleocapa.todeschinip.Personale.Funzionario;
import i.itispaleocapa.todeschinip.Personale.Personale;
import i.itispaleocapa.todeschinip.Personale.Progetto;
import i.itispaleocapa.todeschinip.Personale.Tecnico;

public class ProgettoTest {
    private Progetto progetto;

    @BeforeEach
    public void setup() {
        progetto = new Progetto();
    }

    @Test
    public void testCalcolaWithSingleImpiegato() {
        Personale dirigente = new Dirigente("D1", "Cognome1", "Nome1", 2021, 40);
        progetto.aggiungi(dirigente);

        int result = progetto.calcola();
        Assertions.assertEquals(4000, result);
    }

    @Test
    public void testCalcolaWithMultipleImpiegati() {
        Personale dirigente = new Dirigente("D1", "Cognome1", "Nome1", 2021, 40);
        Personale funzionario = new Funzionario("F1", "Cognome2", "Nome2", 2015, 40);
        Personale tecnico = new Tecnico("T1", "Cognome3", "Nome3", 2010, 40, Tecnico.Ruolo.Informatica_Telecomunicazioni, Tecnico.InternoEsterno.interno);

        progetto.aggiungi(dirigente);
        progetto.aggiungi(funzionario);
        progetto.aggiungi(tecnico);

        int result = 0;
        result = progetto.calcola();
        // Dirigente: 40 * 100 = 4000
        // Funzionario: 40 * 70 = 2800
        // Tecnico: (40 + (2023 - 2010)) * 40 = 2120
        // Total: 4000 + 2800 + 2120 = 11260
        Assertions.assertEquals(8920, result);
    }
}