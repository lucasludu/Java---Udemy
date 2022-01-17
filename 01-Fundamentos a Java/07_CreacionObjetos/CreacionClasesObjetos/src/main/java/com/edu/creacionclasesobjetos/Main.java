package com.edu.creacionclasesobjetos;

public class Main {

    public static void main(String[] args) {
        
        // Creacion Objeto de tipo persona
        
        // Defino variable de tipo persona
        Persona persona1;
        
        // Instancio el objeto a la clase persona
        persona1 = new Persona();
        
        // Accedo al objeto y llamo al metodo desplegarnombre
        persona1.desplegarNombre();
        
        // Se modifica los valores de los atributos de tipo persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        // Vuelvo a imprimir los valores.
        System.out.println("-----------------------------------------");
        persona1.desplegarNombre();
        
        // Se crea un objeto nuevo de tipo persona
        Persona persona2 = new Persona();
        persona2.nombre = "Lucia";
        persona2.apellido = "Alonso";
        
        System.out.println("-----------------------------------------");
        persona2.desplegarNombre();
        
    }
    
}
