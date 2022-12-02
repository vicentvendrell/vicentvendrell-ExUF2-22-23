/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 8. Escriu una funció la qual accepta l’entrada de 4 números sencers (dígits
 * del 0 al 9, s’han de validar). La funció comprovarà si la seqüència de
 * números inserida és capicua o no.
 *
 * @author super
 */
public class Ex1_08 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, num4;

        num1 = getValidInt("Donam un número");
        num2 = getValidInt("Donam un número");
        num3 = getValidInt("Donam un número");
        num4 = getValidInt("Donam un número");

        capicua(num1, num2, num3, num4);

        if (getCapicua(num1, num2, num3, num4) == true) {
            System.out.printf("El número %s%s%s%s és capicua\n", num1, num2, num3, num4);
        } else {
            System.out.printf("El número %s%s%s%s no és capicua\n", num1, num2, num3, num4);
        }
        
        int num5 = getValidInt("Donam un número amb més de 3 dígits");
        if(capicua(num5)){
            System.out.println("El número " + num5 + " és capicua");
        }else{
            System.out.println("El número " + num5 + " no és capicua");
        }
    }

    /**
     * Funció que retorna un número sencer vàlid
     *
     * @return
     */
    private static int getValidInt(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.println(missatge);
        while (!lector.hasNextInt()) {
            System.out.println(missatge);
            lector.nextLine();
        }
        return lector.nextInt();
    }

    private static void capicua(int num1, int num2, int num3, int num4) {

        if (num1 == num4 && num2 == num3) {
            System.out.printf("El número %s%s%s%s és capicua\n", num1, num2, num3, num4);
        } else {
            System.out.printf("El número %s%s%s%s no és capicua\n", num1, num2, num3, num4);
        }
    }

    private static boolean getCapicua(int num1, int num2, int num3, int num4) {
        if (num1 == num4 && num2 == num3) {
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean capicua(int num){
        String numero = String.valueOf(num);
        boolean esCapicua = true;
        int i=0, j=numero.length()-1;
        while(i<j && esCapicua){
            if(numero.charAt(i)!=numero.charAt(j)){
                esCapicua=false;
            }
            i++;
            j--;
        }
        return esCapicua;
    }

}
