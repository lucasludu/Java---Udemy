package com.edu.sentencias;

import java.util.Scanner;

public class IfElse2 {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese mes del año: ");
        var mes = scanner.nextInt();
        String estacion = null;
        
        if(mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
        } else if(mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if(mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if(mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
        } else {
            estacion = "Mes Incorrecto";
        }
        System.out.println("estacion = " + estacion + " para el mes de " + mes);
         
    }
    
}
