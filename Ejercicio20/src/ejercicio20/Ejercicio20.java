package ejercicio20;

import java.util.Scanner;

/**
 * FUn cuadrado mÃ¡gico 3 x 3 es una matriz 3 x 3 formada por nÃºmeros del 1 al
 * 9 donde la suma de sus filas, sus columnas y sus diagonales son idÃ©nticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mÃ¡gico o no. El programa deberÃ¡ comprobar que los
 * nÃºmeros introducidos son correctos, es decir, estÃ¡n entre el 1 y el 9.
 *
 */
public class Ejercicio20 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

//        2 9 4
//        7 5 3
//        6 1 8
        System.out.println("ingrese los 9 valores de la martriz");
        int[][] matriz = new int[3][3];
        llenado(matriz);
        mostrar(matriz);
        if (comprobacionlinea(matriz)) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");
        }
    }

    public static void llenado(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void mostrar(int[][] matriz) {

        System.out.println("La matriz llenada queda:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);;
                System.out.print(" | ");
            }
            System.out.println("");
        }
    }

    public static boolean comprobacionlinea(int[][] matriz) {

        int sumai = 0;
        for (int i = 0; i < 3; i++) {
            sumai += matriz[0][i];
        }

        for (int i = 1; i < 3; i++) {
            int sumafila = 0;
            for (int j = 0; j < 3; j++) {
                sumafila += matriz[i][j];
            }
            if (sumafila != sumai) {
                return false;
            }
        }

        for (int i = 0; i < 3; i++) {
            int sumacolumna = 0;
            for (int j = 0; j < 3; j++) {
                sumacolumna += matriz[j][i];
            }
            if (sumacolumna != sumai) {
                return false;
            }
        }
        int sumadiagmayor = 0;

        for (int i = 0; i < 3; i++) {
            sumadiagmayor += matriz[i][i];
        }
        if (sumadiagmayor != sumai) {
            return false;

        }
        int sumadiaginvert = 0;
        int aux = 2;
        for (int i = 0; i < 3; i++) {
            sumadiaginvert += matriz[i][aux];
            aux--;
        }
        return sumadiaginvert == sumai;
    }
}
