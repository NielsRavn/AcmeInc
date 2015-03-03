/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import BE.BEIllness;
import BE.BESympton;
import java.util.ArrayList;


public class IllnessData {
    
    private static IllnessData instance;
    private ArrayList<BEIllness> illnesses;
    private ArrayList<BESympton> symptons;
    
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
        BESympton symptonMild = new BESympton("mild");
        BESympton symptonSevere = new BESympton("severe");
        BESympton symptonBarf = new BESympton("barf");
        BESympton symptonHeadache = new BESympton("headache");
        BESympton symptonStomachAche = new BESympton("stomach ache");
        BESympton symptonShit = new BESympton("Shits alot");
        ArrayList<BESympton> symptons = new ArrayList<>();
        symptons.add(symptonMild);
        symptons.add(symptonBarf);
        illnesses.add(new BEIllness("Flu (Influenza)","The flu is an infectious disease caused by the influenza virus. Symptoms can be mild to severe. The most common symptoms include: a high fever, runny nose, sore throat, muscle pains, headache, coughing, and feeling tired. ", symptons));
        symptons.clear();
        symptons.add(symptonSevere);
        symptons.add(symptonHeadache);
        symptons.add(symptonStomachAche);
        illnesses.add(new BEIllness("MRSA (Methicillin-resistant Staphylococcus aureus)","MRSA is an infection is caused by a strain of staph bacteria that's become resistant to the antibiotics commonly used to treat ordinary staph infections.", symptons));
        symptons.clear();
        symptons.add(symptonShit);
        illnesses.add(new BEIllness("Gonorrhea","Gonorrhoea is a common sexually transmitted infection caused by the bacterium Neisseria gonorrhoeae.", symptons));
    }
}
