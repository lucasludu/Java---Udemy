package com.edu.palabrareturntipoprimitivo;

public class PalabraReturnTipoPrimitivo {

    public static void main(String[] args) {
        
        sumarSinRetornarValor(3,6);
        
        sumarRetornandoValor(5, 2);
        
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado sin retornar valor es: " + (a+b));
        return; // opcional
    }

    private static int sumarRetornandoValor(int a, int b) {
        if(a == 0 && b == 0) {
            System.out.println("Ingrese numeros distintos de cero.");
            return 0;
        }
        System.out.println("Los valores proporcionados son distintos a cero.");
        return (a+b);
    }
    
}
