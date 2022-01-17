package com.edu.operadores;

public class OperadoresPrecedencia {

    public static void main(String[] args) {
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\nEjemplo Precedencia Operadores");
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);

        resultado = (++x + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
    }
    
}
