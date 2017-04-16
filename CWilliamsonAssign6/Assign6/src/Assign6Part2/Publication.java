/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public abstract class Publication
{
    private String _title;
    private double _cost;
    private int _quantity;

    /***3
     * Makes an object required title price and quantity
     * @param title
     * @param cost
     * @param quantity 
     */
    public Publication(String title, double cost, int quantity)
    {
        this._title = title;
        this._cost = cost;
        this._quantity = quantity;
    }   
    
    /**
     * Getter for the title
     * @return 
     */
    public String getTitle()
    {
        return _title;
    }

    /**
     * Setter for the title
     * @param title 
     */
    public void setTitle(String title)
    {
        this._title = title;
    }

    /**
     * abstract getter for the price
     * @return 
     */
    public abstract double getPrice();

    /**
     * setter for the cost
     * @param cost 
     */
    public void setCost(double cost)
    {
        this._cost = cost;
    }
    
    /**
     * getter for the cost
     * @return 
     */
    public double getCost()
    {
        return _cost;
    }

    /**
     * getter for the quantity
     * @return 
     */
    public int getQuantity()
    {
        return _quantity;
    }

    /**
     * setter for the quantity
     * @param quantity 
     */
    public void setQuantity(int quantity)
    {
        this._quantity = quantity;
    }
    
}
