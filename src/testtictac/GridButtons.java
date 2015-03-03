/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testtictac;


import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 *
 * @author peter bærbar
 */
class GridButtons extends JButton {
 ImageIcon X,O, current;
         
   public GridButtons(){
   X = new ImageIcon(this.getClass().getResource("mc.jpg"));
   O = new ImageIcon(this.getClass().getResource("ns.jpg"));
   current = X;
   }      
   
   public void setImageForUser(String turn){
       this.setIcon(turn.equalsIgnoreCase("x") ? X:O);
       
   }        

   
   
   public ImageIcon getImage(){
      if(current == X)
          current = O;
      else 
          current = X;
       return current; 

   }

         
}
