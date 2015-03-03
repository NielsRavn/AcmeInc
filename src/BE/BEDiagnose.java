/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

import java.util.ArrayList;

public class BEDiagnose {
    
private String diagnose;
private ArrayList<BEIllness> illnesses;
private int upvotes = 0;
private int downvotes = 0;

    public BEDiagnose(String diagnose){
        this.diagnose = diagnose;
    }
    
    public void addIllness(BEIllness be){
        this.illnesses.add(be);
    }
    
    public ArrayList<BEIllness> getDiagnosedIllnesses(){
        return this.illnesses;
    }
    
    public void upvote(){
        upvotes++;
    }
    
    public void downvote(){
        downvotes++;
    }
    
    public int getVotes(){
        return upvotes - downvotes;
    }
    
    public String getDiagnose(){
        return this.diagnose;
    }
}
