package paquete2;

import paquete1.Clase1;

public class Clase4 {
    
    public Clase4() {
        // Prueba de constructores de la clase1
        new Clase1(); // Llamada al constructor publico
        /** 
         *   No podemos llamar a constructores protected, default, privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // new Clase1("uno", "dos"); // Llamada al constructor protected
        // new Clase1("uno", "dos", "tres"); // Llamada al constructor default o package
        // new Clase1("uno", "dos", "tres", "cuatro"); // Llamada al constructor private
        System.out.println("-----------------------------------------------");
    }
    
    public void pruebaDesdeClase4() {
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributosPublicos);
        /** 
         *   No podemos llamar a constructores default, privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // System.out.println("atributo protegido: " + c1.atributoProtegido); // Se puede usar sin hacer el uso de la referncia del objeto c1
        // System.out.println("atributo default o package: " + c1.atributoDefault);
        // System.out.println("atributo privado: " + c1.atributoPrivado);
        System.out.println("----------------------------------------");
        System.out.println("Meotod publico: " + c1.metodoPublico());
        /** 
         *   No podemos llamar a constructores default, privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // System.out.println("Meotod protegido: " + c1.metodoProtegido());
        // System.out.println("Meotod default o package: " + c1.metodoDefault());
        // System.out.println("Meotod privado: " + c1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();
    }
    
}
