/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicleswesell.vehicle;


/**
 *
 * @author Clarence
 */
import javax.swing.*;

public class Bicycle extends Vehicle
{
    public Bicycle()
    {
        super("a person",2);
    }
    
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null,"Enter bicycle price ");
        price = Integer.parseInt(entry);
        if(price > MAX) price = MAX;             
    }
    
    @Override
    public String toString()
    {
        return("The bicycle is powered by " + getPowerSource() + "; it has " +  getWheels() + " wheels and costs $" + getPrice());
    }
}

