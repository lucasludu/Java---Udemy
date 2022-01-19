package test;

import java.util.*;

public class EntradaDatos {

    public static void main(String[] args) {
        
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un dato: ");
        captura = scanner.nextLine();
        while(!"salir".equals(captura)) {
            System.out.println("El dato itroducido: " + captura);
            System.out.println("Introduce otro dato: ");
            captura = scanner.nextLine();
        }
    }
    
}
