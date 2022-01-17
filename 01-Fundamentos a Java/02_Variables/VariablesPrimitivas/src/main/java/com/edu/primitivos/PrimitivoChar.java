package com.edu.primitivos;

public class PrimitivoChar {

    public static void main(String[] args) {
        
        System.out.println("Numero de BITS de tipo CHAR: " + Character.SIZE);
        System.out.println("Numero de BYTE de tipo CHAR: " + Character.BYTES);
        System.out.println("Valor minimo de tipo CHAR: " + Character.MIN_VALUE);
        System.out.println("Valor maximo de tipo CHAR: " + Character.MAX_VALUE);
        
        // FIJAR TABLA DE UNICODE CHARACTERS
        
        char varChar = '\u0021';
        System.out.println("varChar: " + varChar);
        
        char varCharDecimal = 33;   // Para este caso no conviene usar la variable VAR
        System.out.println("VarCharDecimal: " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: " + varCharSimbolo);
        System.out.println("------------------------------------");
        
        
    }
    
}
