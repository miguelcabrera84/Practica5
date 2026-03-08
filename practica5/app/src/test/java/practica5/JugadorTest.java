package practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

/**
 * Pruebas unitarias para la clase Jugador.
 */
public class JugadorTest {

    @Test
    void testAsignarCartas() {
        Jugador jugador = new Jugador("Brayan");
        List<Carta> nuevasCartas = Arrays.asList(new Carta("Picas", 1), new Carta("Diamantes", 12));
        jugador.asignarCartas(nuevasCartas);
        
        assertTrue(jugador.toString().contains("A de Picas"), "La mano debe incluir los naipes asignados.");
        assertTrue(jugador.toString().contains("Q de Diamantes"), "La mano debe incluir los naipes asignados.");
    }

    @Test
    void testDeshacerseDeCartas() {
        Jugador jugador = new Jugador("Julian");
        jugador.asignarCartas(Arrays.asList(new Carta("Treboles", 7)));
        
        List<Carta> devueltas = jugador.deshacerseDeCartas();
        assertEquals(1, devueltas.size());
        assertTrue(jugador.toString().contains("[]"), "La mano del jugador debe quedar vacía.");
    }

    @Test
    void testToString() {
        Jugador jugador = new Jugador("Santiago");
        String resultado = jugador.toString();
        assertNotNull(resultado);
        assertTrue(resultado.contains("Santiago"), "El método debe incluir el nombre del jugador.");
    }
}