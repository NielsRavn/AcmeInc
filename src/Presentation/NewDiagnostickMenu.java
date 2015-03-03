/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BLL.IllnessData;
import Models.Diagnose;
import java.util.Scanner;

/**
 *
 * @author Niels
 */
public class NewDiagnostickMenu extends Menu{

    private Scanner sc;
    
    public NewDiagnostickMenu() {
        super("enter diagnose", "Enter new diagnose");
        sc = new Scanner(System.in);
    }

    @Override
    protected void doAction(int option) {
        switch(option){
            case 1: 
                createNewDiagnose();
                break;
        }
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
        System.out.println("Etner diagnose: ");
        String diagnose = sc.nextLine();
        
        newDiagnose(dName, pName, diagnose);
    }
    
    private void newDiagnose(String dName, String pName, String diagnose){
        Diagnose diag = new Diagnose(dName, pName, diagnose);
    }
    
}
