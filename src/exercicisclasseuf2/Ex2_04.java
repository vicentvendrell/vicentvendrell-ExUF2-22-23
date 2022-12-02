/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 * Escriu un programa que puga convertir una unitat de mesura inicial a altres,
 * per exemple de MB a KB o a bits.
 *
 * @author super
 */
public class Ex2_04 {

    public static void main(String[] args) {

        while (true) {
            seleccionarOpcio();
        }

    }

    private static void mostrarMenu() {
        System.out.println("Selecciona una unitat de mesura inicial...");
        System.out.println("1. MB");
        System.out.println("2. KB");
        System.out.println("3. Byte");
        System.out.println("4. bits");
        System.out.println("0. Sortir");
    }

    private static void seleccionarOpcio() {
    
        mostrarMenu();

        int opcio = getValidInt("Opció: ");

        avaluarOpcio(opcio);
    }
    
    private static int getValidInt(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.println(missatge);
        while (!lector.hasNextInt()) {
            System.out.println(missatge);
            lector.nextLine();
        }
        return lector.nextInt();
    }

    private static void avaluarOpcio(int opcio) {
        int unitats = getValidInt("Donam les unitats a convertir...");
        switch (opcio) {
            case 1: // 1. MB
                desdeMegues(unitats);
                break;
            case 2: // 2. KB
                desdeK(unitats);
                break;
            case 3: // 3. B
                desdeB(unitats);
                break;
            case 4: // 4. bits
                desdeBits(unitats);
                break;
            case 0:
                System.out.println("Adéu...");
                exit(0);
                break;
            default:
                System.out.println("Opció incorrecta...");
        }
    }

    private static void desdeMegues(int unitats) {
        double KB = unitats * 1024;
        double B = KB * 1024;
        double bits = B * 8;
        System.out.printf("MB: %s, KB: %s, B: %s,  bits: %s\n", unitats, KB, B, bits);

    }

    private static void desdeK(int unitats) {
        double MB = unitats / 1024;
        double B = unitats * 1024;
        double bits = B * 8;
        System.out.printf("MB: %s, KB: %s, B: %s,  bits: %s\n", MB, unitats, B, bits);
    }

    private static void desdeB(int unitats) {
        double MB = unitats / 1024 / 1024;
        double KB = unitats / 1024;
        double bits = unitats * 8;
        System.out.printf("MB: %s, KB: %s, B: %s,  bits: %s\n", MB, KB, unitats, bits);
    }

    private static void desdeBits(int unitats) {
        double MB = unitats / 8 / 1024 / 1024;
        double KB = unitats / 8 / 1024;
        double B = unitats / 8;
        System.out.printf("MB: %s, KB: %s, B: %s,  bits: %s\n", MB, KB, B, unitats);
    }
}
