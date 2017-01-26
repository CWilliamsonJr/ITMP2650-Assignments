package Chapter_2;

/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * Prints Hello World
 */

/**
 *
 * @author ClevelandCodes
 */
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        int minutes; // contains the minutes that the user entered
        double days; // holds the mintue conversion to days
        double hours; // hold the mintue conversion to hours
        final int hoursInDay = 24; //const for hours in a day
        final double minutesInHour = 60; // const for minutes in an hour
        
        Scanner input = new Scanner(System.in); // makes a new object for getting user input
        
        DisplayAssigmentInfo(1, "Feb 1, 2017", 2, 11); //displays assignment info
        
        System.out.println("Please Enter in minutes >>");
        minutes  = input.nextInt(); //gets user input as an int
        
        hours = minutes / minutesInHour; // converst mintues into hours
        days = hours / hoursInDay; // converts hours into days.
        
        // prints the results.
        System.out.println(minutes + " minutes is equal to " +  hours + " hours or " + days + " days");
    }
    
    /**
    * Displays information about the assignment. Takes four arguments 
    * @param assignmentNum: assignment number as @int
    * @param dueDate: Due date for current assignment as String
    * @param chapterNum: chapter number of the assignment as @int
    * @param exNum: exercise in the chapter for the assignment  as @int 
    */
    public static void DisplayAssigmentInfo(int assignmentNum, String dueDate,int chapterNum, int exNum){
         System.out.println("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
         System.out.print("Assignment# " + assignmentNum );
         System.out.print(" Chapter: " + chapterNum + " Exercise: " +  exNum);
         System.out.print(" Due: "+ dueDate);
         System.out.print("\n\n");
    }
}
