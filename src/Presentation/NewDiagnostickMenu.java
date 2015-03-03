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

    private Scanner sc;
    
    public NewDiagnostickMenu() {
        super("New Diagnose");
        createNewDiagnose();
    }
    
    @Override
    protected void doAction(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void createNewDiagnose(){
        System.out.println("Enter doctors name: ");
        String dName = sc.nextLine();
        System.out.println("Doctors name: " + dName);
        System.out.println("");
        System.out.println("Enter patients name: ");
        String pName = sc.nextLine();
        System.out.println("Patients name: " + pName);
        System.out.println("");
        System.out.println("Enter diagnose: ");
        String diagnose = sc.nextLine();
        
        newDiagnose(dName, pName, diagnose);
    }
    
    private void newDiagnose(String dName, String pName, String diagnose){
       // Diagnose diag = new Diagnose(dName, pName, diagnose);
    }

    
}
