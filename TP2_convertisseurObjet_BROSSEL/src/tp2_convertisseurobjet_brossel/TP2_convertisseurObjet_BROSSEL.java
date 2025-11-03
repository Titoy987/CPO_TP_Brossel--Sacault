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
        Convertisseur conv1 = new Convertisseur();
        System.out.println(conv1.CelciusVersFarenheit(12.3));
        System.out.println(conv1);
        
        Convertisseur conv2 = new Convertisseur();
        conv2.CelciusVersKelvin(14);
        System.out.println(conv2.CelciusVersKelvin(14));
    }
    
}
