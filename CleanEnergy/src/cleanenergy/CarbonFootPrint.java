/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import java.io.Serializable;

/**
 *
 * @author jordancarthy
 */
public abstract class CarbonFootPrint implements Serializable {
    protected String type;
    protected double value;

    public CarbonFootPrint(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public CarbonFootPrint() {
    }
  

    public String getType() {
        return type;
    }

    public void setUserName(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setCarbonFootTotal(double value) {
        this.value = value;
    }

    public abstract double computeCarbonFoot();
    
    
    public String toString(){
        return "Type of CarbonFootPrint " + type + "\nCarbonFoot Total :" + value;
    }
}
