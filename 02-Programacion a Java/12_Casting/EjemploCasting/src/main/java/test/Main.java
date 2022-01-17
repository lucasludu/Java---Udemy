package test;

import entidades.*;
import enumeracion.TipoEscritura;

public class Main {

    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        System.out.println(empleado);
        
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor);
        System.out.println(escritor.getTipoEscritura());
        System.out.println(escritor.getTipoEscrituraEnTexto());
        
        System.out.println(((Escritor)empleado).getTipoEscrituraEnTexto());
        
        empleado = new Gerente("Genga", 5000, "Sistemas");
        System.out.println(((Gerente)empleado).getDepartamento());
    }
    
}
