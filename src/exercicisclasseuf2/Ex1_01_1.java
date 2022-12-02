/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 *
 * @author super
 */
public class Ex1_01_1 {

    //DECLARACIÓ DE CONSTANTS


    //DECLARACIÓ DE VARIABLES
    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = getValidInteger();
        b = getValidInteger();
        System.out.println(suma(a,b));
        
//        suma(getValidInteger(),getValidInteger());

    }


    private static int getValidInteger() {
        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has d'escriure un número");
            lector.nextLine();
        }
        return lector.nextInt();

    }

    private static int suma(int a, int b) {
        System.out.println(a+b); 
        return a+b;
    }
}
