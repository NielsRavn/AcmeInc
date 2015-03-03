/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Christian
 */
public class Diagnose {
    private String doctorName;
    private String patientName;
    private String diagnose;
    
    public Diagnose(String dName, String pName, String diagnose){
        this.doctorName = dName;
        this.patientName = pName;
        this.diagnose = diagnose;
    }
    
    public String getDoctor(){
        return doctorName;
    }
    
    public String getPatient(){
        return patientName;
    }
    
    public String getDiagnose(){
        return diagnose;
    }
}
