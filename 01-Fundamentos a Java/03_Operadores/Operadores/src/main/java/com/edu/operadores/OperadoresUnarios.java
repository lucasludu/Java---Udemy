package com.edu.operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        
        int a = 3;
        int b = -2;
        System.out.println("b = " + b);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);
        
        // INCREMENTO
        // Pre-Incremento
        System.out.println("PRE-INCREMENTO:");
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // Post-Incremento
        System.out.println("POST-INCREMENTO:");
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        // DECREMENTO
        // Pre-Decremento
        System.out.println("PRE-DECREMENTO:");
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post-Decremento
        System.out.println("POST-DECREMENTO:");
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
    
}
