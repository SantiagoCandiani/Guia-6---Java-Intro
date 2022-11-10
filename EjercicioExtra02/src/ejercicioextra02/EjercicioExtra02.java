/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicioextra02;

import java.util.Scanner;

public class EjercicioExtra02 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el valor para las variables A, B, C y D.");
        int a = leer.nextInt(), b = leer.nextInt(), c = leer.nextInt(), d = leer.nextInt();

        mostrarVariables(a, b, c, d);

        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println("Mira! Ahora los valores de las variables se han intercambiado.");
        mostrarVariables(a, b, c, d);
    }

    public static void mostrarVariables(int a, int b, int c, int d) {

        System.out.println("El valor de A es: " + a);
        System.out.println("El valor de B es: " + b);
        System.out.println("El valor de C es: " + c);
        System.out.println("El valor de D es: " + d);
        System.out.println("");
    }
}
