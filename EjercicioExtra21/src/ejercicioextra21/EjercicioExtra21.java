/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package ejercicioextra21;

import java.util.Scanner;

public class EjercicioExtra21 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int cantAlumnos = 3;//variar este numero para modificar la cantidad de cargas.
        int aprobado = 0;
        int desaprobado = 0;
        float[] notaPromedio = new float[cantAlumnos];

        System.out.println("Se solicitaran las notas de todos los alumnos.");

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("ALUMNO NRO." + (i + 1) + ": Primer trabajo práctico evaluativo:");
            int nota1 = leer.nextInt();
            System.out.println("ALUMNO NRO." + (i + 1) + ": Segundo trabajo práctico evaluativo:");
            int nota2 = leer.nextInt();
            System.out.println("ALUMNO NRO." + (i + 1) + ": Primer Integrador:");
            int nota3 = leer.nextInt();
            System.out.println("ALUMNO NRO." + (i + 1) + ": Segundo Integrador:");
            int nota4 = leer.nextInt();

            notaPromedio[i] = (float) (0.1 * nota1 + 0.15 * nota2 + 0.25 * nota3 + 0.5 * nota4);

            if (notaPromedio[i] >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }

        System.out.println("La cantidad de alumnos APROBADOS es: " + aprobado);
        System.out.println("La cantidad de alumnos DESAPROBADOS es: " + desaprobado);

    }

}
