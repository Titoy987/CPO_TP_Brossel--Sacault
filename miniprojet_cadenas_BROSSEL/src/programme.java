/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steven
 */
public class programme {

    // 4 chiffres pour le cadenas
    private int[] chiffres = new int[4];

    public programme() {
        // Initialisation à 0
        for (int i = 0; i < 4; i++) {
            chiffres[i] = 0;
        }
    }

    // Incrémente un chiffre (0 → 9 puis revient à 0)
    public void incrementer(int index) {
        if (index < 0 || index >= chiffres.length) return;
        chiffres[index]++;
        if (chiffres[index] > 9) {
            chiffres[index] = 0;
        }
    }

    // Décrémente un chiffre (0 → 9 en dessous)
    public void decrementer(int index) {
        if (index < 0 || index >= chiffres.length) return;
        chiffres[index]--;
        if (chiffres[index] < 0) {
            chiffres[index] = 9;
        }
    }

    // Récupérer la valeur d’un chiffre
    public int getChiffre(int index) {
        if (index < 0 || index >= chiffres.length) return 0;
        return chiffres[index];
    }

    // (Optionnel) remettre tous les chiffres à 0
    public void reset() {
        for (int i = 0; i < chiffres.length; i++) {
            chiffres[i] = 0;
        }
    }
}
