package com.edu.ciclos;

public class Etiquetas {

    public static void main(String[] args) {
        
        inicio:
        for (var i = 0; i < 3; i++) {
            // Se imprime numeros pares
            if (i % 2 != 0) {
                break inicio;
//                continue inicio;
            }
            System.out.println("i = " + i);
        }
        
    }
    
}
