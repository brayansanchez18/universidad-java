package domain;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    // sobre carga de constructores
    // crear un costructor para cada operacion que podamos o vallamos a realizar en la tabla

    // prodriamos tener la necesitad de crear objetos de tipo persona con el constructor vacio
    public Persona() {
    }

    // proodiamos eliminar registros de la base de datos para lo cual solo necesitamos el id
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    // prodriamos insertar datos a la tabla por lo cual necesitariamos todos los campos de latabla menos el id
    // el id se omite porque es autoincrementable
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    // podriamos modificar un elemento de la tabla para lo cual podriamos ocupar cada uno de los campos de esta
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    // si necesitamos modificar un atributo de manera individual
    // debamos agregar los metodos get y set de cada atributo
    
    // GET & SET - ID
    public int getIdPersona() { return idPersona; }
    public void setIdPersona(int idPersona) { this.idPersona = idPersona; }

    // GET & SET - NOMBRE
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // GET & SET - APELLIDO
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    // GET & SET - EMAIL
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // GET & SET - TELEFONO
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    // TAMBIEN AGREGAR EL METODO TOSTRING
    //PARA OBTENER EL ESTADO DEL METODO EN CUALQUIER MOMENTO
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona +
                                        ", nombre=" + nombre + 
                                        ", apellido=" + apellido + 
                                        ", email=" + email + 
                                        ", telefono=" + telefono + '}';
    }
    
}