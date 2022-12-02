/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 1.Escriu un mètode que retorna la suma de dos números sencers. Valida que els
 * números siguin sencers.
 *
 * @author super
 */
public class Ex1_01_0 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, resultat;
        System.out.print("Donam un número: ");
        
        validaInt(lector);
        
        num1 = lector.nextInt();
        //num1 = getValidInt(lector); //una alternativa
        lector.nextLine();

        System.out.print("Donam un altre número: ");
       
        validaInt(lector);
  
        num2 = lector.nextInt();
        lector.nextLine();

        resultat = getSuma(num1, num2);

        //Mostrem el resultat des d'una variable
        System.out.println("El resultat és: " + resultat);
        //Mostrem el resultat cridant la funció i passant els paràmetres
        System.out.println("El resultat és: " + getSuma(num1,num2));
        //Directament cridem la funció i ella ja mostrarà el que sigui
        suma(num1,num2);
    }

    /**
     * Retorna el valor de la suma de dos números sencers
     * 
     * @param num1
     * @param num2
     * @return 
     */
    private static int getSuma(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Mostra per pantalla el resultat de la suma de dos números sencers
     * 
     * @param num1
     * @param num2 
     */
    private static void suma(int num1, int num2){
        int resultat = num1 + num2;
        System.out.println("El resultat és: " + resultat);
        System.out.println("El resultat és: " + num1+num2);
    }
    
    /**
     * S'executa fins que l'usuari insereix un número sencer
     * 
     * @param lector 
     */
    private static void validaInt(Scanner lector){
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número sencer");
            lector.nextLine();
        }
    }
    
    private static int getValidInt(Scanner lector){
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número sencer");
            lector.nextLine();
        }
        return lector.nextInt();
    }
}
