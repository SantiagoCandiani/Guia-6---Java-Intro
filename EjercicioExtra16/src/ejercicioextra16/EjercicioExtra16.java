/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejercicioextra16;

import java.util.Scanner;

public class EjercicioExtra16 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {

            ingresarDatos();

            System.out.println("Desea seguir ingresando personas al sistema? Ingrese 'NO' PARA SALIR");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                salir = true;
            }
        }
        System.out.println("USTED SALIO DEL PROGRAMA CON EXITO!!");
    }

    public static void ingresarDatos() {

        int contPersonas = 0;

        System.out.println("PERSONA NRO." + (contPersonas + 1) + ": Ingrese el nombre:");
        String nombre = leer.next();

        System.out.println("PERSONA NRO." + (contPersonas + 1) + ": Ingrese la edad:");
        int edad = leer.nextInt();

        contPersonas++;

        if (edad > 17) {
            System.out.println(nombre + " es MAYOR de edad.");
        } else {
            System.out.println(nombre + " es MENOR de edad.");
        }
    }
}
