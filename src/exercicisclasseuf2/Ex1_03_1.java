package exercicisclasseuf2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 3. Escriu una funció que retorna el major de dos números.
 * 
 * Amb variables locals i mètodes que retornen valors
 *
 * @author super
 */
public class Ex1_03_1 {
    
        
    public static void main(String[] args) {
        int num1, num2, numMajor;
        Scanner lector = new Scanner(System.in);

        num1 = getValidInt(lector);
        num2 = getValidInt(lector);

        numMajor = getMajor(num1, num2);
        System.out.println("El major és: " + numMajor);
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

    private static int getValidInt(Scanner lector) {


        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }
 
}
