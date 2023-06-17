package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        
        // DIFERENCIAS ENTRE  LIST Y SET
        
        // LIST: te guarda los documentos en orden y te permite repetir elementos
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
//        String elemento = miLista.get(0);
//        System.out.println("Elemento: " + elemento);

//         imprimir(miLista);
        
        // SET: no te ordena los elementos y no te deja epetirlos
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Emanuel");
        miMapa.put("valor2", "Ivett");
        miMapa.put("valor3", "Alejandra");
        
        String elementoMapa = miMapa.get("valor1");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }
    
    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento = " + elemento);
        });
    }
}