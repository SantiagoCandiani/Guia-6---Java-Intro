/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un limite para la suma:");
        int limite = leer.nextInt();

        while (limite < 1) {
            System.out.println("Valor incorrecto. Vuelva a intentarlo");
            limite = leer.nextInt();
        }

        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Ahora la suma es: " + suma);
        } while (suma <= limite);

        System.out.println("Usted ya supero el limite establecido");
    }
}
