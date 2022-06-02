
package ejemplos.clase04;

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
        AutoElectrico ae = new AutoElectrico(120, true, "ABC123");
        
        System.out.println( ae.getPatente() );
        System.out.println( ae.getPotencia() );
        System.out.println( ae.tieneAire() );
    }

}
