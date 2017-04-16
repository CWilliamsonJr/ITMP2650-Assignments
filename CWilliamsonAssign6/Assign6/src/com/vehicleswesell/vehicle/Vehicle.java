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
public abstract class Vehicle
{
    private int wheels;
    protected int price;
    private String powerSource;
    
    public Vehicle(String powerSource, int wheels)
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }
    

    public String getPowerSource()
    {
        return powerSource;
    }

    public void setPowerSource(String source)
    {
        this.powerSource = source;
    }

    public int getWheels()
    {
        return wheels;
    }

    public void setWheels(int wls)
    {
        this.wheels = wls;
    }

    public int getPrice()
    {
        return price;
    }

    public abstract void setPrice();  
   
}
