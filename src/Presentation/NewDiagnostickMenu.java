/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.util.Scanner;

/**
 *
 * @author Niels
 */
public class NewDiagnostickMenu extends Menu{

    public NewDiagnostickMenu() {
        super("New Diagnose");
        newDiagnose();
    }
    
    public void newDiagnose(){
        Scanner scan = new Scanner(System.in);
        String doctorName = scan.nextLine();
        String patientName = scan.nextLine();
        String diagnose = scan.nextLine();
        
    }
    
    

    @Override
    protected void doAction(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
