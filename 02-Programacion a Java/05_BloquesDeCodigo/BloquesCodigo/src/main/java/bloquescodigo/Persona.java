package bloquescodigo;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicialiacion de codigo static
    static {
        contadorPersonas = 10;
        // No se puede usar variables NO estaticas
        // idPersona = 2;
        System.out.println("Ejecucion Bloque Estatico");
    }

    // Bloque NO estatico se copia a cada objeto
    {
        System.out.println("Ejecucion bloque NO estatico.");
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona() {
        System.out.println("Ejecucion del constructor.");
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

}
