package LabPOO;

/**
 *  Clase que se representa una pelicula
 */

//atributos
public class Pelicula{
    private String titulo;
    private String director;
    private int añoEstreno;
    private String genero;
    private int duracion;

    public String getTitulo(){
        return titulo;
    }

    //Constructor  
    public Pelicula(String titulo,String director,int añoEstreno,String genero,int duracion){
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    //Cadena de informacion completa de la pelicula 
    public String getInformation() {
        return "Título: " + titulo + "\n" +
               "Director: " + director + "\n" +
               "Año de estreno: " + añoEstreno + "\n" +
               "Género: " + genero + "\n" +
               "Duración: " + duracion + " minutos\n";
    }
    //*devuele true si la pelicula tiene 25 años de antiguedad
    public boolean esClasica(){
        int añoActual  = 2026;
        return (añoActual - añoEstreno) > 25;
    }
    //cadena del objeto
    public String toString() {
        return titulo + " (" + añoEstreno + ") - " +
         genero + " - " + duracion + " min - dur " + 
         director;
    }

}