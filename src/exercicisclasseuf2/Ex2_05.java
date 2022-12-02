/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * Escriu un programa per generar estadístiques. El programa permetrà entrar
 * l’edat i el sexe d’una persona. Per cada persona inserida, mostrarà el
 * percentatge d’homes i dones, així com el número de persones menors d’edat
 * inserides.
 *
 * @author super
 */
public class Ex2_05 {

    private static int numHomes;
    private static int numDones;
    private static int majorEdat;
    private static int menorEdat;

    public static void main(String[] args) {
        while (true) {
            demanarDades();
            mostrarEstadístiques();
        }
    }

    private static void demanarDades() {
        Scanner lector = new Scanner(System.in);
        int opcio;
        System.out.println("Selecciona sexe");
        System.out.println("1. Home");
        System.out.println("2. Dona");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar 1 o 2");
            lector.nextLine();
        }
        opcio = lector.nextInt();//faltaria validar que posa 1 o 2

        if (opcio == 1) {
            numHomes++;
        } else {
            numDones++;
        }

        System.out.println("Insereix la teva edat");
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        opcio = lector.nextInt();//faltaria validar que no és un número negatiu

        if (opcio >= 18) {
            majorEdat++;
        } else {
            menorEdat++;
        }
    }

    private static void mostrarEstadístiques() {
        System.out.println("Resulats...");
        System.out.println("Numero d'homes:  " + numHomes);
        System.out.println("Número de dones: " + numDones);
        if (numHomes != 0) {
            System.out.println("Percentatge d'homes:   " + ((numHomes * 100) / (numHomes + numDones)) + "%");
        }
        if (numDones != 0) {
            System.out.println("Percentatge de dones: " + ((numDones * 100) / (numHomes + numDones)) + "%");
        }
        System.out.println("Persones majors d'edat: " + majorEdat);
        System.out.println("Persones menors d'edat: " + menorEdat);
        if (majorEdat != 0) {
            System.out.println("Percentatge de majors d'edat: " + ((majorEdat * 100) / (majorEdat + menorEdat)) + "%");
        }
        if (menorEdat != 0) {
            System.out.println("Percentatge de menors d'edat: " + ((menorEdat * 100) / (majorEdat + menorEdat)) + "%");
        }
    }
}
