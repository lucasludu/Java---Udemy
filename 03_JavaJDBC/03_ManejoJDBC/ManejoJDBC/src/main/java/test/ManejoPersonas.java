package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();
        
        for(Persona persona : personas) {
            System.out.println("Persona: " + persona);
        }
        
        // PRUEBA INSERT
//        Persona persona = new Persona();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@gmail.com");
//        persona.setTelefono("45648165");
        
//        personaJDBC.insert(persona);

        // PRUEBA UPDATE
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        persona.setNombre("Carlito");
//        persona.setApellido("Lara");
//        persona.setEmail("clara@gmail.com");
//        persona.setTelefono("55548165");

//        personaJDBC.update(persona);

        // PRUEBA DELETE
        Persona persona = new Persona();
        persona.setId_persona(3);
        personaJDBC.delete(persona);
    }

}
