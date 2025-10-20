/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author Steven brossel--sacault
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) miltiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        Scanner sc = new Scanner(System.in);
        int operateur= sc.nextInt();
        if (operateur >= 5 || operateur <= 0) {
            System.out.println("Erreur : choix invalide !");
            sc.close();
            return;}
        System.out.println("Entrer le 1er nombre :");
        int operande1 = sc.nextInt();
        System.out.println("Entrer le 2eme nombre :");
        int operande2 = sc.nextInt();
        int result = 0;
        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0)
                    result = operande1 / operande2;
                else
                    System.out.println("Erreur : division par zéro !");
                sc.close();
                break;
            case 5:
                result = operande1 % operande2;
                break;
            default:
                System.out.println("Opération invalide !");
                return;
        
        
    }
        System.out.println("Résultat = " + result);
        sc.close();
}
    }

    

