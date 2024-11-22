/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

/**
 *
 * @author jordancarthy
 */
public class CarbonBills extends CarbonFootprint{
    private double electricBill;
    private double gasBill;
    private double oilBill;

    public CarbonBills(double electricBill, double gasBill, double oilBill, double carbonFootTotal) {
        super(carbonFootTotal);
        this.electricBill = electricBill;
        this.gasBill = gasBill;
        this.oilBill = oilBill;
    }

    public double getElectricBill() {
        return electricBill;
    }

    public double getGasBill() {
        return gasBill;
    }

    public double getOilBill() {
        return oilBill;
    }
    @Override
    public double carbonFootCalc(){
        return carbonFootTotal += ((electricBill * 105)+ (gasBill * 105) + (oilBill*103));
    }

    

    
}


//    Multiply your monthly electric bill by 105
//    Multiply your monthly gas bill by 105
//    Multiply your monthly oil bill by 113
//    Multiply your total yearly mileage on your car by .79
//    Multiply the number of flights you’ve taken in the past year (4 hours or less) by 1,100
//    Multiply the number of flights you’ve taken in the past year (4 hours or more) by 4,400
//    Add 184 if you do NOT recycle newspaper
//    Add 166 if you do NOT recycle aluminum and tin
//    Add 1-8 together for your total carbon footprint
