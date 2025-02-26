package listproject;
// Importamos el ArrayList
import java.util.ArrayList;

public class ListProject {
    public static void main(String[] args) {
        // Usamos el ArrayList
        ArrayList<Peliculas> peliculas = new ArrayList<>();

        // Añadimos las películas a la lista
        peliculas.add(new Peliculas("El Padrino", 175));
        peliculas.add(new Peliculas("Toy Story", 81));
        peliculas.add(new Peliculas("Spirit", 86));
      
        peliculas.add(null);
        peliculas.add(null);

        System.out.println("Lista sin anadir objeto");
        System.out.println("=======================\n");
        // Recorremos la lista para imprimir cada película en una nueva línea
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("========================");
        System.out.println("Lista con objeto anadido");
        System.out.println("========================\n");
        //Añadimos el nuevo objeto con la posición que eligamos
        peliculas.add(1, new Peliculas("El senor de los anillos", 188));
        // Recorremos la lista para imprimir cada película en una nueva línea
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        //Obtener un elemento por índice
        System.out.println("Pelicula en el indice 1: \n\n" + peliculas.get(1));
        
        //Eliminar un elemento por indice
        System.out.println("Eliminando la pelicula en el indice 0\n");
         
        peliculas.remove(0);
        System.out.println("Lista de las peliculas despues de eliminar: \n");
        
        //Recorremos con for each
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("Reemplazando la pelicula en el elemento 0\n");
        peliculas.set(0, new Peliculas("Mamma Mia", 108));
        
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
        System.out.println("El tamano de la lista es: " + peliculas.size());
        
        //Ascendentemente
        System.out.println("Visualizar en orden ASCENDENTE");
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
        
        System.out.println("Visualizar en orden DESCENDENTE");
        //Descendentemente
        for (int i = peliculas.size(); i > 0 ; i--) {
            System.out.println(peliculas.get(i - 1));
        }
        
        // Buscamos la posición de "Toy Story"
        Peliculas buscada = new Peliculas("Toy Story", 81);
        //guardamos en una variable el indexOf
        int indice = peliculas.indexOf(buscada);
        // Mostramos el índice de la película buscada
        if (indice != -1) {
            System.out.println("La pelicula '" + buscada.getTitulo() 
                    + "' esta en el elemento: " + indice);
        } else {
            System.out.println("La pelicula no se encontro en la lista.");
        }
    }
}
