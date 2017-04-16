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
public class PublicationArray
{
    public static void main(String[] args)
    {
        DisplayAssigmentInfo(6, "March 29, 2017");
        
        /**
         * Makes an Array of type Publication with 10 objects
         */
        Publication[] readingCollection = new Publication[]
        {
            new Book("American Fisherman", 2.0, 100),
            new Book("C++ Programming", 25.0, 70),
            new Magazine(Month.AUGUST, "Time", 1.5, 100),
            new Book("Morning Dove", 15.0, 39),
            new Magazine(Month.MARCH, "Nerd", 3.0, 10),
            new Book("Walking and Chewing Bum for Dummies", 14.0, 40),
            new Magazine(Month.MARCH, "The New Yorker", 2.25, 28),
            new Book("J++ Programming", 30.0, 55),
            new Magazine(Month.MARCH, "Devorced", 1.75, 33),
            new Book("Doing Nothing for Dummies", 10.0, 10)            
        };
        
        /**
         * Prints info about each publication to the screen.
         */
        for (Publication reading : readingCollection)
        {
            System.out.println(reading);
        }
    }
    
    public static void DisplayAssigmentInfo(int assignmentNum, String dueDate){
         System.out.println("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
         System.out.print("Assignment# " + assignmentNum );       
         System.out.print(" Due: "+ dueDate);
         System.out.print("\n\n");
    }
}
