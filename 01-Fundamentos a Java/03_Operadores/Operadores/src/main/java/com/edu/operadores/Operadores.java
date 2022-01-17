package com.edu.operadores;

public class Operadores {

    public static void main(String[] args) {
        
        int a = 3, b = 6;
        
        var rdo = a + b;
        System.out.println("A + B: " + rdo);
        
        System.out.println("Rdo 1: " + a + b);
        System.out.println("Rdo 1: " + (a + b));
        
        rdo = a - b;
        System.out.println("A - B: " + rdo);
        
        rdo = a * b;
        System.out.println("A * B: " + rdo);
        
        var rdo1 = (float) a / b;
        System.out.println("A / B: " + rdo1);
        
        rdo = a % b;
        System.out.println("A % B:  " + rdo);
        
        rdo = a % 2;
        System.out.println("A % 2: " + rdo);
        
        rdo = b % 2;
        System.out.println("B % 2: " + rdo);
        
        if(rdo == 0)
            System.out.println("PAR");
        else 
            System.out.println("IMPAR");
        
    }
    
}
