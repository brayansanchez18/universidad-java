package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
