package com.edu.ciclos;

public class CicloWhile {

    public static void main(String[] args) {
        
        var contador = 0;
        
//        while(contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }
        
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while(contador < 3);
        
    }
    
}
