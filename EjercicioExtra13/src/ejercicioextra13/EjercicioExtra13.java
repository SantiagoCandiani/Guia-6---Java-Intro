/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejercicioextra13;

import java.util.Scanner;

public class EjercicioExtra13 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño de la escalera a dibujar:");
        int altura = leer.nextInt();
        escalera(altura); //esta anda bien.
        System.out.println("--------------------------------------");
        escaleraInvertidaBuena(altura); //esta anda bien. La saque de internet je!
        System.out.println("--------------------------------------");
        escaleraInvertidaMasOMenos(altura);
    }

    public static void escalera(int altura) {

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void escaleraInvertidaBuena(int altura) {
        //esta anda bien. La saque de internet je!
        for (int i = 1; i <= altura; i++) {
            System.out.print(i + " ");
            if (altura == i) {
                System.out.println("");
                altura--;
                i = 0;
            }
            if (altura == 0) {
                break;
            }
        }
    }

    public static void escaleraInvertidaMasOMenos(int altura) {
        //no anda del todo bien, da los numeros invertidos.
        for (int i = altura; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
