/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

/**
 *
 * @author jordancarthy
 */
public class CarbonRecycle extends CarbonFootprint{
    private int carbonAlum;
    private int carbonNewsPaper;
    
    public CarbonRecycle(int carbonAlum, int carbonNewsPaper, double carbonFootTotal) {
        super(carbonFootTotal);
        this.carbonAlum = carbonAlum;
        this.carbonNewsPaper = carbonNewsPaper;
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

    public int getCarbonAlum() {
        return carbonAlum;
    }

    public void setCarbonAlum(int carbonAlum) {
        this.carbonAlum = carbonAlum;
    }

    public int getCarbonNewsPaper() {
        return carbonNewsPaper;
    }

    public void setCarbonNewsPaper(int carbonNewsPaper) {
        this.carbonNewsPaper = carbonNewsPaper;
    }
    public double carbonFootCalc(){
        return carbonFootTotal += carbonNewsPaper + carbonAlum;
    }

    

}
