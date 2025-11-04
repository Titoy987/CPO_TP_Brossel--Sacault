/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_brossel;

/**
 *
 * @author steven
 */
public class TP2_relation_1_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[bob.nbVoitures] = uneClio ;
        uneClio.Proprietaire = bob;
        bob.nbVoitures++;
        
        bob.liste_voitures[bob.nbVoitures] = uneAutreClio ;
        uneAutreClio.Proprietaire = bob;
        bob.nbVoitures++;
        
        reno.liste_voitures[reno.nbVoitures]=une2008;
        une2008.Proprietaire =reno;
        reno.nbVoitures++;
        
        reno.liste_voitures[reno.nbVoitures]=uneMicra;
        uneMicra.Proprietaire =reno;
        reno.nbVoitures++;
        
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
    }
    
}
