package practica5;


import java.util.List;

/**
 * Clase principal que ejecuta la simulación del juego de cartas.
 */
public class Juego {
    
    /**
     * Punto de entrada principal del programa.
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SIMULACIÓN DEL SISTEMA ===");
        
        Mazo mazo = new Mazo();
        System.out.println("Baraja inicializada. Total de naipes: " + mazo.getCantidadCartas());
        
        mazo.barajar();
        System.out.println("Naipes mezclados aleatoriamente.");

        Jugador jugador1 = new Jugador("Merida");
        Jugador jugador2 = new Jugador("Julian");
        
        jugador2.nombre = "Julian"; 

        int naipesPorJugador = 5;
        System.out.println("\nDistribuyendo " + naipesPorJugador + " naipes a cada jugador...");
        jugador1.asignarCartas(mazo.repartirCartas(naipesPorJugador));
        jugador2.asignarCartas(mazo.repartirCartas(naipesPorJugador));

        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());
        System.out.println("Naipes restantes en baraja tras reparto: " + mazo.getCantidadCartas());

        System.out.println("\nLos jugadores devuelven sus naipes a la baraja...");
        List<Carta> naipesDevueltosJ1 = jugador1.deshacerseDeCartas();
        List<Carta> naipesDevueltosJ2 = jugador2.deshacerseDeCartas();

        for (Carta n : naipesDevueltosJ1) {
            mazo.agregarCartas(n);
        }
        for (Carta n : naipesDevueltosJ2) {
            mazo.agregarCartas(n);
        }

        System.out.println("Naipes en baraja después de recuperarlos: " + mazo.getCantidadCartas());
        System.out.println("Estado actual de jugadores:");
        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());
        
        System.out.println("\nReinicializando baraja a estado original...");
        mazo.restablecerElMazo();
        System.out.println("Naipes en baraja: " + mazo.getCantidadCartas());
    }
}