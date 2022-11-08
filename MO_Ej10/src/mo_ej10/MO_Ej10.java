package mo_ej10;

import java.util.Scanner;

/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class MO_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero del 1 al 20");

            int num = leer.nextInt();

            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
