import java.awt.*;

/**
 * Clase utilitaria para visualizar cartas gráficamente usando las clases del repositorio.
 */
public class Visualizador {
    
    public static void carta(Carta carta, Posicion posicion) {
        // Obtener el canvas
        Canvas canvas = Canvas.getCanvas();
        
        // Dibujar el fondo blanco de la carta
        Square fondo = new Square();
        fondo.changeSize(100);
        fondo.changeColor("white");
        fondo.moveHorizontal(posicion.getX() - 310);
        fondo.moveVertical(posicion.getY() - 120);
        fondo.makeVisible();
        
        // Dibujar el borde negro
        Square borde = new Square();
        borde.changeSize(102);
        borde.changeColor("black");
        borde.moveHorizontal(posicion.getX() - 311);
        borde.moveVertical(posicion.getY() - 121);
        borde.makeVisible();
        
        // Determinar color según el palo
        String colorPalo = (carta.getPalo() == Palo.CORAZONES || 
                           carta.getPalo() == Palo.DIAMANTES) ? "red" : "black";
        
        // Dibujar el valor de la carta (círculos)
        int valor = carta.getValor();
        for (int i = 0; i < valor && i < 5; i++) {
            Circle punto = new Circle();
            punto.changeColor(colorPalo);
            punto.changeSize(8);
            punto.moveHorizontal(posicion.getX() - 280 + (i * 15));
            punto.moveVertical(posicion.getY() - 80);
            punto.makeVisible();
        }
        
        // Dibujar símbolo del palo según corresponda
        if (carta.getPalo() == Palo.CORAZONES) {
            // Corazón simple con círculos
            Circle c1 = new Circle();
            c1.changeColor(colorPalo);
            c1.changeSize(15);
            c1.moveHorizontal(posicion.getX() - 260);
            c1.moveVertical(posicion.getY() - 70);
            c1.makeVisible();
            
            Circle c2 = new Circle();
            c2.changeColor(colorPalo);
            c2.changeSize(15);
            c2.moveHorizontal(posicion.getX() - 245);
            c2.moveVertical(posicion.getY() - 70);
            c2.makeVisible();
        }
        
        System.out.println("Carta desplegada: " + carta + " en " + posicion);
    }
}