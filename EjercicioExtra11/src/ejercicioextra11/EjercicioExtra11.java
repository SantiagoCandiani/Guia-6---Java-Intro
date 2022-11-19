/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package ejercicioextra11;

import java.util.Scanner;

public class EjercicioExtra11 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        digitos(num);
    }

    public static void digitos(int num) {
//        Resolucion corta:
        int digitos;
        if (num == 0) {
            digitos = 1;
        } else {
            digitos = (int) (Math.log10(num) + 1);
        }

//        Resolucion Larga:
//        int aux = num;
//
//        if (num == 0) {
//            digitos = 1;
//        } else {
//            while (aux > 0) {
//                digitos++;
//                aux /= 10;
//            }
//        }
            System.out.println("La cantidad de digitos de: " + num + " es: " + digitos);
        }
    }
