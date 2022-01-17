package com.edu.sentencias;

public class Switch {

    public static void main(String[] args) {
        
        var numero = 3;
        var numeroTexto = "Numero Desconocido";
        
        switch(numero) {
            case 1:
                numeroTexto = "Numero UNO";
                break;
            case 2:
                numeroTexto = "Numero DOS";
                break;
            case 3:
                numeroTexto = "Numero TRES";
                break;
            default:
                numeroTexto = "Numero Desconocido";
        }
        
        System.out.println("numeroTexto = " + numeroTexto + " para numero proporcionado " + numero);
        
    }
    
}
