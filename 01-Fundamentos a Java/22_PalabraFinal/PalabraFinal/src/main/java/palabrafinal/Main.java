package palabrafinal;

public class Main {

    public static void main(String[] args) {

        // Modificar un atributo marcado como final, no es posible modificarlo.
//        ClaseFinal.VAR_PERSONA = 20;
        
        // Modificar la referencia de un atributo de tipo object
//        ClaseFinal.VAR_PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

    }
    
}
