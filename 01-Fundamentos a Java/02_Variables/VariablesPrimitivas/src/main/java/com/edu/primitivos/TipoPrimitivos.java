package com.edu.primitivos;

import java.util.Scanner;

public class TipoPrimitivos {

    public static void main(String[] args) {

        // Convertir un String a un tipo Int
        var edad = Integer.parseInt("20");
        System.out.println("Edad: " + edad);
        
        // Convierte un String a un double
        double valorPi = Double.parseDouble("3.1416");
        System.out.println("PI: " + valorPi);
        
        // Convierte un String a un Char
        char c = "Hola".charAt(0);
        System.out.println("C: " + c);
        
        var scanner = new Scanner(System.in);
        System.out.println("Scanner: ");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Edad: " + edad);
        
        System.out.println("Scanner: ");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("Caracter: " + caracter);

        // Convertimos un valor entero a un String
        String valorTexto = String.valueOf(35);
        System.out.println("Valor de Texto: " + valorTexto);
        
        // Si le pongo un valor mayor a 127 el byte va sufrir perdidas de bits
        short s = 130;
        // byte b = s; // Un tipo short no entra en un tipo byte ya que el short es de 16bits y byte es de 8.
        byte b = (byte) s; 
        System.out.println("B: " + b);
    }

}
