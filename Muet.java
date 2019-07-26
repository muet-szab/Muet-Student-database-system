/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muet;

/**
 *
 * @author ADIL RAZA
 */
public class Muet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Students std[] = new Students [4]; 
    std[0]=new Students("asas","asa","assa","asa");
    std[1]=new Students("asas","asa","assa","asa");
    std[2]=new Students("aa","asa","assa","asa");
    std[3]=new Students("aad","saddsa","assa","asa");
     System.out.println();
     std[0].show();
     System.out.println();
     
    
    for(int i=0; i<4; i++)
  
        if (std[i] != null)   {
        std[i].show();
        System.out.println();
        
        }
      
    
  
    
    }
    
}
