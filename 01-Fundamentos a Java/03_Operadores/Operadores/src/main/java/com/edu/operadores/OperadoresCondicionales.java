package com.edu.operadores;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        
        int a = 10;
        int valorMinimo = 0, valorMaximo = 15;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = true;
        boolean diaDescanso = false;
        if(vacaciones || diaDescanso)
            System.out.println("No tiene que trabajar");
        else 
            System.out.println("Tiene que trabajar");
        
    }
    
}
