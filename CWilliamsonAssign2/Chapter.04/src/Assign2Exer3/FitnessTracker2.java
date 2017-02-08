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
public class FitnessTracker2 {
    String Activity;
    int Minutes;
    LocalDate Date;
    
    public FitnessTracker2(){
        /*
        Activity = "running";
        Minutes = 0;        
        Date = LocalDate.of(2017,1,1); 
        //*/
        this("running",0,"2017-01-01");
    }
    
    public FitnessTracker2(String activity,int minutes, String date){
        Activity = activity;
        Minutes = minutes;        
        Date = LocalDate.parse(date);
        
    }
    
    public String getActivity(){
        return Activity;
    }
    
    public int getMinutes(){
        return Minutes;
    }
    
    public String getDate(){
        return Date.toString();
    }
}
