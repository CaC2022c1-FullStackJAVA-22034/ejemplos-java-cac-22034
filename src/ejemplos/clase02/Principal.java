
package ejemplos.clase02;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        // las pruebas...
        
        Producto p = new Producto("abc123", "Mouse inalámbrico fabuloso", 3, 3.13, "mouse.png");
        Producto p2 = new Producto("abc124", "Teclado genérico", 1, 1.9);
        
        System.out.println(p);
        System.out.println(p2);
    }
}
