/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 6. Escriu un programa que permet traure el cost econòmic i en temps de
 * producció dels següents productes:
 *
 * Producte1: 30 minuts, 12 eur.
 *
 * Producte2: 15 minuts, 10 eur.
 *
 * Producte3: 6 minuts, 8 eur.
 *
 * El programa demanarà la quantitat de cada producte i mostrarà per pantalla el
 * cost total de tots els productes, i el temps en format HH:MM necessari per
 * poder produir-los.
 *
 * @author super
 */
public class Ex2_06 {

    private static final int TEMPS_P1 = 30;
    private static final int TEMPS_P2 = 15;
    private static final int TEMPS_P3 = 6;
    private static final int COST_P1 = 12;
    private static final int COST_P2 = 10;
    private static final int COST_P3 = 8;
    private static final int MINUTS_X_DIA = 24 * 60;

    public static void main(String[] args) {
        int numP1, numP2, numP3;
        
        while (true) {
            numP1 = getValidInt("Donam la quantitat del producte 1");
            numP2 = getValidInt("Donam la quantitat del producte 2");
            numP3 = getValidInt("Donam la quantitat del producte 3");
            mostrarTemps(numP1,numP2,numP3);
            mostrarCostos(numP1,numP2,numP3);
        }
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

    private static void mostrarTemps(int numP1, int numP2, int numP3) {
        int tempsTotal;
        int dies = 0, hores = 0, minuts = 0;
        
        tempsTotal = TEMPS_P1 * numP1 + TEMPS_P2 * numP2 + TEMPS_P3 * numP3;
        System.out.println("El temps total és: " + tempsTotal + " minuts");

        if (tempsTotal >= (MINUTS_X_DIA)) {//minuts que té un dia
            dies = tempsTotal / 60 / 24;
            hores = tempsTotal / 60 % 24;
            minuts = tempsTotal % 60;
            System.out.println("El temps total és: " + dies + " dies, " + hores + ":" + minuts);
        } else {
            hores = tempsTotal / 60;
            minuts = tempsTotal % 60;
            System.out.println("El temps total és: " + hores + ":" + minuts);
        }
    }

    private static void mostrarCostos(int numP1, int numP2, int numP3) {
        int costTotal;
        costTotal = COST_P1 * numP1 + COST_P2 * numP2 + COST_P3 * numP3;
        System.out.println("El cost total és: " + costTotal + " eur");
    }
}
