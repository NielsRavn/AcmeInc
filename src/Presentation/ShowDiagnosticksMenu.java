/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BLL.DiagnoseData;
import Models.Diagnose;

/**
 *
 * @author Niels
 */
public class ShowDiagnosticksMenu extends Menu{

    DiagnoseData data;
    
    public ShowDiagnosticksMenu() {
        super("Show diagnostics menu", " list all diagnostics");
        data = new DiagnoseData();
    }

    @Override
    protected void doAction(int option) {
        switch(option){
            case 1:
                listAll();
                break;
        }
    }

    private void listAll() {
        for(Diagnose diag : data.Getall()){
            System.out.println("Doctor: " + diag.getDoctor() + " || Patient: " + diag.getPatient() + " || Diagnose: " + diag.getDiagnose());
        }
    }

    private Object DiagnoseData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
