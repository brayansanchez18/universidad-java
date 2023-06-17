package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone_UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JBDC_PASSWORD = "admin";
    
    // CREAMOS LA CONEXION CON LA BASE DE DATOS
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JBDC_PASSWORD);
    }
    
    // ALMACENAMOS LOS DATOS DE LAS CONSULTAS
    // Un ResultSet es una clase de Java que sirve para almacenar datos de una consulta que hagamos con la clase Statement
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    
    // HACEMOS LAS CONSULTAS A LA BASE DE DATOS
    // Una PreparedStatement es una sentencia SQL precompilada.
    // Las utilizaremos en lugar de una Statement cuando haya que ejecutar varias veces una misma sentencia SQL con distintos parámetros
    public static void close(PreparedStatement stmt) throws SQLException {
        stmt.close();
    }
    
    // CERRAMOS LAS CONEXIONES
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}