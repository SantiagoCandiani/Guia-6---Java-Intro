package ejercicioextra03;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */
public class EjercicioExtra03 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una letra");
        String letra = leer.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada era una vocal.");
        } else {
            System.out.println("La letra No era una vocal.");
        }
    }

}
