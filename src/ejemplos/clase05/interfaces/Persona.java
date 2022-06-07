
package ejemplos.clase05.interfaces;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Persona implements Comunicador {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Yendo casa x casa a tocar timbre y decir: " + mensaje);
    }

}
