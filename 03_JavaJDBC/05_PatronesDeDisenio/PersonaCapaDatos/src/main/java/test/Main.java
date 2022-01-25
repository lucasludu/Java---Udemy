package test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDAO;
import personas.jdbc.PersonaDaoJDBC;

public class Main {

    public static void main(String[] args) {
        // Utilizamos el tipo interface como referencia a una clase concreta
        PersonaDAO personaDao = new PersonaDaoJDBC();

        // Creamos un nuevo registro
        // Hacemos uso de la clase persona DTO la cual se usa para transferir la informacion entre las capas
        // no es necesario especificar la llave primaria ya que en este caso es de tipo autonumerico y la BD se encarga de asignarle un nuevo valor
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Marito");
        persona.setApellido("Lopez01");
        // Utilizamos la capa DAO para persistir al objeto DTO
        try {
            personaDao.insert(persona);
            
            // Se elimina el registro con id_persona = 4
            personaDao.delete(new PersonaDTO(4));
            
            // Se actualiza el registro con id_persona = 2;
            PersonaDTO personaUpdate = new PersonaDTO();
            personaUpdate.setId_persona(2);
            personaUpdate.setNombre("Carolina");
            personaUpdate.setApellido("Gomez");
            personaDao.update(personaUpdate);
            
            // Selecciono todos los registros
            List<PersonaDTO> personas = personaDao.select();
            for(PersonaDTO personasDTO : personas) {
                System.out.println(personasDTO);
                System.out.println("");
            }
        } catch(SQLException ex) {
            System.out.println("Excepcion en la capa de prueba.");
            ex.printStackTrace(System.out);
        }
    }
    
}
