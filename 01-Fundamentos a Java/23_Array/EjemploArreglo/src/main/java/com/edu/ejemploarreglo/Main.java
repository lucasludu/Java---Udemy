package com.edu.ejemploarreglo;

public class Main {

    public static void main(String[] args) {
        
        // 1 - Declaro arreglo tipo INT
        int edades[];
        // 2 - Instanciamos el arreglo de INT
        edades = new int[3]; 
        // 3 - Inicializamos los valores del arreglo de INT
        edades[0] = 30;
        edades[1] = 15;
        
        // 4 - Leemos los valores de cada elemento del arreglo
        System.out.println("Arreglo de enteros indice 0: " + edades[0]);
        System.out.println("Arreglo de enteros indice 1: " + edades[1]);
        
        System.out.println("------------------------------------------------------------");
        
        Persona personas[];
        personas = new Persona[4];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Carla");
        
        System.out.println("Arreglo de persona indice 0: " + personas[0]);
        System.out.println("Arreglo de persona indice 1: " + personas[1]);
        
        System.out.println("------------------------------------------------------------");
        
        String nombres[] = { "Sara", "Laura", "Carlos", "Carmen" };
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
    }
    
}
