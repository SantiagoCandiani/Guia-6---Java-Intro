package ejercicio15;

import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector = new int[100];

        for (int i = 99; i > -1; i--) {
            vector[i]=i+1;
            System.out.println(vector[i]);
        }


    }
    
}
