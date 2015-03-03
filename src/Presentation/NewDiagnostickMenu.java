/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BE.BEDiagnose;
import BLL.DiagnoseData;
import BLL.IllnessData;
import java.util.Scanner;

/**
 *
 * @author Niels
 */
public class NewDiagnostickMenu extends Menu{

    private Scanner sc;
    
    public NewDiagnostickMenu() {
        super("New Diagnose", "create diagnose");
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
        System.out.println("Enter diagnose: ");
        String diagnose = sc.nextLine();
        
        newDiagnose(dName, pName, diagnose);
    }
    
    private void newDiagnose(String dName, String pName, String diagnose){
        BEDiagnose diag = new BEDiagnose(dName, pName, diagnose);
        DiagnoseData.getInstance().addDiagnose(diag);
    }

    
}
