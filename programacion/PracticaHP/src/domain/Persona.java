package domain;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String curp;

    public Persona(String nombre, String apellido, String curp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Hola mi nombre es " + nombre + " " + apellido + " y mi CURP es " + curp;
    }

}