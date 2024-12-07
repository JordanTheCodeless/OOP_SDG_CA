/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cleanenergy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jordancarthy
 */
public class CarbonUser implements Serializable{
    private String userName;
    private ArrayList<CarbonFootPrint> userCarbonFootprint;
    private double carbonFootTotal;
    public CarbonUser(String userName){
        this.userName =  userName;
        userCarbonFootprint = new ArrayList <>();
        this.userCarbonFootprint = userCarbonFootprint;
    }
    public String getUserName(){
        return ("UserName : " + userName);
    }

    public ArrayList<CarbonFootPrint> getUserCarbonFootprint() {
        return userCarbonFootprint;
    }
    public void addFootprint(CarbonFootPrint print){
        userCarbonFootprint.add(print);
    }
    public Double computeTheUsersFootprint(){
        for(CarbonFootPrint prints : userCarbonFootprint){
            carbonFootTotal += prints.value;
        }
       return carbonFootTotal;
    }
}
