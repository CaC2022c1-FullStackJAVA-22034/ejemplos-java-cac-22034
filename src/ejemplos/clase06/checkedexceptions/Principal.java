package ejemplos.clase06.checkedexceptions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        VisorDeTXTs v = new VisorDeTXTs();
        
        try {
            v.mostrarTxt("src\\ejemplos\\clase06\\checkedexceptions\\MENSAJE_OCULTO.txt");
        } catch (IOException ex) {
            System.out.println("No se pudo mostrar");
            System.out.println("Porque: " + ex.getMessage());
        }
    }

}
