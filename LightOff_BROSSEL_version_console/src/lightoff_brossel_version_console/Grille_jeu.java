/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_brossel_version_console;

/**
 *
 * @author steven
 */
import java.util.Random;


public class Grille_jeu {

    private int nbLignes;
    private int nbColonnes;
    private boolean[][] grille;

    public Grille_jeu() {
        nbLignes = 5;
        nbColonnes = 5;
        grille = new boolean[nbLignes][nbColonnes];
        eteindreToutesLesCellules();
    }

    public void inverserCellule(int ligne, int colonne) {
        if (ligne < 0 || ligne >= nbLignes || colonne < 0 || colonne >= nbColonnes) {
            return; // évite crash si indices invalides
        }
        grille[ligne][colonne] = !grille[ligne][colonne];
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = false;
            }
        }
    }

    // ✅ AJOUT: retourne true si toutes les cases sont éteintes
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (grille[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ✅ AJOUT: inverse toute une ligne
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne < 0 || idLigne >= nbLignes) {
            return;
        }
        for (int j = 0; j < nbColonnes; j++) {
            grille[idLigne][j] = !grille[idLigne][j];
        }
    }

    // ✅ AJOUT: inverse toute une colonne
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne < 0 || idColonne >= nbColonnes) {
            return;
        }
        for (int i = 0; i < nbLignes; i++) {
            grille[i][idColonne] = !grille[i][idColonne];
        }
    }

    // ✅ AJOUT: diagonale descendante (0,0) -> (4,4)
    public void activerDiagonaleDescendante() {
        int n = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < n; i++) {
            grille[i][i] = !grille[i][i];
        }
    }

    // ✅ AJOUT: diagonale montante (4,0) -> (0,4)
    public void activerDiagonaleMontante() {
        int n = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < n; i++) {
            grille[nbLignes - 1 - i][i] = !grille[nbLignes - 1 - i][i];
        }
    }

    // ✅ Mélange “correct” selon ton sujet: on active ligne/colonne/diagonale au hasard
    public void melangerMatriceAleatoirement(int nbTours) {
        Random rand = new Random();
        eteindreToutesLesCellules();

        for (int k = 0; k < nbTours; k++) {
            int choix = rand.nextInt(4); // 0..3
            if (choix == 0) {
                activerLigneDeCellules(rand.nextInt(nbLignes));
            } else if (choix == 1) {
                activerColonneDeCellules(rand.nextInt(nbColonnes));
            } else if (choix == 2) {
                activerDiagonaleDescendante();
            } else {
                activerDiagonaleMontante();
            }
        }
    }

    @Override
    public String toString() {
        String resultat = "";

        resultat += "   ";
        for (int j = 0; j < nbColonnes; j++) {
            resultat += j + "   ";
        }
        resultat += "\n";

        resultat += "  ";
        for (int j = 0; j < nbColonnes; j++) {
            resultat += "----";
        }
        resultat += "\n";

        for (int i = 0; i < nbLignes; i++) {
            resultat += i + " | ";
            for (int j = 0; j < nbColonnes; j++) {
                resultat += (grille[i][j] ? "X" : "O") + " | ";
            }
            resultat += "\n";

            resultat += "  ";
            for (int j = 0; j < nbColonnes; j++) {
                resultat += "----";
            }
            resultat += "\n";
        }

        return resultat;
    }
}