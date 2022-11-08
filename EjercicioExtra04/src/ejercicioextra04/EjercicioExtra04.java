package ejercicioextra04;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
 * muestre su equivalente en romano.
 */
public class EjercicioExtra04 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();

        String numRomano = "";

        switch (num) {
            case 1:
                numRomano = "I";
                break;
            case 2:
                numRomano = "II";
                break;
            case 3:
                numRomano = "II";
                break;
            case 4:
                numRomano = "IV";
                break;
            case 5:
                numRomano = "V";
                break;
            case 6:
                numRomano = "VI";
                break;
            case 7:
                numRomano = "VII";
                break;
            case 8:
                numRomano = "VIII";
                break;
            case 9:
                numRomano = "IX";
                break;
            case 10:
                numRomano = "X";
                break;
            default:
                System.out.println("El numero ingresado no es correcto");

        }
        System.out.println("El numero " + num + " en numeros romanos es: " + numRomano + ".");
    }

}
