package test;

import domain.*;

public class Presentar {
    public static void main(String[] args) {
        var persona = new Persona("victor", "sanchez", "xxxxxxxx");
        System.out.println("persona = " + persona);
        
        var estudiante = new Estudiante("juan", "chavez", "xxxxxx`", 1234, 3, "sistemas");
        System.out.println("estudiante = " + estudiante);
        
        var profesor = new Profesor("gerardo", "anastasio", "xxxxxx", 2, "sistemas", "POO");
        System.out.println("profesor = " + profesor);
    }
}