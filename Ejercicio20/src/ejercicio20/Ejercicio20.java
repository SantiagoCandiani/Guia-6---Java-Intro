/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 * FUn cuadrado mÃ¡gico 3 x 3 es una matriz 3 x 3 formada por nÃºmeros del 1 al
 * 9 donde la suma de sus filas, sus columnas y sus diagonales son idÃ©nticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mÃ¡gico o no. El programa deberÃ¡ comprobar que los
 * nÃºmeros introducidos son correctos, es decir, estÃ¡n entre el 1 y el 9.
 *
 * @author Ayelen Menin
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        matriz[0][0] = 2;
        matriz[0][1] = 9;
        matriz[0][2] = 4;
        matriz[1][0] = 7;
        matriz[1][1] = 5;
        matriz[1][2] = 3;
        matriz[2][0] = 6;
        matriz[2][1] = 1;
        matriz[2][2] = 8;

        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j]);
                System.out.print("   ");
            }
            System.out.println("");
        }

        //para sumar columnas
        int suma = 0;
        int[] colum = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                suma = suma + matriz[i][j];

            }
            System.out.println(" la suma de la Col " + i + " es = " + suma);
            colum[i] = suma;
            suma = 0;
        }

        int[] fila = new int[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {

                suma = suma + matriz[i][j];

            }
            System.out.println(" la suma de la Fila " + j + " es = " + suma);
            fila[j] = suma;
            suma = 0;
        }

        // diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j) {

                    suma = suma + matriz[i][j];
                }
            }
        }
        System.out.println(" la suma de la Diagonal es = " + suma);
        int diag = suma;

        boolean flag = true;

        for (int i = 0; i < 3; i++) {

            if ((colum[i] == fila[i]) && (colum[i] == diag) && (flag)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("La Matriz es Magica");
        } else {
            System.out.println("La matriz NO es Magica");
        }
    }
}
