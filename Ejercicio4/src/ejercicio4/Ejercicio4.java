/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados que desea convertir:");
        double centigrados = leer.nextDouble();
        double Fahrenheit = 32 + (9* centigrados / 5);
        System.out.println("El equivalente de " + centigrados + " grados centigrados a Fahrenheit son: " + Fahrenheit);
    }
    
}
