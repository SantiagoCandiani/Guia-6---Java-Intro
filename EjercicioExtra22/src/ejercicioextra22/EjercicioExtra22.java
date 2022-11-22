/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ejercicioextra22;

import java.util.Scanner;

public class EjercicioExtra22 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de filas:");
        int filas = leer.nextInt();

        System.out.println("Ingrese la cantidad de columnas:");
        int columnas = leer.nextInt();

        int[][] matriz = new int[filas][columnas];

        llenarMatriz(matriz, filas, columnas);
        mostrarMatriz(matriz, filas, columnas);
    }

    public static int[][] llenarMatriz(int[][] matriz, int filas, int columnas) {
        int sumatoria = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                sumatoria += matriz[i][j];
            }
        }
        System.out.println("La sumatoria de todos sus numeros era: " + sumatoria);
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz, int filas, int columnas) {

        System.out.println("La matriz es:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

}
