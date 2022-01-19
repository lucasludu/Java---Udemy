package test;

import datos.*;
import excepciones.*;

public class Main {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionMysql();
        datos.simularError(false);
        ejecutar(datos, "listar");
        
        System.out.println("-----------------------------------------");
        
        AccesoDatos datos1 = new ImplementacionOracle();
        datos1.simularError(true);
        ejecutar(datos1, "insertar");
        
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) { // Primero las Excepciones de menor jerarquia
                System.out.println("Error de Lectura.");
                ex.printStackTrace(System.out);
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso a datos.");
                ex.printStackTrace(System.out);
            } catch(Exception ex) {
                System.out.println("Error general.");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Procesar finally es opcional, pero siempre se va a ejecutar.");
            }
        } else if("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Procesar finally es opcional, pero siempre se va a ejecutar.");
            }
        } else {
            System.out.println("No se proporciono ninguna accion conocida.");
        }
    }
    
}
