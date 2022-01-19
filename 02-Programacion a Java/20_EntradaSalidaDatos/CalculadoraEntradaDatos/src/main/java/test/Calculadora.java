package test;

import java.util.*;
import static calculadora.Operaciones.sumar;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el primer valor: ");
        int a = scanner.nextInt(); // Nextint no lee lineas completas (warning!)
        System.out.println("Proporciona el segundo valor: ");
        int b = scanner.nextInt();
        
        int resultado = sumar(a, b);
        System.out.println("resultado = " + resultado);
        
    }
}
