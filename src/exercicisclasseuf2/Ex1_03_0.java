package exercicisclasseuf2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 3. Escriu una funció que retorna el major de dos números.
 * Versió sense mètodes
 * 
 *
 * @author super
 */
public class Ex1_03_0 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, numMajor;

        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        num1= lector.nextInt();
        
        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        num2= lector.nextInt();

        if (num1 > num2) {
            numMajor= num1;
        } else {
            numMajor= num2;
        }
        
        System.out.println("El major és: " + numMajor);
    }
 
}
