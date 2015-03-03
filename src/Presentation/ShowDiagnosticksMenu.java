/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BE.BEDiagnose;
import BE.BEIllness;
import BLL.DiagnoseData;
import BLL.IllnessData;

/**
 *
 * @author Niels
 */
public class ShowDiagnosticksMenu extends Menu{

    public ShowDiagnosticksMenu() {
        super("Show diagnostics menu", " list all diagnostics");
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
        for(BEDiagnose diag : DiagnoseData.getInstance().getDiagnoses()){
            System.out.println(diag);
        }
    }
    
}
