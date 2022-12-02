/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 1. Escriu un programa per elaborar pressupostos. El programa deixarà inserir
 * línies del pressupost fins que es polsa 0. De cada article s’inserirà la
 * descripció, el preu unitari i les unitats. En finalitzar el programa, es
 * mostrarà el total acumulat sense iva, l’iva i el total amb iva.
 *
 * @author super
 */
public class Ex2_01 {

    private static String pressupost = "";
    private static double totalAcumulat;

    public static void main(String[] args) {
        int opcio;

        do {

            mostrarMenu();
            opcio = getValidInt("Opció: ");
            avaluaOpcio(opcio);

        } while (opcio != 0);
    }

    private static void avaluaOpcio(int opcio) {
        switch (opcio) {
            case 1: // 1. Inserir nova línia
                afegirLinia();
                break;
            case 0: // 0. Sortir
                mostrarResultats();
                break;
            default:
                System.out.println("Opció incorrecta...");
        }
    }

    private static String getDescripcio(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.print(missatge);
        return lector.nextLine();
    }

    private static int getValidInt(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.print(missatge);
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }

    private static double getValidDouble(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.print(missatge);
        while (!lector.hasNextDouble()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextDouble();
    }

    private static void afegirLinia() {
        //descripció, el preu unitari i les unitats
        String descripcio;
        double preuUnitari, subtotal;
        int unitats;

        descripcio = getDescripcio("Descripció: ");
        unitats = getValidInt("Unitats: ");
        preuUnitari = getValidDouble("Preu unitari: ");

        subtotal = preuUnitari * unitats;
        totalAcumulat = totalAcumulat + subtotal;

        pressupost = pressupost + String.format("%15s %7s %7.2f %8.2f\n", descripcio, unitats, preuUnitari, subtotal);

    }

    private static void mostrarResultats() {
        System.out.println("");
        System.out.println("***** Pressupost *****");
        System.out.printf("%15s %7s %7s %8s\n", "Descripció", "Unitats", "Preu U.", "Subtotal");
        System.out.println("-------------------------------------");
        System.out.println(pressupost);
        System.out.println("-------------------------------------");
        System.out.println("Total " + totalAcumulat);
    }

    private static void mostrarMenu() {
        System.out.println("Selecciona una opció...");
        System.out.println("1. Inserir nova línia");
        System.out.println("0. Sortir");
    }

}
