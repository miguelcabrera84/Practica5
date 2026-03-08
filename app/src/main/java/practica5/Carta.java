package practica5;

/**
 * Representa una carta de la baraja con un palo y un número.
 */
public class Carta {
    private int numero;
    private final String palo;

    /**
     * Construye una nueva carta con el palo y número especificados.
     * @param palo el palo de la carta (Corazones, Diamantes, Treboles, Picas)
     * @param numero el número de la carta (1-13)
     */
    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    /**
     * Obtiene el número de la carta.
     * @return el número de la carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene el palo de la carta.
     * @return el palo de la carta
     */
    public String getPalo() {
        return palo;
    }

    /**
     * Representación textual de la carta.
     * @return cadena con el formato "valor de palo" (ej: "A de Corazones")
     */
    @Override
    public String toString() {
        String numeroTexto;
        switch (numero) {
            case 1: numeroTexto = "A"; break;
            case 11: numeroTexto = "J"; break;
            case 12: numeroTexto = "Q"; break;
            case 13: numeroTexto = "K"; break;
            default: numeroTexto = String.valueOf(numero);
        }
        return numeroTexto + " de " + palo;
    }
}