package com.edu.primitivos;

public class Base {

    public static void main(String[] args) {
        
        // TODO ESTO ES SOPORTADO SI USA LA PALABRA RESERVADA "VAR" (VAR ES A PARTIR DE JDK-10)
        
        int numDecimal = 10;
        System.out.println("Numero Decimal: " + numDecimal);
        
        int numOctal = 012; // Con el 0 delante ya determina que es OCTAL
        System.out.println("Numero octal: " + numOctal);
        
        int numHexadecimal = 0XA; // Con 0X delante ya determina que es HEXADECIMAL
        System.out.println("Numero hexadecimal: " + numHexadecimal);
        
        int numBinario = 0B1010; // Con el OB delante determina que es BINARIO
        System.out.println("Numero binario: " + numBinario);

    }
    
}
