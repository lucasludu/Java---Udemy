package test;

import abstracto.domain.*;

public class Main {

    public static void main(String[] args) {
        
        // Creacion de objetos
        
        // No se puede crear objetos de clases abstractas.
        // FiguragGeometrica fg = new FiguragGeometrica();
        
        FiguragGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println("rectangulo = " + rectangulo);
        rectangulo.dibujar();
        
        System.out.println("------------------------------------------------");
        
        FiguragGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println("triangulo = " + triangulo);
        triangulo.dibujar();
        
        System.out.println("------------------------------------------------");
        
        FiguragGeometrica circulo = new Circulo("Circulo");
        System.out.println("circulo = " + circulo);
        circulo.dibujar();
        
    }
    
}
