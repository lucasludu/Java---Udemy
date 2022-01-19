package test;

import genericos.ClaseGenerica;

public class Main {

    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
        objetoString.obtenerTipo();
        
        // No es posible usar tipos primitivos en clase generica (solo object)
        // ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(1):
        
    }
    
}
