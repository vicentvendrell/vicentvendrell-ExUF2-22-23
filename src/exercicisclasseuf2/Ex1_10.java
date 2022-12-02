/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * Escriu un programa que permet introduir números fins que el polsa 0. A cada
 * número introduït s’anirà acumulant el seu valor, informant si el número és
 * positiu o negatiu.
 *
 * @author super
 */
public class Ex1_10 {
    
    public static void main(String[] args) {        
        int valor = -1;
        int acumulat=0;

        while(valor!=0){
            valor=getValidInt("Escriu un número");
            acumulat = sumaAcumulat(acumulat,valor);
            avalua(valor);
        }
        mostrarAcumulat("El valor acumulat és: " , acumulat);
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
    
    private static int sumaAcumulat(int acumulat, int valor) {
        acumulat += valor;
        return acumulat;
    }

    private static void mostrarAcumulat(String misstage, int acumulat) {
        System.out.println(misstage + acumulat);
    }

    private static void avalua(int valor) {
        if(valor>0){
            System.out.println("Elnúmero és positiu");
        }else if(valor<0){
            System.out.println("El número és negatiu");
        }else{
            System.out.println("El número es zero...");
        }
    }
}
