/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

/**
 *
 * @author super
 */
public class Ex1_05Array {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 9, 25, 31, 4, 6, 8};
        
        System.out.println(getMajorFromArray(numeros));
    }

    private static int getMajorFromArray(int[] numeros) {
        int major = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            major = getMajor(major, numeros[i]);
        }
        return major;
    }

    private static int getMajor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
