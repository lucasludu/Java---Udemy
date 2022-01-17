package com.edu.operadores;

public class OperadorAsignacion {

    public static void main(String[] args) {
        
        int a = 3, b = 2;
        
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1;
        System.out.println("a = " + a);
        
        a += 3;
        System.out.println("a = " + a);
        
        b -= 1;
        System.out.println("b = " + b);
        
    }
    
}
