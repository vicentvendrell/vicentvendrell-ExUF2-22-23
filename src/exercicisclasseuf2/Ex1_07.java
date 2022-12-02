/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 7. Escriu una funció que accepta tres arguments: un caràcter i dos números
 * sencers. El caràcter és el que s’ha d’imprimir. El primer número ens dirà
 * quantes vegades s’ha d’imprimir el caràcter en la línia, el segon número ens
 * dirà quantes línies s’han d’imprimir.
 *
 * @author super
 */
public class Ex1_07 {

    public static void main(String[] args) {
        char lletra;
        int numRepeticions, numLinies;
   
        lletra = getValidChar("Escriu una lletra");
        numRepeticions = getValidInt("Donam el número de vegades que el vols repetir");
        numLinies = getValidInt("Donam el número de línies que el vols repetir");

        repeteixLletra(lletra, numRepeticions, numLinies);
    }

    /**
     * Funció que retorna un número sencer vàlid
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
    
    /**
     * Funció que mostra per pantalla un caràcter diverses vegades i en diverses línies
     * depén del numRepeticions i numLinies que es passen com paràmetres d'entrada
     * 
     * @param lletra
     * @param numRepeticions
     * @param numLinies 
     */
    private static void repeteixLletra(char lletra, int numRepeticions, int numLinies) {
        for (int i = 0; i < numLinies; i++) {
            for (int j = 0; j < numRepeticions; j++) {
                System.out.print(lletra + " ");
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
