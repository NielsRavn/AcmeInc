/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.BEDiagnose;
import java.util.ArrayList;

/**
 *
 * @author Niels
 */
public class DiagnoseData {
    
    public static DiagnoseData instance;
    
    public static DiagnoseData getInstance(){
        if(instance == null){
            instance = new DiagnoseData();
        }
        return instance;
    }
    
    private DiagnoseData(){
        diagnoses = new ArrayList<>();
    }
    
    ArrayList<BEDiagnose> diagnoses;

    public ArrayList<BEDiagnose> getDiagnoses() {
        return diagnoses;
    }

    public void addDiagnose(BEDiagnose diagnose) {
        diagnoses.add(diagnose);
    }
    
    
    
}
