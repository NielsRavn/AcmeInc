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
    private ArrayList<BESympton> symptons;
    
    
    public BEIllness(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public BEIllness(String name, String description, ArrayList<BESympton> symptons){
        this.name = name;
        this.description = description;
        this.symptons = symptons;
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
    
    public ArrayList<BESympton> getSymptons(){
        return this.symptons;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
