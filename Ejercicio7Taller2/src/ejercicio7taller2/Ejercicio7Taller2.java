/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7taller2;
import java.util.Scanner;

public class Ejercicio7Taller2 {

    public static void main(String[] args) {
        Scanner NumeroA = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        int NA= NumeroA.nextInt();
            
        Scanner NumeroB = new Scanner(System.in);
        System.out.println("Ingrese el valor de B: ");
        int NB= NumeroB.nextInt();
           
        if (NA > NB) {
            System.out.println( "A es mayor que B");
       	
        }
            
        else if (NA < NB ) {
            System.out.println( "A es menor que B");
        }
            
        else if (NA == NB ) {
            System.out.println( "A es igual que B");
        }
    }
    
}
