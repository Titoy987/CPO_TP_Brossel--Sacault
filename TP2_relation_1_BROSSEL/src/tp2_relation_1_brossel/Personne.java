/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_brossel;

/**
 *
 * @author steven
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
    public Personne(String Unom, String Uprenom){
        nom=Unom;
        prenom=Uprenom;
        liste_voitures = new Voiture [3];
        nbVoitures = 0;
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if(voiture_a_ajouter.Proprietaire != null){
            return false;
        }
        else if(liste_voitures.length == nbVoitures){
            return false;
        }
        else{
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures++;
            voiture_a_ajouter.Proprietaire = this ;
            return true;
        }
    }
    
    @Override
    public String toString() {
        String r = "";
        for(int i=0;i<nbVoitures;i++){
            r = r + liste_voitures[i]+ ", ";
       
        }
        return nom+" "+ prenom+" " + nbVoitures+" "+ r;
    }
}
