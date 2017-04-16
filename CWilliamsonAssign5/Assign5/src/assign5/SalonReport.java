/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
import java.util.Collections;

/**
 *
 * @author Clarence
 */
public class SalonReport
{
    public static void main(String[] args)
    {
         ArrayList<Service> salonServices = new ArrayList<Service>(); // holds the collection of salon services
         String input;
         
         salonServices.add(new Service("Cut",8.00,15));
         salonServices.add(new Service("Shampoo",4.00,10));
         salonServices.add(new Service("Manicure",18.00,30));
         salonServices.add(new Service("Style",48.00,55));
         salonServices.add(new Service("Permanent",18.00,35));
         salonServices.add(new Service("Trim",6.00,5));
         
         DisplayAssigmentInfo2(5, "March 6,2017"); // displays assignment info
         
         input = JOptionPane.showInputDialog(null, "Sort services by (S)ervice, (P)rice, or (T)ime or (Q)uit").substring(0,1).toUpperCase();
         
         while(!input.equals("Q")) // determines which sort order to show.
         {
             switch(input)
             {
                case "S":
                     ShowSortByDescription(salonServices);
                     break;
                case "P":
                    ShowSortByPrice(salonServices);
                    break;
                case "T":
                    ShowSortByTime(salonServices);
                    break;
                case "Q":
                    System.exit(0);
                    break;
                    
             }
             
             input = JOptionPane.showInputDialog(null, "Sort services by (S)ervice, (P)rice, or (T)ime or (Q)uit").substring(0,1).toUpperCase();
         }
    
    }
    /**
     * Implements a lambda comparator to sort the list by description
     * @param service 
     */
    public static void ShowSortByDescription(ArrayList<Service> service)
    {
        String print = "";
        
        service.sort((s1,s2) -> s1.getDescription().compareTo(s2.getDescription())); // sorts the list based on description.                                                                   
        
        for (Service s : service)
        {
            print += s.getDescription()+ " $" + s.getPrice()+ " " + s.getTime() + " minutes" + "\n";
        }
        
        JOptionPane.showMessageDialog(null, print);
    }
    
    /**
     * Implements a lambda comparator to sort the list by price
     * @param service 
     */
    public static void ShowSortByPrice(ArrayList<Service> service)
    {
        String print = "";
        
        service.sort((s1,s2) -> s1.getPrice().compareTo(s2.getPrice())); // sorts the list based on price
        
        for (Service s : service)
        {
            print += s.getDescription()+ " $" + s.getPrice()+ " " + s.getTime() + " minutes" + "\n";
        }
        
        JOptionPane.showMessageDialog(null, print);
    }
    
    /**
     * Implements a lambda comparator to sort the list by Time
     * @param service 
     */
    public static void ShowSortByTime(ArrayList<Service> service)
    {
        String print = "";
        
        service.sort((s1,s2) -> s1.getTime().compareTo(s2.getTime())); // sorts the list based on time
        
        for (Service s : service)
        {
            print += s.getDescription()+ " $" + s.getPrice()+ " " + s.getTime() + " minutes" + "\n";
        }
        
        JOptionPane.showMessageDialog(null, print);
    }
    
    public static void DisplayAssigmentInfo2(int assignmentNum, String dueDate){
        String assignInfo;
        assignInfo = ("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
        assignInfo += ("\nAssignment# " + assignmentNum );        
        assignInfo +=("\n Due: "+ dueDate);
        assignInfo += ("\n\n");
         
        JOptionPane.showMessageDialog(null, assignInfo);
    }
}
