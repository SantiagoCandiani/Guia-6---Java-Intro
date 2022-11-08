/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class Ejercicio20 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        matriz[0][0] = 2;
        matriz[0][1] = 7;
        matriz[0][2] = 6;
        matriz[1][0] = 9;
        matriz[1][1] = 5;
        matriz[1][2] = 8;
        matriz[2][0] = 4;
        matriz[2][1] = 3;
        matriz[2][2] = 8;

        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j]);
                System.out.print("   ");
            }
            System.out.println("");
        }
        
        int contF = 0;
        int contC = 0;
        int contD1 = 0;
        int contD2 = 0;

        for (int i = 0; i < 3; i++) {
            contF = contF + matriz[0][i];
            contC = contC + matriz[i][0];
            contD1 = contD1 + matriz[i][i];
            contD2 = contD2 + matriz[i][2 - i];
        }
        System.out.println(contF);
        System.out.println(contC);
        System.out.println(contD1);
        System.out.println(contD2);
        
        if ((contF == contC) && (contC == contD1) && (contD1 == contD2)) {
            System.out.println("La matriz es magica");
        } else{
            System.out.println("La matriz no es magica");
        }
        
        NO SIRVE.
    }

}
