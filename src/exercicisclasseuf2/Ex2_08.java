/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * 8. Escriu un programa que mostra un menú que permet:
 *
 * 1. Inserir dades (nom, cognom1 i cognom2)
 *
 * 2. Mostrar el nom complet
 *
 * 3. Mostrar el nom complet del revés
 *
 * 4. Mostra el número de vocals i el número de consonants que conté el nom
 * complet
 *
 * @author super
 */
public class Ex2_08 {

    //Declarem las variables de forma global
    private static String nom = "", cognom1 = "", cognom2 = "";

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            executarOperacio(getOpcio());
        }
    }

    private static void mostrarMenu() {
        System.out.println("Selecciona una operació a realitzar...");
        System.out.println("1. Inserir dades (nom, cognom1 i cognom2)");
        System.out.println("2. Mostrar el nom complet");
        System.out.println("3. Mostrar el nom complet del revés");
        System.out.println("4. Mostra el número de vocals i el número de consonants que conté el nom complet");
        System.out.println("0. Sortir");
    }

    private static int getOpcio() {
        Scanner lector = new Scanner(System.in);

        while (!lector.hasNextInt()) {
            System.out.println("Has de posar un número");
            lector.nextLine();
        }

        return lector.nextInt();
    }

    private static void executarOperacio(int opcio) {
        switch (opcio) {
            case 1: //1. Inserir dades (nom, cognom1 i cognom2)
                inserirDades();
                break;
            case 2: //2. Mostrar el nom complet
                mostrarNomComplet();
                break;
            case 3: //3. Mostrar el nom complet del revés
                mostrarNomCompletDelReves();
                break;
            case 4: //4. Mostra el número de vocals i el número de consonants que conté el nom complet
                mostrarVocalsIConsonants();
                break;
            case 0:
                System.out.println("Adéu...");
                exit(0);
                break;
            default:
                System.out.println("Opció incorrecta...");
        }
    }

    private static void inserirDades() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Donam el nom: ");
        nom = lector.nextLine();
        System.out.print("Donam el primer cognom: ");
        cognom1 = lector.nextLine();
        System.out.print("Donam el segon cognom: ");
        cognom2 = lector.nextLine();

        System.out.println("Dades guardades correctament...");
    }

    private static void mostrarNomComplet() {
        System.out.println("Nom complet: " + nom + " " + cognom1 + " " + cognom2);
    }

    private static void mostrarNomCompletDelReves() {
        String nomComplet = nom + " " + cognom1 + " " + cognom2;
        String delReves = "";
        for (int i = nomComplet.length()-1; i >=0; i--) {
            delReves = delReves + nomComplet.charAt(i);
        }
        
        System.out.println("Nom complet del revés: " + delReves);
        
    }

    private static void mostrarVocalsIConsonants() {
        String nomComplet = nom + cognom1 + cognom2;
        int numVocals=0;
        int numConsonants=0;
        char[] vocals = {'a','e','i','o','u','A','E','I','O','U'};
        boolean trobat = false;
        
        for (int i = 0; i < nomComplet.length(); i++) {
            trobat = false;
            for (int j = 0; j < vocals.length && !trobat; j++) {
                if(nomComplet.charAt(i)==vocals[j]){
                    trobat=true;
                    numVocals++;
                }
            }
            if(!trobat){
                numConsonants++;
            }
                
        }
        
        System.out.println("El número de vocals és: " + numVocals);
        System.out.println("El número de consonants és: " + numConsonants);
        
    }
}
