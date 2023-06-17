package mx.com.bs.peliculas.presentacion;

import java.util.Scanner;
import mx.com.bs.peliculas.servicio.CatalogoPeliculasImpl;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        
        var opcion = -1;
        var scanner = new Scanner(System.in);
        var catalogo = new CatalogoPeliculasImpl();
        
        while (opcion != 0) {
            System.out.println("""
                               Elige una opcion 
                               1. Inicia el catalogo de peliculas
                               2. Agregar pelicula
                               3. Listar pleicas
                               4. Buscar pelicula
                               0. Salir""");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1 -> catalogo.inicarCatalogoPeliculas();
                case 2 -> {
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                }
                case 3 -> catalogo.listarPeliculas();
                case 4 -> {
                    System.out.println("Introduce una pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                }
                case 0 -> System.out.println("Hasta pronto");
                default -> System.out.println("Opcion no encontrada");
            }
        }

    }
}