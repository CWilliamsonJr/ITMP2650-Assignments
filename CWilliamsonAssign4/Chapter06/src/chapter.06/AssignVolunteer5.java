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
public class AssignVolunteer5 
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        
        Scanner input = new Scanner(System.in);
        System.out.println("what type of donation is this?");
        System.out.print("Enter an integer... ");
        donationType = input.nextInt();
        
        while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
        { 
            System.out.println("You entered " + donationType + " which is not a valid donation type");
            System.out.print("Please enter a value between " + CLOTHING_CODE + " and " + OTHER_CODE + "... "); 
            System.out.print("Enter an integer... "); donationType = input.nextInt(); 
        }
        
        switch(donationType)
        {
            case(CLOTHING_CODE):
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case(FURNITURE_CODE):
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case(ELECTRONICS_CODE):
                volunteer = ELECTRONICS_PRICER;
                message = "an electroncis donation";
                break;
            case(OTHER_CODE):
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }
            
        System.out.println("You enter " + donationType);
        System.out.println("THis is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
