/**
 * Representa una carta de la baraja con un palo y un número.
 */
public class Carta {
    private int numero;
    private Palo palo;  // Cambiado de String a Palo

    /**
     * Construye una nueva carta con el palo y número especificados.
     * @param palo el palo de la carta (CORAZONES, DIAMANTES, TREBOLES, ESPADAS)
     * @param numero el número de la carta (1-13)
     */
    public Carta(Palo palo, int numero) {  // Cambiado parámetro
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
    public Palo getPalo() {  // Cambiado return type
        return palo;
    }

    /**
     * Obtiene el valor de la carta (para compatibilidad)
     * @return el número de la carta
     */
    public int getValor() {
        return numero;
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
        return numeroTexto + " de " + palo.toString().toLowerCase();
    }
}