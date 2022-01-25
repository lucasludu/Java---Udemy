package usuarios.jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/test?useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";
    private static Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException {
        if (driver == null) {
            try {
                //Se registra el driver
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace(System.out);
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    
    public static void close(ResultSet rs) {
        try {
            if(rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    public static void close(PreparedStatement stmt) {
        try {
            if(stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    public static void close(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
