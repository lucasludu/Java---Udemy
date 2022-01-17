package com.edu.primitivos;

public class PrimitivoFlotante {

    public static void main(String[] args) {
        
        // TAMBIEN SE PUEDE HACER CON LA VARIABLE (VAR)
        
        float floatVar = 1000.10F; // Al float se le agrega "F" al final SIEMPRE!!
        System.out.println("FloatVar: " + floatVar);
        
        System.out.println("Numero de BITS de tipo FLOAT: " + Float.SIZE);
        System.out.println("Numero de BYTE de tipo FLOAT: " + Float.BYTES);
        System.out.println("Valor minimo de tipo FLOAT: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de tipo FLOAT: " + Float.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
        double doubleVar = 1000.10; 
        System.out.println("DoubleVar: " + doubleVar);
        
        System.out.println("Numero de BITS de tipo DOUBLE: " + Double.SIZE);
        System.out.println("Numero de BYTE de tipo DOUBLE: " + Double.BYTES);
        System.out.println("Valor minimo de tipo DOUBLE: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de tipo DOUBLE: " + Double.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
    }
    
}
