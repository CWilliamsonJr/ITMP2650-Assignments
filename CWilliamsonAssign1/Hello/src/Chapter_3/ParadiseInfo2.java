//package Chapter_3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ClevelandCodes
 */
public class ParadiseInfo2 {
    public static void main(String[] args){
        
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();
        
        DisplayInfo();        
        savings = computeDiscountInfo(price,discount);
        
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of a least $" + savings);
    }
    
    public static double computeDiscountInfo(double pr, double dscnt){
        double savings;
        
        savings = pr * dscnt / 100;
        return savings;
    }
    
    public static void DisplayInfo(){
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}
