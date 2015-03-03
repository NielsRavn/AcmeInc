/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

import java.util.ArrayList;


public class BEIllness {
    private String name;
    private String description;
    private ArrayList<BESymptom> symptoms;
    
    
    public BEIllness(String name, String description, ArrayList<BESymptom> symptoms){
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
    }
     public BEIllness(String name, String description){
        this.name = name;
        this.description = description;
        this.symptoms = new ArrayList<BESymptom>();
    }
    
    /**
     *
     * @return name of illness
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 
     * @return description of illness
     */
    public String getDescription(){
        return this.description;
    }
    
    private ArrayList<BESymptom> getSymptoms(){
        return symptoms;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
    private void addSymptom(BESymptom symptom){
        symptoms.add(symptom);
    }
    
    private void removeSymptom(BESymptom symptom){
        for (BESymptom symptom1 : symptoms) {
            if(symptom1.equals(symptom))
            {
                symptoms.remove(symptom1);
                return;
            }
        }
    }
}
