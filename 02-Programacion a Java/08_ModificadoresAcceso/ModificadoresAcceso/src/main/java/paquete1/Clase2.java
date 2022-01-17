
package paquete1;

public class Clase2 {
    
    public Clase2() {
        // Prueba de constructores de la clase1
        new Clase1(); // Llamada al constructor publico
        new Clase1("uno", "dos"); // Llamada al constructor protected
        new Clase1("uno", "dos", "tres"); // Llamada al constructor default o package
        /** 
         *   No podemos llamar a constructores privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // new Clase1("uno", "dos", "tres", "cuatro"); // Llamada al constructor private
    }
    
    public void pruebaDesdeClase2() {
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributosPublicos);
        System.out.println("atributo protegido: " + c1.atributoProtegido);
        System.out.println("atributo default o package: " + c1.atributoDefault);
        /** 
         *   No podemos llamar a constructores privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // System.out.println("atributo privado: " + c1.atributoPrivado);
        System.out.println("----------------------------------------");
        System.out.println("Meotod publico: " + c1.metodoPublico());
        System.out.println("Meotod protegido: " + c1.metodoProtegido());
        System.out.println("Meotod default o package: " + c1.metodoDefault());
        /** 
         *   No podemos llamar a constructores privados desde otras clases sin
         *   importar que estamos en el mismo paquete 
         */
        // System.out.println("Meotod privado: " + c1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
    
}
