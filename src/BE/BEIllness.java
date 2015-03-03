/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;


public class BEIllness {
    private String name;
    private String description;
    
    
    public BEIllness(String name, String description){
        this.name = name;
        this.description = description;
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
    
    @Override
    public String toString(){
        return this.name;
    }
}
