package com.edu.pruebaaritmetica;

public class Main {

    public static void main(String[] args) {
        
        // Creo el objeto de tipo aritmetica.
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 5;
        aritmetica.b = 4;
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);
        
        System.out.println("-------------------------------------------");
        
        // Se crea un segundo objeto aritmetico
        Aritmetica aritmetica2 = new Aritmetica(10, 5);
        System.out.println("resultado = " + aritmetica2.sumar());
    }
    
}
