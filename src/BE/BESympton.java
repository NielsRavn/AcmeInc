/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

public class BESympton {
    
    private String name;
    
    public BESympton(String name){
        this.name = name;
    }
    
    public String getSymption(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
