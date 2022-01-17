package com.edu.primitivos;

public class PrimitivosBoolean {

    public static void main(String[] args) {
        
        // boolean
        System.out.println("True tipo boolean: " + Boolean.TRUE);
        System.out.println("False tipo boolean: " + Boolean.FALSE);
        
        boolean booleanVar = false;
        
        if(booleanVar) {
            System.out.println("El valor es verdadero.");
        } else {
            System.out.println("El valor es falso.");
        }
        
        System.out.println("-------------------------------------");
        
        var edad = 30;
        var esAdulto = edad >= 18;
        System.out.println("Es adulto: " + esAdulto);
        
        
    }
    
}
