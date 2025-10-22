/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_brossel;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author steven
 */
public class TP1_guessMyNumber_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        
        int n = generateurAleat.nextInt(100);
        int joueur = 0;
        Scanner Sc = new Scanner(System.in);
        while (joueur !=n){
            joueur = Sc.nextInt();
            if(joueur<n){
                System.out.println("plus grand");
            }
            else if(joueur>n){
                System.out.println("plus petit");
            }
            else{
                System.out.println("gagné");
            }
        }
    }
    
}
