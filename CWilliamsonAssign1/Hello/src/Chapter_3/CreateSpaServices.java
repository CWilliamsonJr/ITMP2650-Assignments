/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public static SpaService getData(SpaService s){
        String service;
        double price;        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        
        s.setServiceDescription(service);
        s.setPrice(price);
        
        keyboard.nextLine();
        
        return s;
    }
}
