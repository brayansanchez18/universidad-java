package test;

import accesodatos.*;
import accesodatos.ImplementacionMySql;

public class TestInterfaces {
    public static void main(String[] args) {
        /* al ser una clse abstracta no podemos crear objetos de esta clase aunque la tengamos importada,
        por eso se crean claseas instanciadas de la calse padre y podemos crear objetos de estas
        con la estructura de la clase padre*/
        //IAccesoDatos datos = new IAcesoDatos();
        
        IAccesoDatos datos = new ImplementacionMySql();
        // datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
//        datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}