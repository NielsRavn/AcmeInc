/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acmeinc;

public class CommandLine {
    
   
    /**
     * What happens when the application starts
     */
    public void start(){
        for(BEIllness be : new IllnessData().getIllness()){
            System.out.println(be.getName() + " - " + be.getDescription());
        }
    }
}
