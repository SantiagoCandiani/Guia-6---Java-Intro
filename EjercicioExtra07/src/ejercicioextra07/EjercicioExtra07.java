/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ejercicioextra07;

import java.util.Scanner;

public class EjercicioExtra07 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el valor de N");
        int n = leer.nextInt();
        elWhile(n);
        elDoWhile(n);

    }

    public static void elWhile(int n) {
        int maximo = 0;
        int minimo = 10000000;
        int suma = 0;
        int i = 0;
        int num;

        while (n > i) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (num > maximo) {
                maximo = num;

            }
            if (num < minimo) {
                minimo = num;
            }
            i++;
        }
        System.out.println("El valor minimo es:" + minimo);
        System.out.println("El valor maximo es:" + maximo);
        System.out.println("El valor promedio es:" + ((double) (suma / n)));
    }

    public static void elDoWhile(int n) {
        int maximo = 0;
        int minimo = 10000000;
        int suma = 0;
        int i = 0;
        int num;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma += num;
            if (num > maximo) {
                maximo = num;

            }
            if (num < minimo) {
                minimo = num;
            }
            i++;
        } while (n > i);
        System.out.println("El valor minimo es:" + minimo);
        System.out.println("El valor maximo es:" + maximo);
        System.out.println("El valor promedio es:" + ((double) (suma / n)));
    }

}
