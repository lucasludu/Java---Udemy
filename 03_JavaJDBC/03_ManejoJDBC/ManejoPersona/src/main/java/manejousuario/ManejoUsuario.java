package manejousuario;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class ManejoUsuario {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        /*
        Usuario u = new Usuario(2, "Fernando", "123456");
        usuarioJDBC.update(u);
        */
        
        /*
        Usuario user = new Usuario();
        user = cargarUsuario();
        
        usuarioJDBC.insert(user);
        
        List<Usuario> usuarios = usuarioJDBC.select();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
            System.out.println("");
        }
        
        usuarioJDBC.delete(2);
        */
        
        usuarioJDBC.update(1, "Lucas", "123456");

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
