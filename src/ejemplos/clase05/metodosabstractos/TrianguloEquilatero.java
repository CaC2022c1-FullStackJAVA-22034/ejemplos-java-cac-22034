
package ejemplos.clase05.metodosabstractos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TrianguloEquilatero extends FiguraGeometrica {
    private int lado;

    public TrianguloEquilatero(int lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado * 3;
    }
    
    
}
