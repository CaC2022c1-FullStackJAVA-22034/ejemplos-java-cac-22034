
package ejemplos.clase05.metodosabstractos;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Circunferencia extends FiguraGeometrica {
    private int radio;

    public Circunferencia(int radio) {
        super();
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
