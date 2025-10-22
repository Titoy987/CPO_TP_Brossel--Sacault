/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_brossel;

import java.util.Scanner;

/**
 *
 * @author steven
 */

public class TP1_convertisseur_BROSSEL {
    
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double var1 = Sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : ");
        System.out.println("1) de celcius vers kelvin");
        System.out.println("2) de kelvin vers celcius");
        System.out.println("3) de farenheit vers celcius");
        System.out.println("4) de ");
        
    }
    
}
