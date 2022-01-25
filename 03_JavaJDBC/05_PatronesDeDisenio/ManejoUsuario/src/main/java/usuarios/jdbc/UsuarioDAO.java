package usuarios.jdbc;

import java.sql.*;
import java.util.List;
import usuarios.dto.UsuarioDTO;

public interface UsuarioDAO {
    
    public int insert(UsuarioDTO usuarioDto) throws SQLException;
    public int update(UsuarioDTO usuarioDto) throws SQLException;
    public int delete(UsuarioDTO usuarioDto) throws SQLException;
    public List<UsuarioDTO> select() throws SQLException;
    
}
