package test;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;
import usuarios.jdbc.*;

public class Main {

    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDaoJDBC();
        
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setUsername("Fernando");
        usuario.setPassword("123456789");
        
        try {
            usuarioDao.insert(usuario);
            
            usuarioDao.delete(new UsuarioDTO(5));
            
            UsuarioDTO usuarioUpdate = new UsuarioDTO(0);
            usuarioUpdate.setId_usuario(4);
            usuarioUpdate.setUsername("Victoria");
            usuarioUpdate.setPassword("1324");
            usuarioDao.update(usuarioUpdate);
            
            List<UsuarioDTO> usuarios = usuarioDao.select();
            for(UsuarioDTO usuariosDto : usuarios) {
                System.out.println(usuariosDto);
            }
        } catch(SQLException ex) {
            System.out.println("Excepcion en la capa de prueba");
            ex.printStackTrace(System.out);
        }

    }
    
}
