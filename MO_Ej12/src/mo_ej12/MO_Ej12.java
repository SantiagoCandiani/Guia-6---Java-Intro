/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej12;

import java.util.Scanner;

/**
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
public class MO_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double num1 = leer.nextInt();

        System.out.println("Ingrese un numero");
        double num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(double num1, double num2) {

        if (num1 % num2 == 0) {

            System.out.println("El 1er nro (" + num1 + ") es multiplo del 2do (" + num2 + ").");
        } else if (num2 % num1 == 0) {
            System.out.println("El 2do nro (" + num2 + ") es multiplo del 1ro (" + num1 + ").");
        } else {
            System.out.println("Ningno de los numeros es multiplo entre si.");
        }

    }
}
