/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author steven
 */
public class Personnage {
    String nom;
    int niveauVie;
    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        if (niveauVie < 0) {
            this.niveauVie = 0;
        } else {
            this.niveauVie = niveauVie;
        }
    }
    public int getNiveauVie() {
        return niveauVie;
    }
    public String getNom() {
        return nom;
    }
        @Override
    public String toString() {
        return "Personnage : " + nom + ", Niveau de vie : " + niveauVie;
    }
}
