/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_brossel;

import java.util.Scanner;

/**
 *
 * @author steven brossel--sacault
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
    public static double KelvinVersFarenheit(double tKelvin) {
        double tempC = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(tempC);
    }
    public static double FarenheitVersKelvin(double tFarenheit) {
        double tempC = FarenheitVersCelcius(tFarenheit);
        return CelciusVersKelvin(tempC);
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
        System.out.println("4) de celcius vers farenheit");
        System.out.println("5) de Kelvin vers farenheit");
        System.out.println("6) de farenheit vers kelvin");
        int choix = Sc.nextInt();
        double resultat=0;
        String avant ="";
        String apres = "";
        if(choix == 1){
            resultat = CelciusVersKelvin(var1);
            avant = "Celcius";
            apres = "Kelvin";
        }
        else if(choix==2){
            resultat = KelvinVersCelcius(var1);
            avant = "Kelvin";
            apres = "Celcius";
        }
        else if(choix==3){
            resultat = FarenheitVersCelcius(var1);
            avant = "Farenheit";
            apres = "Celcius";
        }
        else if(choix==4){
            resultat = CelciusVersFarenheit(var1);
            avant = "Celcius";
            apres = "Farenheit";
        }
        else if(choix == 5){
            resultat = KelvinVersFarenheit(var1);
            avant = "Kelvin";
            apres = "Farenheit";
        }
        else if(choix == 6){
            resultat = FarenheitVersKelvin(var1);
            avant = "Farenheit";
            apres = "Kelvin";
        }
        else{
            System.out.println("erreur");
        }
        System.out.println(var1 + " degré " + avant + " est égal à " + resultat + " degré " + apres);
               
        
    }
    
}
