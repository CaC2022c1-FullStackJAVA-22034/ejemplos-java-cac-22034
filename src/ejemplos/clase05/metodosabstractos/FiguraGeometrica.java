
package ejemplos.clase05.metodosabstractos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class FiguraGeometrica {
    private String color;

    public String getColor() {
        return color;
    }
    
    public abstract double perimetro();
}
