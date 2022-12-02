/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 9. Escriu un programa que donada una persona i el seu idioma de preferència,
 * el programa ha d’escriure per pantalla: “Hola bon dia Pepe Sánchez”. Els
 * idiomes disponibles són: castellà, català i anglès.
 *
 * @author super
 */
public class Ex1_09 {

    private static Scanner lector = new Scanner(System.in);
    private static String nom, cognoms;
    private static int idioma;

    public static void main(String[] args) {

        demanaDades();

        saluda(nom, cognoms, idioma);
    }

    private static void demanaDades() {
        System.out.print("Insereix el teu nom: ");
        nom = lector.nextLine();
        System.out.print("Insereix els teus cognoms: ");
        cognoms = lector.nextLine();
        System.out.print("Selecciona el teu idioma: ");
        System.out.println("");
        System.out.println("1. Español");
        System.out.println("2. Català");
        System.out.println("3. English");

        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        idioma = lector.nextInt();
    }

    private static void saluda(String nom, String cognoms, int idioma) {
        String missatge = "";
        switch (idioma) {
            case 1: //Castellano
                missatge = "Hola buenos días";
                break;
            case 2: //Català
                missatge = "Hola bon dia";
                break;
            case 3:
                missatge = "Hello good morning";
                break;
            default:
                System.out.println("Idioma incorrecto...");
        }
        if (idioma == 1 || idioma == 2 || idioma == 3) {
            System.out.printf("%s %s %s\n", missatge, nom, cognoms);
        }

    }

}
