package exercicisclasseuf2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 3. Escriu una funció que retorna el major de dos números.
 *
 * Amb variables globals i mètodes que NO retornen valors
 *
 * @author super
 */
public class Ex1_03_2 {

    private static Scanner lector = new Scanner(System.in);
    private static int num1, num2, numMajor;

    public static void main(String[] args) {
        num1=getValidInt();
        num2=getValidInt();

        getMajor(num1, num2);
        getMajor();
        System.out.println("El major és: " + numMajor);
    }

    private static void getMajor(int num1, int num2) {
        if (num1 > num2) {
            numMajor = num1;
        } else {
            numMajor = num2;
        }
    }

    private static void getMajor() {
        if (num1 > num2) {
            numMajor = num1;
        } else {
            numMajor = num2;
        }
    }

    private static int getValidInt() {
        System.out.println("Donam un número");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }

}
