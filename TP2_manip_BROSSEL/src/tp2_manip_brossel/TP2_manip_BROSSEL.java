/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_brossel;

/**
 *
 * @author steven
 */
public class TP2_manip_BROSSEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moussaka[] tab=new Moussaka[10];
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        assiette1=assiette2;
        assiette2=assiette3;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        for(int i=0; i<tab.length;i++){
            Moussaka var= new Moussaka(i*100);
            tab[i]=var;
        }
    }
    
}
