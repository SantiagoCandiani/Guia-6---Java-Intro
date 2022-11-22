/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejercicioextra15;

import java.util.Scanner;

public class EjercicioExtra15 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el sefundo numero:");
        int num2 = leer.nextInt();

        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("************");
            System.out.println("*   MENU   *");
            System.out.println("************");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("ELIJA UNA OPCION");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + sumar(num1, num2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + restar(num1, num2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + multiplicar(num1, num2));
                    System.out.println("");
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede divir por cero.");
                        break;
                    } else {
                        System.out.println("La division de los numeros es: " + dividir(num1, num2));
                        System.out.println("");
                        break;
                    }
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? S/N");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        salir = true;
                    }
                    System.out.println("");
                    break;

                default:
                    System.out.println("La opcion elegida no es una opcion correcta, vuelva a intentarlo");
            }
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static float dividir(int num1, int num2) {
        return (float) num1 / num2;
    }

}
