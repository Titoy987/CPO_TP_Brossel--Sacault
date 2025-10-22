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
        Scanner Sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int n = 0;
        int niveau = 0;
        int i = 0;
        int joueur = 0;
        int bonus = 0;
        
        
        
        System.out.println("Choisir la difficulté");
        System.out.println("1) facile");
        System.out.println("2) moyen");
        System.out.println("3) difficile");
        niveau =Sc.nextInt();
        if(niveau == 1){
            n = generateurAleat.nextInt(20);
        }
        else if(niveau == 2){
            n = generateurAleat.nextInt(100);
        }
        else if(niveau == 3){
            n = generateurAleat.nextInt(200);
        }
        else{
            System.out.println("erreur");
        }
        
        
        
        
        
        
        while (joueur !=n){
            bonus = generateurAleat.nextInt(3);
            System.out.println("saisir un nombre :");
            joueur = Sc.nextInt();
            i+=1;
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
        System.out.println(i + " tentatives");
    }
    
}
