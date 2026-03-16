public class Main {
    public static void main(String[] args) {
        // Demostración de las figuras originales
        Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();
        
        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();

        // Crear algunas cartas de ejemplo usando el enum Palo
        Carta carta1 = new Carta(Palo.CORAZONES, 1);   // As de corazones
        Carta carta2 = new Carta(Palo.PICAS, 12);    // Reina de picas
        Carta carta3 = new Carta(Palo.TREBOLES, 7);    // 7 de tréboles
        Carta carta4 = new Carta(Palo.DIAMANTES, 13);  // K de diamantes

        // Visualizar las cartas en diferentes posiciones
        System.out.println("Visualizando carta 1 en posición (20, 40)");
        Visualizador.carta(carta1, new Posicion(20, 40));
        
        System.out.println("Visualizando carta 2 en posición (450, 40)");
        Visualizador.carta(carta2, new Posicion(450, 40));
        
        System.out.println("Visualizando carta 3 en posición (20, 300)");
        Visualizador.carta(carta3, new Posicion(20, 300));
        
        System.out.println("Visualizando carta 4 en posición (450, 300)");
        Visualizador.carta(carta4, new Posicion(450, 300));
        
        System.out.println("Programa ejecutándose. Cierra las ventanas para terminar.");
    }
}