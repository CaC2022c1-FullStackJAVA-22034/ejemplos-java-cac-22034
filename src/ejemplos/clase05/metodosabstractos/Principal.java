
package ejemplos.clase05.metodosabstractos;

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
        
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        
        lista.add(new Rectangulo(2,3));
        lista.add(new Circunferencia(1));
        lista.add(new TrianguloEquilatero(4));
        lista.add(new Rectangulo(5,4));
        lista.add(new Circunferencia(2));
        
        for (FiguraGeometrica x : lista) {
            System.out.println( x.perimetro() );
        }
    }

}
