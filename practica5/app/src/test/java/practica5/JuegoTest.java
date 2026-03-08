package practica5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Juego.
 */
public class JuegoTest {
    @Test
    void testMain() {
        assertDoesNotThrow(() -> {
            Juego.main(new String[]{});
        }, "El método principal debe ejecutarse sin lanzar excepciones.");
    }
}