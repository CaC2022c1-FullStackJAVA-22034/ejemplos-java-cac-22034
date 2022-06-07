
package ejemplos.clase05.metodosabstractos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Rectangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    
    @Override
    public double perimetro() {
        return 2 * altura + 2 * base;
    }
    
}
