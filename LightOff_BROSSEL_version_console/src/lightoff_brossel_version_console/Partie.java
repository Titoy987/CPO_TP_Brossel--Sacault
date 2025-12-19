/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_brossel_version_console;

/**
 *
 * @author steven
 */
import java.util.Scanner;

public class Partie {

    private Grille_jeu grille;   // ou GrilleDeJeu si tu as nommé comme ça
    private int nbCoups;

    // Constructeur
    public Partie() {
        // si ta grille est fixée à 5x5 dans le constructeur : new Grille_jeu();
        // sinon si tu as (lignes, colonnes) : new Grille_jeu(5,5);
        this.grille = new Grille_jeu();
        this.nbCoups = 0;
    }

    // Initialise la partie (grille mélangée)
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10); // tu peux changer 10
        nbCoups = 0;
    }

    // Boucle de jeu
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LIGHT OFF (console) ===");
        System.out.println("Objectif: éteindre toutes les cellules.\n");

        while (!grille.cellulesToutesEteintes()) {
            System.out.println(grille);
            System.out.println("Coups joués: " + nbCoups);

            System.out.println("\nQue veux-tu activer ?");
            System.out.println("  L <index>  : activer une ligne (ex: L 2)");
            System.out.println("  C <index>  : activer une colonne (ex: C 4)");
            System.out.println("  D1         : diagonale descendante");
            System.out.println("  D2         : diagonale montante");
            System.out.print("> ");

            String choix = sc.nextLine().trim().toUpperCase();

            boolean coupValide = true;

            try {
                if (choix.startsWith("L ")) {
                    int idLigne = Integer.parseInt(choix.substring(2).trim());
                    grille.activerLigneDeCellules(idLigne);

                } else if (choix.startsWith("C ")) {
                    int idCol = Integer.parseInt(choix.substring(2).trim());
                    grille.activerColonneDeCellules(idCol);

                } else if (choix.equals("D1")) {
                    grille.activerDiagonaleDescendante();

                } else if (choix.equals("D2")) {
                    grille.activerDiagonaleMontante();

                } else {
                    coupValide = false;
                    System.out.println("Commande invalide.");
                }
            } catch (Exception e) {
                coupValide = false;
                System.out.println("Entrée invalide (index incorrect ?).");
            }

            if (coupValide) {
                nbCoups++;
            }

            System.out.println(); // ligne vide
        }

        System.out.println(grille);
        System.out.println("✅ Bravo ! Grille éteinte en " + nbCoups + " coups.");
        sc.close();
    }
}
