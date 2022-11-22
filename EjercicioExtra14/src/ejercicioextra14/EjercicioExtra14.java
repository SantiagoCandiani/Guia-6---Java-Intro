/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejercicioextra14;

import java.util.Scanner;

public class EjercicioExtra14 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de familias que va a muestrear:");
        int familias = leer.nextInt();

        int hijos;
        float contHijos = 0;
        int edad;
        float contEdad = 0;

        for (int i = 0; i < familias; i++) {
            System.out.println("FAMILIA NRO." + (i + 1) + ": Ingrese la cantidad de hijos que posee esta familia:");
            hijos = leer.nextInt();
            contHijos += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("FAMILIA NRO." + (i + 1) + " - HIJO NRO." + (j + 1) + ": Ingrese su edad:");
                edad = leer.nextInt();
                contEdad += edad;
            }
        }
        System.out.println("Se entrevistó un total de: " + familias + " familias.");
        System.out.println("Entre todas hacen un total de: " + contHijos + " hijos.");
        System.out.println("El promedio de edades de los hijos fue de: " + (contEdad / contHijos) + " años.");
    }
}
