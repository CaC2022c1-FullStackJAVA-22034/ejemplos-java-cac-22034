
package ejemplos.clase03;

import ejemplos.clase02.Producto;
import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Domicilio d = new Domicilio("Callao",123,"Balvanera");
        Tienda t = new Tienda("CaC Insumos", d);        
                
        t.agregarProducto( new Producto("a1", "Teclado", 4, 14.3) );
        t.agregarProducto( new Producto("a2", "Mouse", 2, 5.8) );
        t.agregarProducto( new Producto("a3", "Monitor", 3, 200) );
        t.agregarProducto( new Producto("a4", "Placa de video", 5, 356.9) );
        t.agregarProducto( new Producto("a5", "Parlantes", 2, 86.4) );
        
        System.out.println("Todos los productos");
        t.verProductos();
//        
//        System.out.println("Productos con rating >=3");
//        t.verProductosConRatingMayorA(3);
        
//        System.out.println("Todos los productos con 10% arriba");
//        t.subirLosPrecios(10);
//        t.verProductos();

        System.out.println("Reemplazo Monitor por Webcam");
        t.reemplazarProducto("a3", new Producto("a7", "Webcam HD", 4, 56.7));
        
        System.out.println("Todos los productos");
        t.verProductos();
    }

}
