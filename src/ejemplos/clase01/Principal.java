
package ejemplos.clase01;

import java.util.Scanner;

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
        
        Scanner input = new Scanner(System.in);
        String nombre; 
        int anioNac;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Año de nacimiento: ");
        anioNac = Integer.parseInt(input.nextLine());
        
        int edadEstimada = 2022 - anioNac;
        
        System.out.println("Hola " + nombre + ", tu edad es " + edadEstimada + " años");
        /*
        System.out.println("Hola mundo"); // "Hola Mundo"
        System.out.println(2 + 3); // 5
        System.out.println("2" + 3); // "23"
        */
    }

}
