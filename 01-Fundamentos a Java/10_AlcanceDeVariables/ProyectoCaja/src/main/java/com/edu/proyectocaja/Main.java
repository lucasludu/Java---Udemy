package com.edu.proyectocaja;

public class Main {

    public static void main(String[] args) {

        Caja caja1 = new Caja(3, 2, 6);
        System.out.println("Volumen = " + caja1.volumen());
        
        int alto = 4;
        int ancho = 4;
        int profundo = 2;

        Caja caja2 = new Caja(ancho, alto, profundo);
        System.out.println("Volumen = " + caja2.volumen());

    }

}
