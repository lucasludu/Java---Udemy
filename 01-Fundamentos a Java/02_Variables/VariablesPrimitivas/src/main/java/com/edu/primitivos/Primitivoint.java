package com.edu.primitivos;

public class Primitivoint {

    public static void main(String[] args) {
        
        // Byte - Short - int - long
        byte byteVar = 127;
        System.out.println("ByteVar: " + byteVar);
        
        System.out.println("Numero de BITS de tipo BYTE: " + Byte.SIZE);
        System.out.println("Numero de BYTE de tipo BYTE: " + Byte.BYTES);
        System.out.println("Valor minimo de tipo BYTE: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de tipo BYTE: " + Byte.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
        short shortVar = 32767;
        System.out.println("ShortVar: " + shortVar);
        
        System.out.println("Numero de BITS de tipo SHORT: " + Short.SIZE);
        System.out.println("Numero de BYTE de tipo SHORT: " + Short.BYTES);
        System.out.println("Valor minimo de tipo SHORT: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de tipo SHORT: " + Short.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
        int intVar = 2147483647;
        System.out.println("intVar: " + intVar);
        
        System.out.println("Numero de BITS de tipo INT: " + Integer.SIZE);
        System.out.println("Numero de BYTE de tipo INT: " + Integer.BYTES);
        System.out.println("Valor minimo de tipo INT: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de tipo INT: " + Integer.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
        long longVar = 9223372036854775807L;
        System.out.println("LongVar: " + longVar);
        
        System.out.println("Numero de BITS de tipo LONG: " + Long.SIZE);
        System.out.println("Numero de BYTE de tipo LONG: " + Long.BYTES);
        System.out.println("Valor minimo de tipo LONG: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de tipo LONG: " + Long.MAX_VALUE);
        
        System.out.println("------------------------------------");
        
        /*
        Esta variable no es de tipo Byte/Short. Por default es de Tipo INT, 
        tambien puede ser de tipo LONG si le agregamos L al final
        */
        var numero = 2147483647;  
        System.out.println("Numero INT: " + numero);
        
        var numero1 = 9223372036854775807L;  
        System.out.println("Numero LONG: " + numero1);
     
        
    }
    
}
