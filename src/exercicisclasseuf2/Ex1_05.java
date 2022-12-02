/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 5. Escriu una funció que retorna el major de quatre números passat com
 * arguments.
 *
 * @author super
 */
public class Ex1_05 {

    
    
    public static void main(String[] args) {
        int[] numeros ={1,2,3,4,6,5,3,7,2,9};
        int num1, num2, num3, num4, numMajor;

        num1 = getValidInt();
        num2 = getValidInt();
        num3 = getValidInt();
        num4 = getValidInt();

        numMajor = getMajorDeQuatre(num1, num2, num3, num4);
        System.out.println("El major és: " + numMajor);
    }
    
    /**
     * Funció que retorna un número sencer vàlid
     * @return 
     */
    private static int getValidInt() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }

    /**
     * funció que reb dos números i ens retorna el major dels dos
     *
     * @param num1
     * @param num2
     * @return
     */
    private static int getMajor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     * Funció que retorna el major de quatre números
     * Reutilitza la funció getMajor
     * 
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @see getMajor()
     * @return 
     */
    private static int getMajorDeQuatre(int num1, int num2, int num3, int num4) {
        return (getMajor(getMajor(num1, num2), getMajor(num3, num4)));
    }
}
