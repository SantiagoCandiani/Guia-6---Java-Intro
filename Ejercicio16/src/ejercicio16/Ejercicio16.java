
package ejercicio16;

import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector a llenar.");
        int n = leer.nextInt();

        int[] vector = new int[n];

        System.out.println("El vector quedaria:");
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 20);
            System.out.print(vector[i] + " ");
        }

        System.out.println("");
        System.out.println("Ingrese un numero a buscar dentro del vector:");
        int num = leer.nextInt();

        for (int i = 0; i < n; i++) {

            if (vector[i] == num) {
                System.out.println("El numero elegido se encuentra en la posicion " + i + ".");
            }

        }

    }

}
