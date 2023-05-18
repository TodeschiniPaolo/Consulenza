package i.itispaleocapa.todeschinip;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProgettoTest {
    private Progetto progetto;

    @BeforeEach
    public void setup() {
        progetto = new Progetto();
    }

    @Test
    public void testCalcolaWithNoImpiegati() {
        int result = progetto.calcola();
        Assertions.assertEquals(0, result);
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

        int result = progetto.calcola();
        // Dirigente: 40 * 100 = 4000
        // Funzionario: 40 * 80 = 3200
        // Tecnico: (40 + (2023 - 2010)) * 40 = 4060
        // Total: 4000 + 3200 + 4060 = 11260
        Assertions.assertEquals(11260, result);
    }
}