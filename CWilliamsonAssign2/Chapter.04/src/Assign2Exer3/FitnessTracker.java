/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign2Exer3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
/**
 *
 * @author Clarence
 */
public class FitnessTracker {
    String Activity; //stores the activity name
    int Minutes; // stores the time length of the activity 
    LocalDate Date; // holds the date completed  
    
    public FitnessTracker(){ // sets the activity info with default information
        Activity = "running"; 
        Minutes = 0;       
        Date = LocalDate.of(2017,1,1);      
    }
    
    public FitnessTracker(String activity,int minutes, String date){ // sets the activity info with custom information
        Activity = activity;
        Minutes = minutes;        
        Date = LocalDate.parse(date);
        
    }
    
    public String getActivity(){ // returns the activity name
        return Activity;
    }
    
    public int getMinutes(){  // returns the time of the activity
        return Minutes;
    }
    
    public String getDate(){  // returns the date of the activity
        return Date.toString();
    }
}
