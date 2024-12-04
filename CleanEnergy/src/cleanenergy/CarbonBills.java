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
    private double billsTotal[]; // Putting all bills in a double array
// Overloaded Constructor
    public CarbonBills(String type, double value,double electricBill, double gasBill, double oilBill ) {
        super(type, value);
        this.electricBill = electricBill;
        this.gasBill = gasBill;
        this.oilBill = oilBill;
        billsTotal = new double[] {electricBill,gasBill,oilBill};
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
        return value = ((billsTotal[0] * 105)+ (billsTotal[1] * 105) + (billsTotal[2]*103));
    }
    public String toString(){
        return super.toString() ;
    }
    
}
