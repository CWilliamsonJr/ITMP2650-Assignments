/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.Month;


/**
 *
 * @author Clarence
 */
public class Magazine extends Publication
{

    /**
     * makes a magazine object that sets the private properties.
     * @param month
     * @param title
     * @param cost
     * @param quantity 
     */
    public Magazine(Month month, String title, double cost, int quantity)
    {
        super(title, cost, quantity);
        this._month = month;
    }
    private Month _month;

  
    /**
     * getter for the month
     * @return 
     */
    public String getMonth()
    {
        return _month.toString();
    }
    
    /**
     * Setter for the month
     * @param month 
     */
    public void setMonth(Month month)
    {
        this._month = month;
    }

    /**
     * returns the price of the magazine
     * @return 
     */
    @Override
    public double getPrice()
    {
        return getCost() * 1.6;
    }
    
    @Override
    public String toString()
    {
        return "\nPublication Type: Magazine Title: " + getTitle() 
                + "Publication Month: " + getMonth()
                + " Quanity: " + getQuantity() + " Price: $" + getPrice() 
                + " at $" + getCost() + " per Book.\n"  ;
    }
}
