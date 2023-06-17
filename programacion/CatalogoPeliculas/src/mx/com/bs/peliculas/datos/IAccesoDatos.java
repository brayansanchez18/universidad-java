package mx.com.bs.peliculas.datos;

import java.util.List;
import mx.com.bs.peliculas.domain.Pelicula;
import mx.com.bs.peliculas.excepciones.*;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    String Buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    void crear(String nombreRecurso) throws AccesoDatosEx;
    void borrar(String nombreRecurso) throws AccesoDatosEx;

}