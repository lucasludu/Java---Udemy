package test;

public class Main {

    public static void main(String[] args) {

        // Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        
        // Unboxing (extraemos tipo primitivo del objeto envolvente)
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        System.out.println("------------------------------------------------");
        
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Int a partir del float: " + floatObj.intValue());
    }
    
}
