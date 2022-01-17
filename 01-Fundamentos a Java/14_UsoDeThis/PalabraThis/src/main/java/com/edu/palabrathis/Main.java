package com.edu.palabrathis;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Carlito");
        
    }

}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre; // Apunta al objeto de tipo persona
        System.out.println("Impresion del operador this dentro de la clase persona: " + this); // this apunta a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); // contiene una referencia al objeto persona
    }

}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("Impresion Argumento Persona: " + p); // Valor del objeto persona
        System.out.println("Impresion Objeto Actual (this) " + this); // Apunta al objeto de tipo imprimir en este momento
    }

}
