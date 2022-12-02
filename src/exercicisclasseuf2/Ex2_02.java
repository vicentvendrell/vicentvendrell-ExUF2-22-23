/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicisclasseuf2;

import java.util.Scanner;

/**
 * 2. Escriure un program que donats un número de dies totals, desglosse aquests
 * dies en anys, mesos i dies.
 *
 * @author super
 */
public class Ex2_02 {

    public static void main(String[] args) {

        int diesInicials, anys, mesos, dies;
        int residu;
        
        diesInicials = getValidInt("Donam el número de dies...");

        anys = getAnys(diesInicials);
        mesos = getMesos(getResiduAnys(diesInicials));
        dies = getResiduMesos(getResiduAnys(diesInicials));
        
        mostraResultat(diesInicials, anys, mesos, dies);
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
    
    private static int getAnys(int dies) {
        return dies/365;
    }
    
    private static int getResiduAnys(int dies){
        return dies%365;
    }
    
    private static int getMesos(int dies) {
        return dies/30;
    }
    
    private static int getResiduMesos(int dies){
        return dies%30;
    }   
    
    private static void mostraResultat(int diesInicials, int anys, int mesos, int dies){
        System.out.println(diesInicials + "dies són: " + anys + " anys, " + mesos + " mesos, " + dies + " dies");
    }
    
}
