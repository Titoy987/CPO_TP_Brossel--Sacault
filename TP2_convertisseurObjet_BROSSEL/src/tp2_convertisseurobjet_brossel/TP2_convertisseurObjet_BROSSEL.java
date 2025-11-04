/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_brossel;

import java.util.Scanner;

/**
 *
 * @author steven
 */
public class TP2_convertisseurObjet_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur : ");
        double temp = Sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : ");
        System.out.println("1) de celcius vers kelvin");
        System.out.println("2) de kelvin vers celcius");
        System.out.println("3) de farenheit vers celcius");
        System.out.println("4) de celcius vers farenheit");
        System.out.println("5) de Kelvin vers farenheit");
        System.out.println("6) de farenheit vers kelvin");
        
        int choix = Sc.nextInt();
        double resultat=0;
        String avant = "";
        String apres ="";
        if(choix == 1){
            resultat = conv1.CelciusVersKelvin(temp);
            avant = "Celcius";
            apres = "Kelvin";
        }
        else if(choix==2){
            resultat = conv1.KelvinVersCelcius(temp);
            avant = "Kelvin";
            apres = "Celcius";
        }
        else if(choix==3){
            resultat = conv1.FarenheitVersCelcius(temp);
            avant = "Farenheit";
            apres = "Celcius";
        }
        else if(choix==4){
            resultat = conv1.CelciusVersFarenheit(temp);
            avant = "Celcius";
            apres = "Farenheit";
        }
        else if(choix == 5){
            resultat = conv1.KelvinVersFarenheit(temp);
            avant = "Kelvin";
            apres = "Farenheit";
        }
        else if(choix == 6){
            resultat = conv1.FarenheitVersKelvin(temp);
            avant = "Farenheit";
            apres = "Kelvin";
        }
        else{
            System.out.println("erreur");
        }
        System.out.println(temp + " degré " + avant + " est égal à " + resultat + " degré " + apres);
    }
    
}
