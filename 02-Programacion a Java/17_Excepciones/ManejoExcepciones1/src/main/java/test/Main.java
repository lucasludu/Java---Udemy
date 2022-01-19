package test;

import domain.Division;
import domain.OperacionExcepcion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

//    public static void main(String[] args) throws OperacionExcepcion {
//        
//        Division division = new Division(10, 0);
//        
//    }
    
    public static void main(String[] args) {
        
        try {
            Division division = new Division(10, 0);
        } catch (OperacionExcepcion ex) {
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("El programa continua.");        
    }
    
}
