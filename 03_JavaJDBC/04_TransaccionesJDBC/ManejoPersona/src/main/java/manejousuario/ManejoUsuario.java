package manejousuario;

import datos.Conexion;
import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoUsuario {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);
            
            usuarioJDBC.update(1, "Luquitas", "456789");
            
            Usuario usuario = new Usuario();
            usuario = cargarUsuario();
            
            usuarioJDBC.insert(usuario);
            
            conexion.commit();
            System.out.println("Se ha hecho el commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
    
    private static Usuario cargarUsuario() {
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        
        Usuario user = new Usuario(username, password);        
        return user;
    }

}
