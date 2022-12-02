/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 6. Escriu una funció que accepta dos arguments: el caràcter que es desitja
 * imprimir i el número de vegades que s’ha d’imprimir.
 *
 * @author super
 */
public class Ex1_06 {

    public static void main(String[] args) {
        char lletra;
        int numRepeticions;

        lletra = getValidChar("Escriu una lletra");

        numRepeticions = getValidInt("Donam el número de vegades que el vols repetir");

        repeteixLletra(lletra, numRepeticions);
        repeteixLletraNumerat(lletra, numRepeticions);
    }

    /**
     * Funció que retorna un número sencer vàlid Té com paràmetre d'entrada un
     * missatge que es mostra a l'usuari
     *
     * @param missatge
     * @return
     */
    private static int getValidInt(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.println(missatge);
        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }
        return lector.nextInt();
    }

    /**
     * Funció que retorna el primer caràcter que ha introduït l'usuari
     * @param missatge
     * @return 
     */
    private static char getValidChar(String missatge) {
        Scanner lector = new Scanner(System.in);
        System.out.println(missatge);
        while (!lector.hasNextLine()) {
            System.out.println(missatge);
            lector.nextLine();
        }
        return lector.nextLine().charAt(0);
    }

    private static void repeteixLletra(char lletra, int numRepeticions) {
        for (int i = 0; i < numRepeticions; i++) {
            System.out.print(lletra + " ");
        }
        System.out.println("");
    }

    private static void repeteixLletraNumerat(char lletra, int numRepeticions) {
        for (int i = 0; i < numRepeticions; i++) {
            System.out.println("Repetició: " + i + " " + lletra);
        }
    }
}
