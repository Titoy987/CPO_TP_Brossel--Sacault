/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_brossel;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.Vector;

/**
 *
 * @author steven
 */
public class TP3_Heroic_Fantasy_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        Vector<Arme> armes = new Vector<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.elementAt(i).toString());
        }
        
        Magicien mag1 = new Magicien("Gandalf", 65, true);
        Magicien mag2 = new Magicien("Garcimore", 44, false);

        Guerrier guerrier1 = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);

        Vector<Personnage> personnages = new Vector<>();
        personnages.add(mag1);
        personnages.add(mag2);
        personnages.add(guerrier1);
        personnages.add(guerrier2);

        for (int i = 0; i < personnages.size(); i++) {
            System.out.println(personnages.elementAt(i).toString());
        }
    }
    
}
