package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    
    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        // Elemento Repetido
        miLista.add(3);
        
        imprimir(miLista);
        
        System.out.println("--------------------------------------------");
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        // Elemento Repetido (No permite elementos duplicados)
        miSet.add("300");
        
        imprimir(miSet);
        
        System.out.println("--------------------------------------------");
        
        Map miMapa = new HashMap(); // NO RESPETA EL ORDEN
        // Llave | Valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Carlos");
        // Elemento Repetido, sustituye al valor agregado previamente
        miMapa.put("valor3", "Rosario");
        
        // Imprimimos todas las llaves
        imprimir(miMapa.keySet()); // Regresa el set de todas las llaves 
        // Imprimimos los valores
        imprimir(miMapa.values());
        
        System.out.println(miMapa.get("valor3"));;
        
    }
    
    // Collection  es el padre de todos los List
    private static void imprimir(Collection collection) {
        for(Object elemento : collection) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");
    } 
    
}
