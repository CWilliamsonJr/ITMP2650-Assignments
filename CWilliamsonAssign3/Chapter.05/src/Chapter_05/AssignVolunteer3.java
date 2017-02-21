/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Chapter_05;
import java.util.Scanner;
/**
 *
 * @author Clarence
 */
public class AssignVolunteer3 
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        
        Scanner input = new Scanner(System.in);
        System.out.println("what type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anythign else...");
        donationType = input.nextInt();
        
        if(donationType == CLOTHING_CODE || donationType == OTHER_CODE)
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing doantion";
        }
        
        if(donationType >= 3)
        {
            volunteer = "invalid";
            message = "a invaild doation type";
        }
            
        System.out.println("You enter " + donationType);
        System.out.println("THis is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
