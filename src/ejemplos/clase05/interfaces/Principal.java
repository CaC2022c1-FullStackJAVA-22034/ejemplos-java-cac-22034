
package ejemplos.clase05.interfaces;

import java.util.Collections;

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
        Campania c = new Campania();
        c.agregarComunicador( new PalomaMensajera());
        c.agregarComunicador( new TelefonoMovil());
        c.agregarComunicador( new PalomaMensajera());
        c.agregarComunicador( new TelefonoMovil());
        c.agregarComunicador( new Persona() );
        c.agregarComunicador( new PalomaMensajera());
        c.agregarComunicador( new TelefonoMovil());
        c.agregarComunicador( new PalomaMensajera());
        c.agregarComunicador( new TelefonoMovil());
        c.hacerCampania();
    }

}
