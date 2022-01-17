package ventas;

import com.gm.ventas.*;

public class Ventas {
    
    public static void main(String[] args) {
    
        // Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);
        
        // Crear varuis objetos de tipo orden
        Orden orden1 = new Orden();
        // Agregamos los productos a la orden
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        
        // Imprimimos la orden
        orden1.mostrarOrden();
        
    }
    
}
