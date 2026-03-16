import javax.swing.*;
import java.awt.*;

/**
 * Clase utilitaria para visualizar cartas gráficamente.
 * Proporciona métodos de clase para desplegar cartas en posiciones específicas.
 */
public class Visualizador {
    
    /**
     * Método de clase que despliega una representación gráfica de una carta
     * en la posición especificada.
     * 
     * @param carta La carta a visualizar
     * @param posicion La posición donde se desplegará la carta
     */
    public static void carta(Carta carta, Posicion posicion) {
        // Crear un JFrame para mostrar la carta
        JFrame frame = new JFrame("Visualizador de Cartas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocation(posicion.getX(), posicion.getY());
        
        // Crear un panel personalizado para dibujar la carta
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarCarta(g, carta);
            }
        };
        
        panel.setPreferredSize(new Dimension(300, 200));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Método auxiliar que dibuja la representación gráfica de la carta
     * 
     * @param g Objeto Graphics para dibujar
     * @param carta La carta a dibujar
     */
    private static void dibujarCarta(Graphics g, Carta carta) {
        Graphics2D g2d = (Graphics2D) g;
        
        // Dibujar el borde de la carta
        g2d.setColor(Color.BLACK);
        g2d.drawRect(50, 50, 200, 120);
        
        // Dibujar el fondo de la carta según el palo
        Color colorFondo = obtenerColorPorPalo(carta.getPalo());
        g2d.setColor(colorFondo);
        g2d.fillRect(51, 51, 199, 119);
        
        // Configurar texto
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        
        // Dibujar el valor de la carta
        String valorStr = obtenerSimboloValor(carta.getValor());
        g2d.drawString(valorStr, 70, 100);
        
        // Dibujar el símbolo del palo
        String paloSímbolo = obtenerSimboloPalo(carta.getPalo());
        g2d.setFont(new Font("Arial", Font.PLAIN, 30));
        g2d.drawString(paloSímbolo, 150, 120);
        
        // Dibujar información adicional
        g2d.setFont(new Font("Arial", Font.PLAIN, 12));
        g2d.drawString(carta.getPalo().toString(), 70, 140);
    }
    
    /**
     * Obtiene el color correspondiente al palo de la carta
     * 
     * @param palo El palo de la carta
     * @return Color para el fondo de la carta
     */
    private static Color obtenerColorPorPalo(Palo palo) {
        switch (palo) {
            case CORAZONES:
            case DIAMANTES:
                return new Color(255, 200, 200); // Rojo claro
            case TREBOLES:
            case PICAS:
                return new Color(200, 200, 255); // Azul claro
            default:
                return Color.WHITE;
        }
    }
    
    /**
     * Obtiene el símbolo del valor de la carta
     * 
     * @param valor El valor de la carta
     * @return Representación en string del valor
     */
    private static String obtenerSimboloValor(int valor) {
        switch (valor) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(valor);
        }
    }
    
    /**
     * Obtiene el símbolo del palo de la carta
     * 
     * @param palo El palo de la carta
     * @return Símbolo Unicode del palo
     */
    private static String obtenerSimboloPalo(Palo palo) {
        switch (palo) {
            case CORAZONES: return "♥";
            case DIAMANTES: return "♦";
            case TREBOLES: return "♣";
            case PICAS: return "♠";
            default: return "?";
        }
    }
}