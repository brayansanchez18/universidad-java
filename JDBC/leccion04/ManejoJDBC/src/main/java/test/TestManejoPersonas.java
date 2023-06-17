package test;

import com.sun.jdi.connect.spi.Connection;
import datos.Conexion;
import datos.PersonaDAO;
import java.sql.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        try {
            Connection conexion = (Connection) Conexion.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
