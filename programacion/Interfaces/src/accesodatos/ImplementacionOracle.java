package accesodatos;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde ORACLE");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde ORACLE");
    }
    
}