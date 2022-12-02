/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 * 7. Escriu un programa que simula una calculadora.
 *
 * @author super
 */
public class Ex2_07 {

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            executarOperacio(getOpcio(), getNumero(),getNumero());
        }
    }

    private static void mostrarMenu() {
        System.out.println("Selecciona una operació a realitzar...");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió sencera");
        System.out.println("5. Residu divisió sencera");
        System.out.println("6. Divisió amb decimals");
        System.out.println("0. Sortir");
    }

    private static int getOpcio() {    
        return getNumero();
    }

    private static int getNumero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Donam un número: ");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }

        return lector.nextInt();
    }

    private static void executarOperacio(int opcio, int num1, int num2) {
        switch (opcio) {
            case 1: //1. Suma
                suma(num1, num2);
                break;
            case 2: //2. Resta
                resta(num1, num2);
                break;
            case 3: //3. Multiplicació
                multiplicacio(num1, num2);
                break;
            case 4: //4. Divisió sencera
                divisio(num1, num2);
                break;
            case 5: //5. Residu divisió sencera
                residu(num1, num2);
                break;
            case 6: //6. Divisió amb decimals
                divisioAmbDecimals(num1, num2);
                break;
            case 0:
                System.out.println("Adéu...");
                exit(0);
                break;
            default:
                System.out.println("Opció incorrecta...");
        }
    }

    private static void suma(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
    }

    private static void resta(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    private static void multiplicacio(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }

    private static void divisio(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    }

    private static void residu(int num1, int num2) {
        System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
    }

    private static void divisioAmbDecimals(int num1, int num2) {
        double resultat = Double.valueOf(num1)/Double.valueOf(num2);
        System.out.println(String.format("%s / %s = %.2f",num1,num2,resultat));
    }

}
