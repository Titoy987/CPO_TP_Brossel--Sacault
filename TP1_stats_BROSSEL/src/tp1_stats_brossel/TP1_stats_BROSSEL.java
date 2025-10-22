/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_brossel;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author steven
 */
public class TP1_stats_BROSSEL {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int[] de = new int[6]; // tableau pour compter les occurrences de 1 à 6
        int n = 0;
        System.out.print("Combien de lancers ? ");
        int choix = sc.nextInt();

        for (int i = 0; i < choix; i++) {
            n = generateurAleat.nextInt(6); // 0 à 5
            de[n]++; // on incrémente la face correspondante
        }

        System.out.println(n + " Résultats des lancers :");
        for (int i = 0; i < de.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + de[i] + " fois");
        }

        // Affichage en pourcentage
        System.out.println(n +" Résultats en pourcentage :");
        for (int i = 0; i < de.length; i++) {
            double pourcentage = (double) de[i] / choix * 100;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }

        sc.close();
    }
    
}

