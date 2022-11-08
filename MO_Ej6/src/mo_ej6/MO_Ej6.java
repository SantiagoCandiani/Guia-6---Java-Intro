/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej6;

import java.util.Scanner;

/**
MANOS A LA OBRA
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
public class MO_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();

        System.out.println("Ingrese otro numero");
        double num2 = leer.nextDouble();
        if (num1>25 || num2>25){
            System.out.println("Uno de los numeros era mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros era mayor a 25");
        }
    }
    
}
