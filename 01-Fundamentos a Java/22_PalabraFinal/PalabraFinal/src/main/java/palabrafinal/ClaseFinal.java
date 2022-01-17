package palabrafinal;

public class ClaseFinal {
    
    // Variables marcadas como final
    public final int varnumero = 4; // Si o si hay que inicializarlo.
    
    // Constantes en JAVA
    public static final int VAR_PRIMITIVO = 5;
    
    public static final Persona VAR_PERSONA = new Persona(); // Se crea objeto persona, una vez creada no se va modificar ni apuntar a otro objeto persona
    
    // Metodo final, se va ver en sobrescritura
    public final void metodoFinal(){};
}

/** NO SE PUEDE CREAR CLASES HIJAS DE UNA CLASE FINAL **/
class claseHija extends ClaseFinal {
    /** No es posible modificar el comportamiento (sobrescritura) de un 
        metodo padre marcado como final
    **/
    public void metodoFinal();
}