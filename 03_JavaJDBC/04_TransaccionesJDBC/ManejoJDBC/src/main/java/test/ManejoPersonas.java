package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false); // Necesitamos que la conexion no se haga autocommit
            }
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(2);
            cambioPersona.setNombre("Karlita");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@gmail.com");
            cambioPersona.setTelefono("45649948");
            personaJDBC.update(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Damian");
//            nuevaPersona.setApellido("Ancheluchi111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Ancheluchi");
            personaJDBC.insert(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    }

}
