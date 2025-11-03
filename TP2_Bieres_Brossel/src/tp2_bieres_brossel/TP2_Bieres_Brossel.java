/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brossel;

/**
 *
 * @author steven
 */
public class TP2_Bieres_Brossel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("cuvée des trolls",7.0,"Dubuisson");
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere secondBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
        secondBiere.lireEtiquette();  
        
        BouteilleBiere autreBiere = new BouteilleBiere("test1", 4.6,"blabla");
        autreBiere.lireEtiquette();
        
        BouteilleBiere deuxautreBiere = new BouteilleBiere("test2", 5.0, "bla");
        deuxautreBiere.lireEtiquette();
        
        BouteilleBiere troisautreBiere = new BouteilleBiere("test3", 12.2,"BLABLA");
        troisautreBiere.lireEtiquette();
        
        
        secondBiere.Decapsuler();
        System.out.println(secondBiere);
    }
    
}
