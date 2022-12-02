/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 2. Escriu un programa que calcula l’àrea i la longitud d’una circumferència
 * en funció del radi (entrat per teclat). S’ha d’escriure un mètode per
 * calcular l’àrea i un altre per la longitud. Les fórmules de l’àrea i la
 * longitud d’una circumferència: A=pi*r² i L=2*pi*r.
 *
 * @author super
 */
public class Ex1_02 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio = 0;

        do {
            System.out.println("Selecciona una opció...");
            System.out.println("1. Calcular l'àrea d'una circunferència");
            System.out.println("2. Calcular la longitud d'una circunferència");
            System.out.println("0. Sortir");

            while (!lector.hasNextInt()) {
                System.out.println("Has de posar un número");
                lector.nextLine();
            }
            opcio = lector.nextInt();
            lector.nextLine();

            switch (opcio) {
                case 1://1. Calcular l'àrea d'una circunferència"); A=pi*r²
                    System.out.print("Donam el radi de la circunferència...");
                    while (!lector.hasNextInt()) {
                        System.out.println("Has de posar un número");
                        lector.nextLine();
                    }
                    opcio = lector.nextInt();
                    lector.nextLine();

                    //Amb una funció que no retorna cap valor
                    areaCircunferencia(opcio);
                    //Amb una funció que retorna un valor
                    System.out.println(getAreaCircunferencia(opcio));
                    
                    break;                    
                case 2://2. Calcular la longitud d'una circunferència; L=2*pi*r
                    System.out.print("Donam el radi de la circunferència...");
                    while (!lector.hasNextInt()) {
                        System.out.println("Has de posar un número");
                        lector.nextLine();
                    }
                    opcio = lector.nextInt();
                    lector.nextLine();

                    //Amb una funció que no retorna cap valor
                    longitudCircunferencia(opcio);
                    //Amb una funció que retorna un valor
                    System.out.println(getLongitudCircunferencia(opcio));
                    
                    break;
                case 0:
                    System.out.println("Adéu...");
                    break;
                default:
                    System.out.println("Opció incorrecta...");
            }

        } while (opcio != 0);
    }

    /**
     * Mostra per pantalla l'àrea d'una circunferència en base al radi 
     * que es pasa com paràmetre d'entrada
     * 
     * @param radi 
     */
    private static void areaCircunferencia(int radi) { // A=pi*r²
        double area;
        area = Math.PI * radi;
        System.out.println("El àrea és: " + area);
    }

    /**
     * Retorna l'àrea d'una circunferència en base al radi 
     * que es pasa com paràmetre d'entrada
     * 
     * @param radi
     * @return 
     */
    private static double getAreaCircunferencia(int radi) {
        double area;
        area = Math.PI * radi;
        return area;
    }

    /**
     * Mostra per pantalla la longitud d'una circunferència en base al radi 
     * que es pasa com paràmetre d'entrada
     * 
     * @param radi 
     */
    private static void longitudCircunferencia(int radi) { // L=2*pi*r
        double longitud;
        longitud = 2 * Math.PI * radi;
        System.out.println("El àrea és: " + longitud);
    }
    
    /**
     * Retorna la longitud d'una circunferència en base al radi 
     * que es pasa com paràmetre d'entrada
     * 
     * @param radi
     * @return 
     */
    private static double getLongitudCircunferencia(int radi) { // L=2*pi*r
        double longitud;
        longitud = 2 * Math.PI * radi;
        return longitud;
    }

}
