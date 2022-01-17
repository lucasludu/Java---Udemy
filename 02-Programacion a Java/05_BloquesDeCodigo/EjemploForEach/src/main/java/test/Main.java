package test;

import entidad.Persona;

public class Main {

    public static void main(String[] args) {
        
        int edades[] = { 15, 20, 25, 30, 35, 40 };
        for(int edad : edades) {
            System.out.println("edad = " + edad);
        }

        System.out.println("---------------------------------------------");
        Persona personas[] = { new Persona("Juan"), new Persona("Karla") };
        for(Persona p : personas) {
            System.out.println("p = " + p);
        }
    }
    
}
