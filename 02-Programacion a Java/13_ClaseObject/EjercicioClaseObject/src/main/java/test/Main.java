package test;

import dominio.Empleado;

public class Main {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        compararObjetos(empleado1, empleado2);
        
    }

    private static void compararObjetos(Empleado empleado1, Empleado empleado2) {
        System.out.println("empleado 1: " + empleado1);
        System.out.println("empleado 2: " + empleado2);
        
        // Revision por referencia
        if(empleado1 == empleado2) {
            System.out.println("Los objetos tienen la misma direccion en memoria.");
        } else {
            System.out.println("Los objetos tienen distinta direccion en memoria.");
        }
        
        // Revision del metodo equals
        if(empleado1.equals(empleado2)) {
            System.out.println("Los objetos tienen el mismo contenido.");
        } else {
            System.out.println("Los objetos NO tienen el mismo contenido.");
        }
        
        // Revision del metodo hashCode
        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Los objetos tienen el mismo codigo hash.");
            System.out.println("empleado1 = " + empleado1.hashCode());
            System.out.println("empleado2 = " + empleado2.hashCode());
        } else {
            System.out.println("Los objetos NO tienen el mismo codigo hash.");
        }
        
     }
    
}
