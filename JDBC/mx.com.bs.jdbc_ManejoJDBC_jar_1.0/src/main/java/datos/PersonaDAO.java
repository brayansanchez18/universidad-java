package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    private static final String SQL_SELECT = "SELECT id, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? where id = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id = ?";
    
    // CREAMOS EL METODO READ
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        
        try {
            conn = getConnection(); // establecemos conexion
            stmt = conn.prepareStatement(SQL_SELECT); // hacemos la consulta
            rs = stmt.executeQuery(); // ejecutamos el query sql
            
            // iteramos cada resultado y lo asignamos a la lista como un objeto de tipo persona
            while (rs.next()) {                
                // recupaamos columna x vaiable
                int idPersona = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                // CREAMOS EL OBJETO DE TIPO PERSONA CON CADA UNA DE LAS VARIABLES
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                // AGREGAMOS EL OBJETO A LA LISTA
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                // mandamos a cerar los objetos en caso de que esten abiertos
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        return personas;
    }
    
    // CREAMOS EL METODO CREATE
    public int insertar (Persona persona) { // como parametro le pasamos un objeto de tipo persona
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection(); // establecemos la conexion
            stmt = conn.prepareCall(SQL_INSERT); // llamamos a la sentencia sql a ejecutar
            // adignamos los valor a los parametros en la sentencia values
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            // ejecutamos la sentencia y esta nos debe retornar el numero de registros que fueron afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        // retornamos los registros afectados
        return registros;
    }
    
    // CREAMOS EL METODO DE UPDATE
    public int actualizar (Persona persona) { // como parametro le pasamos un objeto de tipo persona
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection(); // establecemos la conexion
            stmt = conn.prepareCall(SQL_UPDATE); // llamamos a la sentencia sql a ejecutar
            // adignamos los valor a los parametros en la sentencia values
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            // ejecutamos la sentencia y esta nos debe retornar el numero de registros que fueron afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        // retornamos los registros afectados
        return registros;
    }
    
    // CREAMOS EL METODO DELETE
    public int eliminar (Persona persona) { // como parametro le pasamos un objeto de tipo persona
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = getConnection(); // establecemos la conexion
            stmt = conn.prepareCall(SQL_DELETE); // llamamos a la sentencia sql a ejecutar
            // adignamos los valor a los parametros en la sentencia values
            stmt.setInt(1, persona.getIdPersona());
            // ejecutamos la sentencia y esta nos debe retornar el numero de registros que fueron afectados
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        // retornamos los registros afectados
        return registros;
    }
}