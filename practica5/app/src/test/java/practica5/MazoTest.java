package practica5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Pruebas unitarias para la clase Mazo.
 */
public class MazoTest {
    private Mazo mazo;

    @BeforeEach
    void iniciar() {
        mazo = new Mazo();
    }

    @Test
    void testAgregarCartas() {
        int inicial = mazo.getCantidadCartas();
        mazo.agregarCartas(new Carta("Corazones", 5));
        assertEquals(inicial + 1, mazo.getCantidadCartas(), "La baraja debe incrementar al añadir un naipe.");
    }

    @Test
    void testBarajar() {
        String estadoInicial = mazo.repartirCartas(5).toString();
        mazo.restablecerElMazo();
        mazo.barajar();
        String estadoPostBarajar = mazo.repartirCartas(5).toString();

        assertNotEquals(estadoInicial, estadoPostBarajar, "El orden de los naipes debería alterarse tras mezclar.");
    }

    @Test
    void testGetCantidadCartas() {
        assertEquals(52, mazo.getCantidadCartas());
        mazo.quitarCartas();
        assertEquals(51, mazo.getCantidadCartas());
    }

    @Test
    void testQuitarCartas() {
        Carta carta = mazo.quitarCartas();
        assertNotNull(carta, "No debe retornar null si hay naipes disponibles.");
        assertEquals(51, mazo.getCantidadCartas());
    }

    @Test
    void testRepartirCartas() {
        List<Carta> mano = mazo.repartirCartas(10);
        assertEquals(10, mano.size(), "Debe repartir exactamente 10 naipes.");
        assertEquals(42, mazo.getCantidadCartas(), "La baraja debe reducirse proporcionalmente.");
    }

    @Test
    void testRestablecerElMazo() {
        mazo.repartirCartas(20);
        mazo.restablecerElMazo();
        assertEquals(52, mazo.getCantidadCartas(), "La baraja debe restablecerse a 52 naipes.");
    }
}