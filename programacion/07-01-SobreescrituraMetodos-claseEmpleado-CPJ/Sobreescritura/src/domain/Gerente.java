package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        // el super se usa para obtener los atributos de la clase padre
        return super.obtenerDetalles() + ", departamento:" + this.departamento;
    }
    
}