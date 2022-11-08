/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author maquina
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se crea la variable scanner que se usa para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        
        //se crea una variable cadena (string) que se utiliza para leer datos del usuari
        String nombre;
        
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
                
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        
        //mostramos por consola el saludo personalizado
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
