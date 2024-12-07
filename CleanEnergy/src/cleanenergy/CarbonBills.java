/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;



/**
 *
 * @author jordancarthy
 */
public class CarbonBills extends CarbonFootPrint {
    private double electricBill;
    private double gasBill;
    private double oilBill;
// Overloaded Constructor
    public CarbonBills(String type, double value,double electricBill, double gasBill, double oilBill ) {
        super(type, value);
        this.electricBill = electricBill;
        this.gasBill = gasBill;
        this.oilBill = oilBill;
        
    }

    public double getElectricalBill() {
        return electricBill;
    }

    public void setElectricalBill(double electricBill) {
        this.electricBill = electricBill;
    }

    public double getGasBill() {
        return gasBill;
    }

    public void setGasBill(double gasBill) {
        this.gasBill = gasBill;
    }

    public double getOilBill() {
        return oilBill;
    }

    public void setOilBill(double oilBill) {
        this.oilBill = oilBill;
    }
    @Override
//    Abstract method 
    public double computeCarbonFoot(){
        return value = ((electricBill * 105)+ (gasBill * 105) + (oilBill *103));
    }
    public String toString(){
        return super.toString() ;
    }
    
}
