package test;

import java.io.*;

public class EntradaDatos1 {

    public static void main(String[] args) {

        String captura;
        InputStreamReader input = new InputStreamReader(System.in); // Lee informacion de la consola (caracter por caracter) no lee lineas completas
        BufferedReader brInput = new BufferedReader(input);
        
        System.out.println("Introduce un dato");
        try {
            captura = brInput.readLine();
            System.out.println("Dato introducido: " + captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
