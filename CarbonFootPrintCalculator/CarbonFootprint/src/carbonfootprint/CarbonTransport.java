/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprint;

/**
 *
 * @author jordancarthy
 */
public class CarbonTransport extends CarbonFootprint {
   private int flightLessFour;
   private int flightMoreFour;
   private int carYearlyMileage;
   
     public CarbonTransport(int flightLessFour, int flightMoreFour, int carYearlyMileage, double carbonFootTotal) {
        super(carbonFootTotal);
        this.flightLessFour = flightLessFour;
        this.flightMoreFour = flightMoreFour;
        this.carYearlyMileage = carYearlyMileage;
    }
     



    public int getFlightLessFour() {
        return flightLessFour;
    }

    public void setFlightLessFour(int flightLessFour) {
        this.flightLessFour = flightLessFour;
    }

    public int getFlightMoreFour() {
        return flightMoreFour;
    }

    public void setFlightMoreFour(int flightMoreFour) {
        this.flightMoreFour = flightMoreFour;
    }

    public int getCarYearlyMileage() {
        return carYearlyMileage;
    }

    public void setCarYearlyMileage(int carYearlyMileage) {
        this.carYearlyMileage = carYearlyMileage;
    }

    public double carbonFootCalc(){
        return carbonFootTotal += ((carYearlyMileage * 0.79) + (flightLessFour * 1100) + (flightMoreFour * 4400));
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
    
    
}
