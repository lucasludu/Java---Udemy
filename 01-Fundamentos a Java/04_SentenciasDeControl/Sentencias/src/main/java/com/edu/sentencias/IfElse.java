package com.edu.sentencias;

public class IfElse {

    public static void main(String[] args) {
        
        boolean condicion = true;
        if(condicion) {
            System.out.println("Condicion Verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }
        
        var numero = 2;
        var numeroTexto = "Numero Desoonocido";
        if(numero == 1) {
            numeroTexto = "Numero UNO";
        } else if(numero == 2) {
            numeroTexto = "Numero DOS";
        } else if(numero == 3) {
            numeroTexto = "Numero TRES";
        } else {
            numeroTexto = "Numero Desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
