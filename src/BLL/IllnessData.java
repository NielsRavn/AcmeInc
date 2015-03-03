/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.BEIllness;
import java.util.ArrayList;


public class IllnessData {
    
    private static IllnessData instance;
    private ArrayList<BEIllness> illnesses;
    
    public static IllnessData getInstance(){
        if(instance == null){
            instance = new IllnessData();
        }
        return instance;
    }

    public ArrayList<BEIllness> getIllnesses() {
        return illnesses;
    }

    public void AddIllness(BEIllness illness) {
        illnesses.add(illness);
    }
    
    
    private IllnessData(){
        illnesses = new ArrayList<>();
        initIllness();
    }
    
    public void initIllness(){
        illnesses.add(new BEIllness("Flu (Influenza)","The flu is an infectious disease caused by the influenza virus. Symptoms can be mild to severe. The most common symptoms include: a high fever, runny nose, sore throat, muscle pains, headache, coughing, and feeling tired. "));
        illnesses.add(new BEIllness("MRSA (Methicillin-resistant Staphylococcus aureus)","MRSA is an infection is caused by a strain of staph bacteria that's become resistant to the antibiotics commonly used to treat ordinary staph infections."));
        illnesses.add(new BEIllness("Gonorrhea","Gonorrhoea is a common sexually transmitted infection caused by the bacterium Neisseria gonorrhoeae."));
    }
}
