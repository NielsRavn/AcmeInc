/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testtictac;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author peter bærbar
 */
public class TestTictac extends JFrame{
JPanel p = new JPanel();
int rounds = 0;
int player = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new TestTictac();
    }
    
   public TestTictac(){
    super("Tic Tac YO");
   
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     p.setLayout(new GridLayout(3,3));
     for(int i=0; i<9;i++){
     GridButtons buttons = new GridButtons();
     buttons.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             ((GridButtons)e.getSource()).setImageForUser(player == 1? "x":"o");
             rounds++;

             player = (rounds %2) +1; 
             JOptionPane.showMessageDialog(null, player == 1 ? "Thank you Niels":" Thank you Michael");  
             player = (rounds %2) +1;
             System.out.print(" Thank you " + ((GridButtons)e.getSource()).getText());

             //Most annoying tic-tac toe game ever
             for(int i = 0; i < 100; i++)
               JOptionPane.showMessageDialog(null, "YOUR TURN " + ((GridButtons)e.getSource()).getText(), "title", JOptionPane.ERROR_MESSAGE, ((GridButtons)e.getSource()).getImage() );
             
             
             
             JOptionPane.showMessageDialog(null, "YOUR TURN " + ((GridButtons)e.getSource()).getText(), "title", JOptionPane.ERROR_MESSAGE, ((GridButtons)e.getSource()).getImage() );
         }
     });
     p.add(buttons);
     }
     add(p);
     this.setSize(600, 600);
     setVisible(true);
   } 
}
