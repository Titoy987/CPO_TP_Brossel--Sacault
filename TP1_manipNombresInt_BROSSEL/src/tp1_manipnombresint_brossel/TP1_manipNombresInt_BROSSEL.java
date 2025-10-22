/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_brossel;

import java.util.Scanner;

/**
 *
 * @author steven
 */
public class TP1_manipNombresInt_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("premier");
        int premier=Sc.nextInt();
        System.out.println("deuxieme");
        int deuxieme=Sc.nextInt();
        System.out.println(premier);
        System.out.println(deuxieme);
        int somme=premier+deuxieme;
        System.out.println("la somme est : "+somme);
        int produit=premier*deuxieme;
        System.out.println("le produit est "+produit);
        int quotient=premier/deuxieme;
        System.out.println("le quotient est "+quotient);
        int reste=premier%deuxieme;
        System.out.println("le reste est "+reste);
    }
    
}
