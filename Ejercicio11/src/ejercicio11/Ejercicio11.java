/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero positivo:");
        double num1 = leer.nextInt();

        while (num1 < 1) {
            System.out.println("Valor incorrecto. Vuelva a intentarlo");
            num1 = leer.nextInt();
        }

        System.out.println("Ingrese el segundo numero entero positivo:");
        double num2 = leer.nextInt();

        while (num2 < 1) {
            System.out.println("Valor incorrecto. Vuelva a intentarlo");
            num2 = leer.nextInt();
        }

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
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + (num1 / num2));
                    System.out.println("");
                    break;
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

        System.out.println("USTED SALIO DEL PROGRAMA CON EXITO!!");
        System.out.println("");

    }

}
