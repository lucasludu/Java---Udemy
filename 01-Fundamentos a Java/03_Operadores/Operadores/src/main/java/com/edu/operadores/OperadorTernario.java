package com.edu.operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        
        var resultado = (1 > 2) ? "Verdadero" : false;
        System.out.println("Resultado = " + resultado);
        
        var numero = 5;
        var par = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("Paridad = " + par);
        
    }
    
}
