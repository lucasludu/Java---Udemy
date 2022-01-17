import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        
        /*
        var usuario = "Juan";
        var saludar = "Hola";
        
        System.out.println(saludar + " " + usuario);
        
        var i = 3;
        var j = 5;
        // El orden de la operacion es de izquierda a derecha (para concatenar)
        System.out.println(i+j);    // 8
        System.out.println(saludar + i + j);    // Hola35 
        System.out.println(saludar + (i + j));  // Hola8
        System.out.println(i + j + saludar);    // 8Hola
        */
        
        /*
        var saludos = "Hola desde Java";
        System.out.println(saludos);
        
        // Si se usa la variable VAR si o si hay que agregarle un valor para saber que tipo de variable es.
        int _hola;
        float $adios;
        char adios;
        */
        
        /*
        String nombre = "Karla";
        String apellido = "Esparza";
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva Liena:: \n" + nombre);
        System.out.println("Tabulador: \t " + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre); // Elimina :
        System.out.println("Retorno de carro: \r" + nombre); // Similar al \n
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Simple: \"" + nombre + "\"");
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        var usuario = sc.nextLine();
        System.out.println("Usuario: " + usuario);
        
        
        
        
    }
    
}
