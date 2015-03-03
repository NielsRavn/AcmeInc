/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Models.Diagnose;
import java.util.ArrayList;

/**
 *
 * @author Christian
 */
public class DiagnoseData {
    private ArrayList<Diagnose> diagnoses;
    
    public DiagnoseData(){
        populateList();
    }

    public void populateList() {
        diagnoses = new ArrayList<>();
        diagnoses.add(new Diagnose("Lars Hansen", "Line Mungaard", null));
        diagnoses.add(new Diagnose("Bill Gates", "Steve Jobs", "To rich"));
        diagnoses.add(new Diagnose("Emma Frandsen", "Putin", null));
        diagnoses.add(new Diagnose("Olivia", "Ethan", null));
        diagnoses.add(new Diagnose("Mason", "Madison", null));
        diagnoses.add(new Diagnose("Elizabeth", "Michael", null));
        diagnoses.add(new Diagnose("Niels", "Anders", null));
        diagnoses.add(new Diagnose("Morten", "Peter", null));
        diagnoses.add(new Diagnose("Andreas", "Nicolai", null));
        diagnoses.add(new Diagnose("Dumbus", "Doofy", null));
    }
    
    public void addNewDiagnose(Diagnose diag){
        diagnoses.add(diag);
    }
    
    public ArrayList<Diagnose> Getall(){
        return diagnoses;
    }
}
