/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 4. Escriu una funció que retorna el major de tres números.
 *
 * @author super
 */
public class Ex1_04 {

    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, num3, numMajor;

        
        num1 = getValidInt();
        num2 = getValidInt();
        num3 = getValidInt();

        numMajor = getMajorDeTresV0(num1, num2, num3);
        System.out.println("El major és: " + numMajor);

        numMajor = getMajorDeTresV1(num1, num2, num3);
        System.out.println("El major és: " + numMajor);

    }

    /**
     * Funció que retorna un número sencer vàlid
     * @return 
     */
    private static int getValidInt() {
        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }

    /**
     * Funció que reb tres números i ens retorna el major dels tres
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private static int getMajorDeTresV0(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
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
     * Funcio que retorna el major de 3 números passats com paràmetres
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private static int getMajorDeTresV1(int num1, int num2, int num3) {
        int major;
        major = getMajor(getMajor(num1, num2), num3);
        return major;
    }

}
