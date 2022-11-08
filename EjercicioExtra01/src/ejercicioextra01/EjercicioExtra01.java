/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicioextra01;

import java.util.Scanner;

public class EjercicioExtra01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de minutos a convertir a dias, horas y minutos");
        int minutos = leer.nextInt();

        int horas = (int) (minutos / 60);
        int dias = (int) (horas / 24);
        horas -= (dias * 24);
        int minRestantes = minutos - (dias * 24 * 60) - (horas * 60);

        System.out.println("Los " + minutos + " equivalen a: " + dias + " dias, " + horas + " horas " + minRestantes + " minutos.");

    }

}
