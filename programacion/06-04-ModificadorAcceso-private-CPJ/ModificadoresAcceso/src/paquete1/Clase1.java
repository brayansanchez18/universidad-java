package paquete1;

class Clase1 {
    // un atributo privado ya no se puede modificar su valor en otras clases asi estas se encuentren en el mismo paquete
    // para leerlo o modificarlo debemos emplear el metodo de encapzulamiento (get/set)
    private String atributoPrivado = "Valor atributo privado";
    
    // el xonstructor privado solo se va a poder utilizar dentro de esta misma clase
    private Clase1(){
        System.out.println("Constructor privado");
    } 
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
