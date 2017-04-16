/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import com.vehicleswesell.vehicle.Vehicle;
import com.vehicleswesell.vehicle.Sailboat;
import com.vehicleswesell.vehicle.Bicycle;
/**
 *
 * @author Clarence
 */
public class InsuredCar extends Vehicle implements Insured
{
    private int coverage;
    
    public InsuredCar()
    {
        super("gas", 4);
        setCoverage();
    }
    
    public void setPrice()
    {
        String entry;
        final int MAX = 60000;
        
        entry = JOptionPane.showInputDialog(null, "Enter care price");
        price = Integer.parseInt(entry);
        if(price > MAX) price = MAX;       
    }
    
    public void setCoverage()
    {
        coverage = (int)(price * 0.9);
    }
    
    public int getCoverage()
    {
        return coverage;
    }
    
    public String toString()
    {
        return("The insured car is powered by " + getPowerSource() + "; it has "
                + getWheels() + " Wheels, costs $" 
                + getPrice() + " and is insured for $" + getCoverage());
    }
}
