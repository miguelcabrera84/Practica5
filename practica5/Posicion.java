/**
 * Clase que representa una posición en el plano cartesiano
 * para el despliegue de elementos gráficos.
 */
public class Posicion {
    private int x;
    private int y;
    
    /**
     * Constructor de la clase Posicion
     * @param x Coordenada en el eje X
     * @param y Coordenada en el eje Y
     */
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Obtiene la coordenada X
     * @return coordenada X
     */
    public int getX() {
        return x;
    }
    
    /**
     * Establece la coordenada X
     * @param x nueva coordenada X
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Obtiene la coordenada Y
     * @return coordenada Y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Establece la coordenada Y
     * @param y nueva coordenada Y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Posicion(" + x + ", " + y + ")";
    }
}