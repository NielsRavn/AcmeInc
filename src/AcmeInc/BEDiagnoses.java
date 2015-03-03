/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acmeinc;


public class BEDiagnoses {
    private String name;
    private String description;
    
    
    public BEDiagnoses(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    /**
     *
     * @return name of diagnoses
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 
     * @return description of diagnoses
     */
    public String getDescription(){
        return this.description;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return this.name;
    }
}
