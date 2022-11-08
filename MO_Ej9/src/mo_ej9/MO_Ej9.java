/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej9;

import java.util.Scanner;

/**
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
public class MO_Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int suma = 0;
        int i = 0;

        do {
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            if (num1 < 0) {
                suma = suma + 0;
            } else {
                suma = suma + num1;
            }
            i += 1;
        } while (num1 != 0 && i < 20);

        System.out.println("Se capturo el numero 0");
        System.out.println("La suma total es: " + suma);

    }

}
