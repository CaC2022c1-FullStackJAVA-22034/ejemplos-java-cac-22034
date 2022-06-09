
package ejemplos.clase06.uncheckedexceptions;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Calculadora {
    public int divisionEntera(int a, int b) {
        return a / b;
    }
    
    public int factorial(int num) {
        // 5! = 5 * 4 * 3 * 2 = 120
        if (num < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
        }
        if (num > 12) {
            throw new IllegalArgumentException("Por razones técnicas, no se puede calcular el factorial de un número mayor a 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
