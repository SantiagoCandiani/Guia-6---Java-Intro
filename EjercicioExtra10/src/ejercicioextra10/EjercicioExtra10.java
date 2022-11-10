/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicioextra10;

import java.util.Scanner;

public class EjercicioExtra10 {

    public static Scanner leer = new Scanner(System.in);
    public static int num1 = (int) (Math.random() * 10);
    public static int num2 = (int) (Math.random() * 10);
    public static int multiplicacion = num1 * num2;

    public static void main(String[] args) {

        hacerMultiplicacion();
        System.out.println("");
        adivinanza();
        System.out.println("Excelente!!! Adivinaste la multiplizacion");
    }

    public static void hacerMultiplicacion() {

        System.out.println("Te muestro la multiplicacion para que pruebes el correcto. Es: " + multiplicacion);
        System.out.println("No le digas a nadie que te dije ;)");
    }

    public static void adivinanza() {
        int nroAdivinado;
        do {
            System.out.println("Adivine la multiplicacion:");
            nroAdivinado = leer.nextInt();
        } while (nroAdivinado != multiplicacion);

    }
}
