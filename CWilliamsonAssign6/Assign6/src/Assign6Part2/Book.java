/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Clarence
 */
public class Book extends Publication
{

    /**
     * Makes a book object initialing title, price, and quantity 
     * @param title
     * @param cost
     * @param quantity 
     */
    public Book(String title, double cost, int quantity)
    {
        super(title, cost, quantity);
    }

    @Override
    public double getPrice()
    {
        double cost = getCost() * getQuantity();
        
        if(getQuantity() > 50)
        {
            cost = cost * 1.4 - 5 ;
        }
        
        return cost;
    }

    @Override
    public String toString()
    {
        return "\nPublication Type: Book Title: " + getTitle()  
                + " Quanity: " + getQuantity() + " Price: $" + getPrice() 
                + " at $" + getCost() + " per Book.\n"  ;
    }
    
    
}
