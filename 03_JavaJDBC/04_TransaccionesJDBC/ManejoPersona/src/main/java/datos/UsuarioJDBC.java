package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioJDBC {
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public UsuarioJDBC() {
    }

    public UsuarioJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsername(username);
                usuario.setPassword(password);
                usuarios.add(usuario);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return usuarios;
    }
    
    public int insert(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            System.out.println("Ejecutando Query: " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if(this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    
    public int update(int id_usuario, String username, String password) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setInt(3, id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros Actualizados: " + rows);
        } finally {
            Conexion.close(stmt);
            if(this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }
    
    
    public int delete(int id_usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros Eliminados:  " + rows);
        } finally {
            Conexion.close(stmt);
            if(this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }
}
