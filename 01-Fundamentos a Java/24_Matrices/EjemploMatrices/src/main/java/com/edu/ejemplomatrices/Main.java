package com.edu.ejemplomatrices;

public class Main {

    public static void main(String[] args) {
        
        // 1 - Declaro matriz de tipo INT
        int edades[][];
        // 2 - Instancio la matriz de INT
        edades = new int[3][2];
        // 3 - Inicializo los valores de la matriz de INT
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        // Imprimimos los valores a la salida estándar
        // 4 - Leemos los valores de cada elemento de la matriz.
        System.out.println("Matriz de enteros incice 0 - 0: " + edades[0][0]);
        System.out.println("Matriz de enteros incice 0 - 1: " + edades[0][1]);
        System.out.println("Matriz de enteros incice 1 - 0: " + edades[1][0]);
        System.out.println("Matriz de enteros incice 1 - 1: " + edades[1][1]);
        System.out.println("Matriz de enteros incice 2 - 0: " + edades[2][0]);
        System.out.println("Matriz de enteros incice 2 - 1: " + edades[2][1]);
        
        System.out.println("---------------------------------------------");
        
        // 1 - Matriz de tipo String, notacion simplificada.
        String nombres[][] = { {"Teresa", "Cesar", "William"}, {"Yesica", "Esteban", "Maria"} };
        
        // Largo de elementos de la matriz. Primero el numero de renglones.
        System.out.println("Largo matriz renglones: " + nombres.length);
        // Seleccionando un renglon valido nos regresa el numero de columnas.
        System.out.println("Largo matriz columnas: " + nombres[0].length);
        
        // Imprimimos los valores a la salida estandar
        // 2 - Iteramos la matriz de String con un for anidado.
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Matriz String indice [" + i + "][" + j + "]: " + nombres[i][j]);
            }
        }
      
    }
    
}
