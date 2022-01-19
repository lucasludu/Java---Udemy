package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPelicula;
import mx.com.gm.peliculas.negocio.CatalogoPeliculaImpl;

public class CPJLaboratorioFinal {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\pruebaJava\\peliculas.txt";
    private static final CatalogoPelicula catalogoPelicula = new CatalogoPeliculaImpl();

    public static void main(String[] args) {
             
        while(opcion != 0) {
            try {
                System.out.println("Elegir Opcion:"
                        + "\n1 - Iniciar catalogo de peliculas."
                        + "\n2 - Agregar pelicula."
                        + "\n3 - Listar pelicula."
                        + "\n4 - Buscar pelicula."
                        + "\n0 - Salir.");
                
                opcion = Integer.parseInt(scanner.nextLine());
                switch(opcion) {
                    case 1:
                        /*
                            1 - Se crea el objeto que administra el catalogo de personas.
                            La creacion del archivo es opcional, de todas maneras se va 
                            a crear al escribir por primera vez en el archivo.
                        */
                        catalogoPelicula.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        /*
                            2 - Se agrega informacion al archivo.
                        */
                        System.out.println("Introducir nombre de la pelicula a agregar: ");
                        String nombre = scanner.nextLine();
                        catalogoPelicula.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        /*
                            3 - Listar el catalogo completo.
                        */
                        catalogoPelicula.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        /*
                            4 - Buscar pelicula.
                        */
                        System.out.println("Introducir el nombre de la pelicula a buscar: ");
                        String buscar = scanner.nextLine();
                        catalogoPelicula.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida!");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        
    }
    
}
