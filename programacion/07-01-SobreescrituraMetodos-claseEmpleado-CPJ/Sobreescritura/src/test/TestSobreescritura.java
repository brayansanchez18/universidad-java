package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
        Gerente gerente2 = new Gerente("Jesus", 7000, "Igresos");
        System.out.println("gerente2 = " + gerente2.obtenerDetalles());
    }
}
