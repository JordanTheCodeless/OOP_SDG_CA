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
// Making my parent class abstract and implememnting Serializable
public abstract class CarbonFootPrint implements Serializable {
    protected String type;
    protected double value;
// Constructor
    public CarbonFootPrint(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public CarbonFootPrint() {
    }
  

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setCarbonFootTotal(double value) {
        this.value = value;
    }
//    Abstract method ensuring all classes that extend will use
    public abstract double computeCarbonFoot();
    
//    This will be the standard toString method for all subclasses 
    public String toString(){
        return "CarbonFootPrint type : " + type + "\nCarbonFoot Total : " + value;
    }
}
