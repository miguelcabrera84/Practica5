package practica5;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un jugador que participa en el juego.
 */
public class Jugador {

    public String nombre;
    private final List<Carta> mano;

    /**
     * Construye un nuevo jugador con el nombre especificado.
     * @param nombre el nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    } 

    /**
     * Asigna una lista de cartas al jugador.
     * @param cartas lista de cartas a agregar a la mano
     */
    public void asignarCartas(List<Carta> cartas) {
        this.mano.addAll(cartas);
    }

    /**
     * Devuelve todas las cartas de la mano y las remueve.
     * @return lista con todas las cartas que tenía el jugador
     */
    public List<Carta> deshacerseDeCartas() {
        List<Carta> cartasDevueltas = new ArrayList<>(this.mano);
        this.mano.clear();
        return cartasDevueltas;
    }

    /**
     * Representación textual del jugador y su mano.
     * @return cadena con el formato "Jugador: nombre | Cartas en mano: [lista]"
     */
    @Override
    public String toString() {
        return "Jugador: " + nombre + " | Cartas en mano: " + mano.toString();
    }
}