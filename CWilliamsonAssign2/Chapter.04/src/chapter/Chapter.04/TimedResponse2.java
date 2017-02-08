//package chapter.pkg04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package chapter.pkg04;

/**
 *
 * @author Clarence
 */
import javax.swing.JOptionPane;
import java.time.*;
import java.util.concurrent.*;

public class TimedResponse2 {
    public static void main(String[] args){
        LocalDateTime time1, time2;
        int seconds1, seconds2,minute1,minute2;
        Duration difference;
        
        
        
        time1 = LocalDateTime.now();
        minute1 = time1.getMinute();
        seconds1 = time1.getSecond();
        //total1 = (minute1 * 60) + seconds1; 
        
        JOptionPane.showConfirmDialog(null,"Is stealing ever justified? ");
        
        time2 = LocalDateTime.now();
        minute2 = time2.getMinute();
        seconds2 = time2.getSecond();
        //total2 = (minute1 * 60) + seconds2; 
        
        difference = Duration.between(time1, time2);
        
        //difference = total2 - total1 ;       
        
        
        JOptionPane.showMessageDialog(null, "End time: "+ minute2 +":" + seconds2 + "\nStart time: " + minute1 + ":" + seconds1 + "\nIt took " + difference.getSeconds() + " seconds for you to answer");
    }
}
