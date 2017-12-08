/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre1 = reader.nextLine();
        System.out.println("Escribe tu edad: ");
        int numero1 = Integer.parseInt(reader.nextLine());
        System.out.println("\nEscribe tu nombre: ");
        String nombre2 = reader.nextLine();
        System.out.println("Escribe tu edad: ");
        int numero2 = Integer.parseInt(reader.nextLine());        
        int suma = numero1 + numero2; 
        String toPrint = "\n" + nombre1 + " y " 
                                + nombre2 + " tienen en total "  
                                + suma + " años de edad.";
        System.out.println(toPrint);
    }
    
}
