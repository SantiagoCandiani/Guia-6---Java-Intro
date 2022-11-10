/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicioextra08;

import java.util.Scanner;

public class EjercicioExtra08 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        int par = 0;
        int impar = 0;

        do {
            System.out.println("Ingrese un numero (se sale con multiplo de 5)");
            num = leer.nextInt();

            if (num % 2 == 0 && num > 0) {
                par++;
            }
            if (num % 2 != 0 && num > 0) {
                impar++;
            }

        } while (num % 5 != 0);

        System.out.println("Los numeros impares fueron: " + impar);
        System.out.println("Los numeros pares fueron: " + par);
        System.out.println("La cantidad de numeros ingresados es: " + (par + impar));
    }
}
