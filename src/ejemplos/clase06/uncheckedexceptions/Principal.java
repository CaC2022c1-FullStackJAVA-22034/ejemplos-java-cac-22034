
package ejemplos.clase06.uncheckedexceptions;

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
        Calculadora c = new Calculadora();
        int fact;  
        
        int num = -5;
               
        
        try {
            fact = c.factorial(-5);
            System.out.println(fact);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Otra cosa...");
        
    }

}
