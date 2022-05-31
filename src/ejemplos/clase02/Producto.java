
package ejemplos.clase02;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Producto {
    
    private String id;
    private String nombre;
    private int rating;
    private double precio;
    private String rutaFoto;    
    
    // Constructor
    public Producto(String id, String nombre, int rating, double precio, String rutaFoto) {
        setId(id);
        setNombre(nombre);
        setRating(rating);
        setPrecio(precio);
        setRutaFoto(rutaFoto);
    }
    
    // Constructor sobrecargado
    public Producto(String id, String nombre, int rating, double precio) {
        this(id, nombre, rating, precio, "");
    }

    public void setNombre(String nuevo) {
        if (nuevo != null) {
            nombre = nuevo;
        }
    }
    
    public void setPrecio( double nuevo ) {
        if(nuevo > 0) {
           precio = nuevo; 
        }
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if(rating > 0 && rating <= 5) {
           this.rating = rating;
        }
    }    

    public double getPrecio() {
        return precio;
    }
    
    
    
//    public void mostrarDatos() {
//        System.out.println( toString() );
//    }
    
    public void aumentarPrecio(double porc) {
        setPrecio( getPrecio() * (1 + (porc / 100)) );
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + 
                ", rating=" + rating + ", precio=" + precio + 
                ", rutaFoto=" + rutaFoto + "}";
    }
    
    
    
    
}
