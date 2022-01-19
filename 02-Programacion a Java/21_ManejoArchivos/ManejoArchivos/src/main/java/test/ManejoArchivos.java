package test;

import static utileria.Archivo.*;

public class ManejoArchivos {

    public static void main(String[] args) {
        
        String nombreArchivo = "C:\\pruebaJava\\archivoPruebaJava.txt";
        
        // Creamos un archivo
        //crearArchivo(nombreArchivo);
        
        // Escribir archivo
        //escribirArchivo(nombreArchivo);
        
        // Leer informacion Archivo
        //leerArchivo(nombreArchivo);
        
        // Anexamos informacion al archivo
        anexarArchivo(nombreArchivo);
        
        // Leer del archivo
        leerArchivo(nombreArchivo);
    }
    
}
