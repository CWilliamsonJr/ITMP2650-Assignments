/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Clarence Williamson
 */
public class ParadiseInfo2 {
    public static void main(String[] args){
        
        double price; // price of discount cutoff
        double discount; // discount amount
        double savings; // total possible savings.
        Scanner keyboard = new Scanner(System.in); // input object to get needed info.
        
        System.out.print("enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();
        
        DisplayInfo(); // shows spa message.        
        savings = computeDiscountInfo(price,discount);
        
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of a least $" + savings);
    }
    /**
     * calculates the discount for spa services.
     * @param pr - price cutoff of the service discount
     * @param dscnt - discount amount
     * @return - returns savings amount.
     */
    public static double computeDiscountInfo(double pr, double dscnt){
        double savings;
        
        savings = pr * dscnt / 100; // cacluates the savings discount
        return savings;
    }
    /**
     * Displays the spa welcome message.
     */
    public static void DisplayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}
