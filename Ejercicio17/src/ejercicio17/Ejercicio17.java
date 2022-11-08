/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector a llenar.");
        int n = leer.nextInt();

        int[] vector = new int[n];

        int unDigito = 0;
        int dosDigito = 0;
        int tresDigito = 0;
        int cuatroDigito = 0;
        int cincoDigito = 0;

        System.out.println("El vector quedaria:");
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.print(vector[i] + " ");     
        }

        for (int i = 0; i < n; i++) {
            if (vector[i]>0 && vector[i]<10) {
                unDigito = unDigito + 1;
            } else if (vector[i]>9 && vector[i]<100) {
                dosDigito = dosDigito + 1;
            } else if (vector[i]>99 && vector[i]<1000) {
                tresDigito = tresDigito + 1;
            } else if (vector[i]>999 && vector[i]<10000) {
                cuatroDigito = cuatroDigito + 1;
            } else if (vector[i]>9999) {
                cincoDigito = cincoDigito + 1;
            }
        }

        System.out.println("");
        System.out.println("La cantidad de numeros de 1 cifra son: " + unDigito);
        System.out.println("La cantidad de numeros de 2 cifras son: " + dosDigito);
        System.out.println("La cantidad de numeros de 3 cifras son: " + tresDigito);
        System.out.println("La cantidad de numeros de 4 cifras son: " + cuatroDigito);
        System.out.println("La cantidad de numeros de 5 cifras son: " + cincoDigito);
    }

}
