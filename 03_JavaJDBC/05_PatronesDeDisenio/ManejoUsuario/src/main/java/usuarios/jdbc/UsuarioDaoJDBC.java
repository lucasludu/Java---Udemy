package usuarios.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import usuarios.dto.UsuarioDTO;

public class UsuarioDaoJDBC implements UsuarioDAO {
    
    private Connection user_conn;
    private final String SQL_INSERT = "INSERT INTO usuario (username, password) VALUES (?, ?)";
    private final String SQL_UPDATE = "UPDATE usuario SET username=?, password=? WHERE id_usuario=?";
    private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";
    private final String SQL_SELECT = "SELECT * FROM usuario";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection user_conn) {
        this.user_conn = user_conn;
    }
    
    @Override
    public int insert(UsuarioDTO usuarioDTO) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, usuarioDTO.getUsername());
            stmt.setString(index, usuarioDTO.getPassword());
            System.out.println("Ejecutando query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.user_conn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int update(UsuarioDTO usuarioDto) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, usuarioDto.getUsername());
            stmt.setString(index++, usuarioDto.getPassword());
            stmt.setInt(index, usuarioDto.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if(this.user_conn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int delete(UsuarioDTO usuarioDto) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuarioDto.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if(this.user_conn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        UsuarioDTO usuarioDto = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id_usuarioTemp = rs.getInt(1);
                String usernameTemp = rs.getString(2);
                String passwordTemp = rs.getString(3);
                
                usuarioDto = new UsuarioDTO();
                usuarioDto.setId_usuario(id_usuarioTemp);
                usuarioDto.setUsername(usernameTemp);
                usuarioDto.setPassword(passwordTemp);
                
                usuarios.add(usuarioDto);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.user_conn == null) {
                Conexion.close(conn);
            }
        }
        return usuarios;
    }
    
}
