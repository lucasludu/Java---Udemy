package com.edu.operadores;

public class OperadoresIgualRelac {

    public static void main(String[] args) {
        
        int a = 3, b = 2;
        
        boolean c = (a == b);
        System.out.println("c = " + c);
        
        c = (a != b);
        System.out.println("c = " + c);
        
        String cadena = "Hola";
        String cadena1 = "Chao";
        System.out.println(cadena.equals(cadena1));
        
        boolean d = a > b;
        System.out.println("d = " + d);
        boolean e = a < b;
        System.out.println("e = " + e);
        
        if(b % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
        int edad = 20;
        int adulto = 18;
        if(edad >= adulto) {
            System.out.println("ADULTO");
        } else {
            System.out.println("MENOR");
        }
        
    }
    
}
