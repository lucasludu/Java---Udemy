package com.edu.pasoporreferencia;

public class Main {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        persona.cambiarNombre("Juan");
        
        System.out.println("Varlor del Nombre = " + persona.obtenerNombre());
        
        modificarPersona(persona);
        
        // Dos formas de perder los datos seria:
        // 1 - 
//        persona = null;
        // 2 -
//        persona = new Persona();
        
        System.out.println("Valor del Nombre Modificado = " + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Carlito");
    }
}
