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
    
    
    public ArrayList<BEIllness> getIllness(){
        
        BESympton symptonMild = new BESympton("mild");
        BESympton symptonSevere = new BESympton("severe");
        BESympton symptonBarf = new BESympton("barf");
        BESympton symptonHeadache = new BESympton("headache");
        BESympton symptonStomachAche = new BESympton("stomach ache");
        BESympton symptonShit = new BESympton("Shits alot");
        ArrayList<BESympton> symptons = new ArrayList<>();
        symptons.add(symptonMild);
        symptons.add(symptonBarf);
        ArrayList<BEIllness> data = new ArrayList<>();
        data.add(new BEIllness("Flu (Influenza)","The flu is an infectious disease caused by the influenza virus. Symptoms can be mild to severe. The most common symptoms include: a high fever, runny nose, sore throat, muscle pains, headache, coughing, and feeling tired. ", symptons));
        symptons.clear();
        symptons.add(symptonSevere);
        symptons.add(symptonHeadache);
        symptons.add(symptonStomachAche);
        data.add(new BEIllness("MRSA (Methicillin-resistant Staphylococcus aureus)","MRSA is an infection is caused by a strain of staph bacteria that's become resistant to the antibiotics commonly used to treat ordinary staph infections.", symptons));
        symptons.clear();
        symptons.add(symptonShit);
        data.add(new BEIllness("Gonorrhea","Gonorrhoea is a common sexually transmitted infection caused by the bacterium Neisseria gonorrhoeae.", symptons));
        return data;
    }
}
