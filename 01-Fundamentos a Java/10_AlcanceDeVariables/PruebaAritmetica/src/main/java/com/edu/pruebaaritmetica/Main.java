package com.edu.pruebaaritmetica;

public class Main {

    public static void main(String[] args) {
        
        // variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        // Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        
        // Imprimimos los valores de los operadores
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        // Imprimimos los resultados de la suma
        System.out.println("\nResultado de la suma: " + objeto1.sumar());
        // Imprimimos los resultados de la resta
        System.out.println("\nResultado de la resta: " + objeto1.restar());
        // Imprimimos los resultados de la multiplicacion
        System.out.println("\nResultado de la multiplicacion: " + objeto1.multiplicar());
        // Imprimimos los resultados de la division
        System.out.println("\nResultado de la division: " + objeto1.dividir());
        
    }

}
