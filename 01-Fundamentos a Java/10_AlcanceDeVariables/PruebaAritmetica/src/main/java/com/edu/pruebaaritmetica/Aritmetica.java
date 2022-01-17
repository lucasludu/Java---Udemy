package com.edu.pruebaaritmetica;

public class Aritmetica {
    
    // Atributos de la clase
    int a;
    int b;
    
    // Constructor Vacio
    public Aritmetica() {
    }
    
    // Constructor por parametros
    public Aritmetica (int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int sumar () {
        return this.a + this.b;
    }
    
    public int restar() {
        return this.a - this.b;
    }
    
    public int multiplicar() {
        return this.a * this.b;
    }
    
    public int dividir() {
        return this.a / this.b;
    }
    
}
