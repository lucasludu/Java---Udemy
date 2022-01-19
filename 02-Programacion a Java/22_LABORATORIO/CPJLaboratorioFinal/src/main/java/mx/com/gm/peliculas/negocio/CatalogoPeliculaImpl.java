package mx.com.gm.peliculas.negocio;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.pelicula.datos.AccesoDatos;
import mx.com.gm.pelicula.datos.AccesoDatosImpl;
import mx.com.gm.pelicula.excepciones.AccesoDatosEx;
import mx.com.gm.pelicula.excepciones.LecturaDatosEx;
import mx.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculaImpl implements CatalogoPelicula {
    
    private final AccesoDatos datos;

    public CatalogoPeliculaImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de datos.");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for(Pelicula pelicula : peliculas) {
                System.out.println("Pelicula: " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error en el acceso de datos.");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error en el acceso de datos.");
            ex.printStackTrace();
        }
        System.out.println("Resultado de busqueda: " + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if(datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                // Se crea el archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso de datos.");
            ex.printStackTrace();
        }
    }
    
}
