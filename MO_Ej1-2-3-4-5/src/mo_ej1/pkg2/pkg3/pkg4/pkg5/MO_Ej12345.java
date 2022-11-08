/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej1.pkg2.pkg3.pkg4.pkg5;

import java.util.Scanner;

/**
 *
 * @author maquina
 */
public class MO_Ej12345 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1 Y 2
        String nombre = "Santiago";
        int numero = 48;
        double decimales = 50.5;
        boolean bandera = false;
        char caracter = 'a';
        byte enteroCorto = 18;

        //EJERCICION 3
        int num1 = 20;
        int num2 = 30;

        int multiplicacion = num1 * num2;
        int suma = num1 + num2;

        //EJERCICIO 4
        String nombre1 = "Santiago";
        int edad = 39;

        System.out.println("Tu nombre es " + nombre1);
        System.out.println("Tu edad es " + edad);

        //EJERCICIO 5
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor V o F");
        boolean bandera2 = leer.nextBoolean();

        System.out.println("Ingrese un numero");
        double numero1 = leer.nextDouble();

        System.out.println("Ingrese un caracter");
        String char1 = leer.next();

    }

}
