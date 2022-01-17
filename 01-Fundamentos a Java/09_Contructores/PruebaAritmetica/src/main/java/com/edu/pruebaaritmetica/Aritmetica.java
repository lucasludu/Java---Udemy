package com.edu.pruebaaritmetica;

public class Aritmetica {
    
    // Atributos de la clase
    int a;
    int b;
    
    // Constructor Vacio
    public Aritmetica() {
//        a = 5;
//        b = 3;
    }
    
    // Constructor por parametros
    public Aritmetica (int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    
    public int sumar () {
        int resultado = a + b; // Se utilizan los atributos de la clase
        return resultado;
    }
    
}
