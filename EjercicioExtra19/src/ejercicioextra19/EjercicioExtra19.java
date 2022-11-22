/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ejercicioextra19;

import java.util.Scanner;

public class EjercicioExtra19 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();

        int[] vector1 = new int[tamanio];
        int[] vector2 = new int[tamanio];

        System.out.println("Vamos a llenar el 1er vector:");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° numero:");
            vector1[i] = leer.nextInt();
        }

        System.out.println("Vamos a llenar el 2do vector:");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° numero:");
            vector2[i] = leer.nextInt();
        }

        boolean bandera = false;

        for (int i = 0; i < tamanio; i++) {
            bandera = vector1[i] == vector2[i];
        }
        if (bandera == true) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
