/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mo_ej13;

import java.util.Scanner;

/**
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
public class MO_Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de integrantes de su grupo");
        int n = leer.nextInt();
        leer.nextLine();

        String[] equipo = new String[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Ingrese el nombre del integrante nro "+ (i+1) + " :");
            equipo[i] = leer.nextLine();
        }
        System.out.println("Los nombres de tu equipo son:");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". "+ equipo[i]);
            
        }
        System.out.println("");
    }

}
