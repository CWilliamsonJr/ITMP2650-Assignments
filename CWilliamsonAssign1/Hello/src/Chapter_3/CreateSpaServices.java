/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */
import java.util.Scanner;

/**
 *
 * @author Clarence
 */
public class CreateSpaServices {
    public static void main(String[] args){
        
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        /*
        //<editor-fold defaultstate="collapsed" desc="comment">
        String service;
        double price;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        
        
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
        //*/
        
//</editor-fold>

        firstService = getData(firstService);
        secondService = getData(secondService);
        
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
        
        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
               
    }
    /**
     * 
     * @param s spa service object
     * @return - returns a spa service object with data fields set.
     */
    public static SpaService getData(SpaService s){
        String service; // name of spa service
        double price;  // price of spa service
        Scanner keyboard = new Scanner(System.in); // used to get input from keyboard.
        
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        
        s.setServiceDescription(service); // sets the name of the spa service
        s.setPrice(price); // sets the price of the spa service.
        
        keyboard.nextLine();
        
        return s;
    }
}
