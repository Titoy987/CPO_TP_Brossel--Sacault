/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_brossel_version_console;

/**
 *
 * @author steven
 */
public class CelluleLumineuse {
        // true = allumée, false = éteinte
    private boolean etat;

    // Constructeur par défaut : cellule éteinte
    public CelluleLumineuse() {
        this.etat = false;
    }

    // Inverse l'état de la cellule
    public void activerCellule() {
        etat = !etat;
    }

    // Éteint la cellule
    public void eteindreCellule() {
        etat = false;
    }

    // Vérifie si la cellule est éteinte
    public boolean estEteinte() {
        return etat == false;
    }

    // Retourne l'état brut
    public boolean getEtat() {
        return etat;
    }

    // Représentation texte
    @Override
    public String toString() {
        if (etat) {
            return "X"; // allumée
        }
        else {
            return "O"; // éteinte
        }
    }
}
