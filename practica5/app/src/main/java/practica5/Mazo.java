package practica5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa una baraja de cartas completa.
 */
public final class Mazo {
    private List<Carta> cartas;
    private static final String[] PALOS = {"Corazones", "Diamantes", "Treboles", "Picas"};

    /**
     * Construye una nueva baraja con 52 cartas.
     */
    public Mazo() {
        restablecerElMazo();
    }

    /**
     * Reinicia la baraja a su estado original con 52 cartas.
     */
    void restablecerElMazo() {
        cartas = new ArrayList<>();
        for (String palo : PALOS) {
            for (int numero = 1; numero <= 13; numero++) {
                cartas.add(new Carta(palo, numero));
            }
        }
    }

    /**
     * Mezcla aleatoriamente las cartas de la baraja.
     */
    public void barajar() {
        Collections.shuffle(cartas);
    }

    /**
     * Reparte una cantidad específica de cartas de la baraja.
     * @param cantidad número de cartas a repartir
     * @return lista con las cartas repartidas
     */
    public List<Carta> repartirCartas(int cantidad) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (!cartas.isEmpty()) {
                mano.add(quitarCartas());
            }
        }
        return mano;
    }

    /**
     * Agrega una carta a la baraja.
     * @param carta la carta a agregar
     */
    public void agregarCartas(Carta carta) {
        if (carta != null) {
            cartas.add(carta);
        }
    }

    /**
     * Extrae y remueve la primera carta de la baraja.
     * @return la carta extraída, o null si la baraja está vacía
     */
    public Carta quitarCartas() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }

    /**
     * Obtiene la cantidad actual de cartas en la baraja.
     * @return número de cartas restantes
     */
    public int getCantidadCartas() {
        return cartas.size();
    }
}