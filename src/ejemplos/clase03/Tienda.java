
package ejemplos.clase03;

import ejemplos.clase02.Producto;
import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Tienda {
    private String nombre;
    private Domicilio domicilio;
    private ArrayList<Producto> productos;

    public Tienda(String nombre, Domicilio domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.productos = new ArrayList<>();
    }

    public void verProductos() {
        /*for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.println(p);
        }*/     
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void verProductosConRatingMayorA(int minRating) {
        for (Producto producto : productos) {
            if (producto.getRating() >= minRating) {
                System.out.println(producto);
            }
        }
    }
    // 10
    public void subirLosPrecios(double porc) {
        for (Producto producto : productos) { // Por cada Producto en la lista de productos
            // SIN "Tell, don't ask"
            //producto.setPrecio( producto.getPrecio() * (1 + (porc / 100)) );
            // CON "Tell, don't ask"
            producto.aumentarPrecio(porc);
        }
    }
    
    public void reemplazarProducto (String id, Producto nuevo) {
        int indice = idxProducto(id);
        if(indice > -1) {
            this.productos.set(indice, nuevo);
        }
    }
    
    private int idxProducto (String id) {
        int i = 0;
        int indiceEncontrado = -1;
        while(i < this.productos.size() && indiceEncontrado == -1) {
            Producto p = this.productos.get(i);
            if (p.getId().equals(id)) {
                indiceEncontrado = i;
            }
            i++;
        }
        return indiceEncontrado;
    }
    
    
}
