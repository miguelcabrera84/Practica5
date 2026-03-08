package LabPOO;
import java.util.ArrayList;

public class Catalogo {
    // Atributo
    private ArrayList<Pelicula> peliculas;

    // Constructor
    public Catalogo() {
        peliculas = new ArrayList<>();
    }

    // Método para agregar una película
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada: " + pelicula.toString());
    }

    // Método para mostrar todas las películas
    public void mostrarPeliculas() {
        System.out.println("\n=== LISTA DE PELÍCULAS ===");
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas en el catálogo.");
        } else {
            for (int i = 0; i < peliculas.size(); i++) {
                System.out.println((i + 1) + ". " + peliculas.get(i).toString());
            }
        }
    }

    // Método para buscar una película por título
    public void buscarPelicula(String titulo) {
        System.out.println("\n=== BUSCANDO PELÍCULA: " + titulo + " ===");
        
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("¡PELÍCULA ENCONTRADA!");
                System.out.println(p.getInformation());
                return;
            }
        }
        
        System.out.println("No se encontró la película: " + titulo);
    }
}