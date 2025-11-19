/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author steven
 */
public class Magicien extends Personnage {
    boolean confirme;
    
    public Magicien(String nom, int niveauVie, boolean confirme){
        super(nom, niveauVie);
        this.confirme = confirme;
    }
    public boolean isConfirme(){
        return confirme;
    }
    void setConfirme(boolean confirme){
        this.confirme = confirme;
    }
    @Override
    public String toString() {
        return super.toString() + ", Confirmé : " + confirme;
    }
}

