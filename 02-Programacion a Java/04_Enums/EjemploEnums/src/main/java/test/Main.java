package test;

import enumeraciones.*;

public class Main {

    public static void main(String[] args) {

        // Valor del primer dia.
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);
        
        // Usamos la enumeracion de los paises.
        System.out.println("Continente no. 4: " + Continentes.EUROPA);
        System.out.println("Accedemos al numero de paises del continente no. 4: " + Continentes.EUROPA.getPaises());
        
        indicarDia(Dias.JUEVES);
    }

    private static void indicarDia(Dias dias) {
        switch(dias) {
            case LUNES:
                System.out.println("Primer dia de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana.");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana.");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana.");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana.");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
    
}
