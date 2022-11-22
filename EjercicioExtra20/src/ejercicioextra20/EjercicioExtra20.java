/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ejercicioextra20;

import java.util.Scanner;

public class EjercicioExtra20 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del vector a rellenar:");
        int num = leer.nextInt();

        int[] vector = new int[num];

        mostrarVector(num, llenarVector(num, vector));
        /*  OTRA FORMA DE MOSTRAR LO MISMO ES:
        llenarVector(num, vector);
        mostrarVector(num, vector);
        */
    }

    public static int[] llenarVector(int num, int[] vector) {

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
        return vector;
    }

    public static void mostrarVector(int num, int[] vector) {

        for (int i = 0; i < num; i++) {
            System.out.print(vector[i] + " | ");
        }
        System.out.println("");
    }
}
