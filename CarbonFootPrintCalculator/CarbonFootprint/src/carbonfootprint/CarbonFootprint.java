/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprint;

/**
 *
 * @author jordancarthy
 */
public abstract class CarbonFootprint {
    protected double carbonFootTotal;
    public CarbonFootprint(double carbonFootTotal){
        this.carbonFootTotal = carbonFootTotal;
        
    }

    public double getCarbonFootTotal() {
        return carbonFootTotal;
    }

    public void setCarbonFootTotal(double carbonFootTotal) {
        this.carbonFootTotal = carbonFootTotal;
    }
    public abstract double carbonFootCalc();
}

