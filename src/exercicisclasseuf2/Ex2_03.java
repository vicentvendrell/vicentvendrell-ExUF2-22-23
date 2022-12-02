/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 * 3.Escriu un programa que siga capaç de convertir velocitat de Km/h a m/s i al
 * revés. L’usuari introdueix les dades i si són Km o m. S’ha d’implementar un
 * menú.
 *
 * @author super
 */
public class Ex2_03 {

    public static void main(String[] args) {

        while (true) {
            seleccionarOpcio();
        }

    }

    private static void seleccionarOpcio() {

        mostrarMenu();

        int opcio = getValidInt("Opció: ");

        avaluarOpcio(opcio);
    }

    private static void mostrarMenu() {
        System.out.println("Selecciona una opció...");
        System.out.println("1. Km/h --> m/s");
        System.out.println("2. m/s --> Km/h");
        System.out.println("0. Sortir");
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

    private static double getValidDouble(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.print(missatge);
        while (!lector.hasNextDouble()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextDouble();
    }

    private static void avaluarOpcio(int opcio) {
        switch (opcio) {
            case 1:
                kilometrosAMetros();
                break;
            case 2:
                metrosAKilometros();
                break;
            case 0:
                System.out.println("Adéu...");
                exit(0);
                break;
            default:
                System.out.println("Opció incorrecta...");
        }
    }

    private static void kilometrosAMetros() {
        //1km / 1hora
        //1000 metres / 3600 segons = 0,2778 metros/segundo
        double velocitat;
        double factorConversió = 0.2778;

        velocitat = getValidDouble("Donam la velocitat en km/h");
        System.out.println(velocitat + " Km/h són: "
                + String.format("%5.2f", velocitat * factorConversió) + " m/s");
        System.out.println("");
    }

    private static void metrosAKilometros() {
        //1km / 1hora
        //1000 metres / 3600 segons = 0,2778 metros/segundo
        Scanner lector = new Scanner(System.in);
        double velocitat;
        double factorConversio = 0.2778;

        velocitat = getValidDouble("Donam la velocitat en m/s");
        System.out.println(velocitat + " m/s són: "
                + String.format("%5.2f", velocitat / factorConversio) + " Km/h");
        System.out.println("");
    }
}
