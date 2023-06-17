package accesodatos;

public interface IAccesoDatos {
    /*
    Cualquier atributo que definamosen una interface va a ser una constante y esta debera tener un avalor asignado desde
    el inicio
    */
    
    int MAX_REGISTRO = 10;
    
    // cualquier metodo que agregemos va a ser publico y abstracto
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}