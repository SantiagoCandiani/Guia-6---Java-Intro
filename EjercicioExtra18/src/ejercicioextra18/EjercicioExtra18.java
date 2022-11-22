/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ejercicioextra18;

import java.util.Scanner;

public class EjercicioExtra18 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño de su vector:");
        int n = leer.nextInt();

        crearVector(n);

    }

    public static void crearVector(int n) {

        int[] vector = new int[n];
        int sumatoria = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("POSICION " + (i + 1) + " de " + n + ". Ingrese un numero:");
            int num = leer.nextInt();
            vector[i] = num;
            sumatoria += num;
        }

        System.out.println("El vector es: ");

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " | ");
        }
        System.out.println("");
        System.out.println("La suma de todos los numeros del vector es: " + sumatoria);
    }
}
