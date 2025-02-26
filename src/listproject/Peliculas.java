package listproject;

import java.util.Objects;

public class Peliculas {

    private String titulo;
    private int duracion;

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    //Constructor
    public Peliculas(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + "\nDuracion: " + duracion + " minutos\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + this.duracion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }

    

}
