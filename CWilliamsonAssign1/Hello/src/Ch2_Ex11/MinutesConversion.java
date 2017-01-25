package Ch2_Ex11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ClevelandCodes
 */
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args){
        int minutes;
        double days, hours;
        final int hoursInDay = 24;
        final int minutesInHour = 60;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter in minutes >>");
        minutes  = input.nextInt();
        
        hours = minutes / minutesInHour;
        days = hours / hoursInDay;
        
        System.out.println(minutes + " minutes is equal to " +  hours + " hours or " + days + " days");
    }
}
