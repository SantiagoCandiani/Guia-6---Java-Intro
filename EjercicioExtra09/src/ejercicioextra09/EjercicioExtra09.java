/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejercicioextra09;

import java.util.Scanner;

public class EjercicioExtra09 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el numero que sera dividido");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese el numero divisor");
        int divisor = leer.nextInt();

        restar(dividendo, divisor);
    }

    public static void restar(int dividendo, int divisor) {
        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("El cociente de la division es: " + cociente);
        System.out.println("El residuo de la division es: " + dividendo);
    }
}
