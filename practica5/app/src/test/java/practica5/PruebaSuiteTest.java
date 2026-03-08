package practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Pruebas generales de integración para el sistema de cartas.
 */
public class PruebaSuiteTest {

    @Test
    public void testCreacionYBarajeoMazo() {
        Mazo mazo = new Mazo();
        assertEquals(52, mazo.getCantidadCartas(), "La baraja debe contener 52 naipes al crearse.");
    }

    @Test
    public void testRepartirCartas() {
        Mazo mazo = new Mazo();
        List<Carta> mano = mazo.repartirCartas(5);
        assertEquals(5, mano.size(), "Se deben distribuir 5 naipes.");
        assertEquals(47, mazo.getCantidadCartas(), "La baraja debe quedar con 47 naipes.");
    }

    @Test
    public void testJugadorAsignarYDeshacer() {
        Jugador jugador = new Jugador("Test");
        Mazo mazo = new Mazo();
        jugador.asignarCartas(mazo.repartirCartas(3));
        
        List<Carta> devueltas = jugador.deshacerseDeCartas();
        assertEquals(3, devueltas.size(), "El jugador debe devolver 3 naipes.");
    }
}