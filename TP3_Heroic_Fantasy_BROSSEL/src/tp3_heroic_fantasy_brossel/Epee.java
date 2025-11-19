/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_brossel;

/**
 *
 * @author steven
 */
public class Epee extends Arme {

    private int finesse; // < 100

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // constructeur de la classe Arme
        if (finesse > 100) {
            this.finesse = 100;
        } else if (finesse < 0) {
            this.finesse = 0;
        } else {
            this.finesse = finesse;
        }
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + finesse;
    }
}
