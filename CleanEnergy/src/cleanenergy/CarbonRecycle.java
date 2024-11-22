/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import cleanenergy.CarbonFootPrint;

/**
 *
 * @author jordancarthy
 */
public class CarbonRecycle extends CarbonFootPrint {
    // Final variables for aluminum and newspaper carbon footprints
    private final int ALUMINIUM = 166;
    private final int NEWSPAPER = 184;
    private boolean aluminiumRecycled;
    private boolean newspaperRecycled;

    public CarbonRecycle(String type, double value, boolean aluminiumRecycled, boolean newspaperRecycled) {
        super(type, value);
        this.newspaperRecycled = newspaperRecycled;
        this.aluminiumRecycled = aluminiumRecycled;
    }

    public void setAluminiumRecycled(boolean aluminiumRecycled) {
        this.aluminiumRecycled = aluminiumRecycled;
    }

    public void setNewspaperRecycled(boolean newspaperRecycled) {
        this.newspaperRecycled = newspaperRecycled;
    }

    public boolean getAluminumBool() {
        return aluminiumRecycled;
    }

    public boolean getNewspaperBool() {
        return newspaperRecycled;
    }

    @Override
    public double computeCarbonFoot() {
         value = 0;
        if(!aluminiumRecycled){
            value += ALUMINIUM;
            
        }
        if(!newspaperRecycled){
            value += NEWSPAPER;
           
        }
        return value;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }
}

    


    

