/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acmeinc;

import java.util.ArrayList;


public class IllnessData {
    
    public ArrayList<BEIllness> getIllness(){
        ArrayList<BEIllness> data = new ArrayList<>();
        data.add(new BEIllness("Flu (Influenza)","The flu is an infectious disease caused by the influenza virus. Symptoms can be mild to severe. The most common symptoms include: a high fever, runny nose, sore throat, muscle pains, headache, coughing, and feeling tired. "));
        data.add(new BEIllness("MRSA (Methicillin-resistant Staphylococcus aureus)","MRSA is an infection is caused by a strain of staph bacteria that's become resistant to the antibiotics commonly used to treat ordinary staph infections."));
        data.add(new BEIllness("Gonorrhea","Gonorrhoea is a common sexually transmitted infection caused by the bacterium Neisseria gonorrhoeae."));
        return data;
    }
}
