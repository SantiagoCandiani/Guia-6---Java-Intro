package ejercicioextra06;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class EjercicioExtra06 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de personas");
        int personas = leer.nextInt();

        double altura = 0;
        double sumaBajos = 0;
        int b = 0;
        double sumaTotal = 0;

        for (int i = 0; i < personas; i++) {
            System.out.println("Persona " + (i + 1) + ": Ingrese la estatura");
            altura = leer.nextDouble();

            sumaTotal += altura;

            if (altura < 1.6) {
                sumaBajos += altura;
                b++;
            }
        }
        System.out.println("La altura promedio de personas mas bajas a 1.60mts es: " + (sumaBajos / b) + "mts.");
        System.out.println("La altura promedio de todas las personas es: " + (sumaTotal / personas) + "mts.");
    }
}
