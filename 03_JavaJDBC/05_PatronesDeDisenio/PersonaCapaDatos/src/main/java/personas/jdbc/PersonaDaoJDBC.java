package personas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 * Esta clase implementa la clase PersonaDao es una implementacion con la tecnologia JDBC podr­a haber 
 * otro tipo de implementaciones con tecnologias como Hibernate, iBatis, SpringJDBC, etc.
 */
public class PersonaDaoJDBC implements PersonaDAO {

    private Connection user_conn;

    private final String SQL_INSERT = "INSERT INTO persona (nombre, apellido) VALUES (?, ?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT * FROM persona";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection user_conn) {
        this.user_conn = user_conn;
    }

    /**
     * El metodo insert recibe como argumento un objeto DTO el cual viene de otra capa, 
     * y se extraen sus valores para crear un nuevo registro
     */
    @Override
    public int insert(PersonaDTO personaDTO) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, personaDTO.getNombre());
            stmt.setString(index, personaDTO.getApellido());
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

    /**
     * El metodo update recibe un objeto personaDTO el cual encapsula la informacion en un 
     * solo objeto y evitamos pasar los 3 parametros de manera aislada Despues extraemos la 
     * informacion del objeto y actualizamos el registro seleccionado
     */
    @Override
    public int update(PersonaDTO personaDTO) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, personaDTO.getNombre());
            stmt.setString(index++, personaDTO.getApellido());
            stmt.setInt(index, personaDTO.getId_persona());
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

    /**
     * Recibimos un objeto PersonaDTO no necesariamente debe venir lleno, sino solo nos 
     * importa el atributo id_persona
     */
    @Override
    public int delete(PersonaDTO personaDTO) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, personaDTO.getId_persona());
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
    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement stmt = null;
        PersonaDTO personaDTO = null;
        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
        try {
            conn = this.user_conn != null ? this.user_conn : Conexion.getConnection();
            stmt = conn.prepareCall(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                // Por cada registro se recuperan los valores de las columnas y se crea un objeto DTO
                int idPersonaTEMP = rs.getInt(1);
                String nombrePersonaTEMP = rs.getString(2);
                String apellidoPersonaTEMP = rs.getString(3);
                // Llenamos el DTO y lo agregamos a la lista
                personaDTO = new PersonaDTO();
                personaDTO.setId_persona(idPersonaTEMP);
                personaDTO.setNombre(nombrePersonaTEMP);
                personaDTO.setApellido(apellidoPersonaTEMP);
                personas.add(personaDTO);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.user_conn == null) {
                Conexion.close(conn);
            }
        }
        return personas;
    }

}
