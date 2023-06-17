package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        // FiguraGeometrica figura = new FiguraGeometrrica();
        
        FiguraGeometrica figura = new Rectangulo("rectangulo");
        figura.dibujar();
    }
}