package mx.com.gm.pelicula.excepciones;

public class AccesoDatosEx extends Exception {
    
    String message;

    public AccesoDatosEx(String message) {
        this.message = message;
    }
    
    
    
}
