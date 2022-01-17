package prueba;

import com.gm.javadoc.Aritmetica;

/**
 * @author Lucaaas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica(3,2);
        int resultado = aritmetica1.sumar();
        System.out.println("resultado = " + resultado);
        
    }
    
}
