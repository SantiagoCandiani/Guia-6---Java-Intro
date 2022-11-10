/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejercicioextra05;

import java.util.Scanner;

public class EjercicioExtra05 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tipo de socio A-B-C");
        String socio = leer.next().toUpperCase();

        while (!socio.equals("A") && !socio.equals("B") && !socio.equals("C")) {
            System.out.println("Ingresaste un socio incorrecto. Vuelve a intentarlo.");
            socio = leer.next().toUpperCase();
        }

        System.out.println("Ingrese el monto del tratamiento");
        int valor = leer.nextInt();

        switch (socio) {
            case "A":
                System.out.println("El socio A, debera pagar: $" + ((double) (valor / 2)));
                break;
            case "B":
                System.out.println("El socio B, debera pagar: $" + ((double) (valor * .65)));
                break;
            case "C":
                System.out.println("El socio C, debera pagar: $" + valor);
                break;
        }
    }
}
