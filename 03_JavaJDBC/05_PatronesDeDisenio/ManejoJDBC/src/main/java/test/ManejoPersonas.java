package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false); // Necesitamos que la conexion no se haga autocommit
            }
            PersonaDAO personaDAO = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDAO.select();
            
            for(PersonaDTO persona : personas) {
                System.out.println("Persona DTO: " + persona);
            }
            
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
