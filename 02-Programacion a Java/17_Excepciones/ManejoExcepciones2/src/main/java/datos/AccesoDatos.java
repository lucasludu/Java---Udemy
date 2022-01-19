package datos;

import excepciones.AccesoDatosEx;

public interface AccesoDatos {
    
    public static int MAX_REGISTROS = 10;
    
    public abstract void insertar() throws AccesoDatosEx ;
    public abstract void listar() throws AccesoDatosEx ;
    
    public abstract void simularError(boolean simularError);
    
}
