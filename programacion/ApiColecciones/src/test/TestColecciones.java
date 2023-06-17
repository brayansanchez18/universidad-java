package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        
        // DIFERENCIAS ENTRE  LIST Y SET
        
        // LIST: te guarda los documentos en orden y te permite repetir elementos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        // imprimir(miLista);
        
//        for (Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }

//        miLista.forEach(elemento -> {
//            System.out.println("Elemento = " + elemento);
//        });
        
        Set miSet = new HashSet();
        
        // SET: no te ordena los elementos y no te deja epetirlos
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Emanuel");
        miMapa.put("valor2", "Ivett");
        miMapa.put("valor3", "Alejandra");
        
        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento = " + elemento);
        });
    }
}