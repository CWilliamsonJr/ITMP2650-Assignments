/*
 * Name: Clarence Williamson
 * Date: 2/13/17
 * Course: IT: 2650
 * Assignment #: 3
 * 
 */

/**
 *
 * @author Clarence
 */
import javax.swing.JOptionPane;
public class CellPhoneService
{
    public static void main(String[] args)
    {
        String minutes;// holds the minutes needed for the plan 
        String textMessages;// holds the amount of text messages needed for the plan
        String data; // holds the amount of gigabytes needed for the plan
        String cellPhonePlan; // holds the return string for the plan selected.
        
        DisplayAssigmentInfo2(3, "Feb 15, 2017", 5, 4); // display information about the assignment 
        
        minutes = JOptionPane.showInputDialog("Enter talk minutes needed");
        textMessages = JOptionPane.showInputDialog("Enter text messages needed");
        data = JOptionPane.showInputDialog("Enter gigabytes of data needed");
        
        cellPhonePlan = GetPhonePlan(minutes, textMessages, data);
        
        JOptionPane.showMessageDialog(null,cellPhonePlan); // prints the plan to the screen
        
                
    }   
    public static void DisplayAssigmentInfo2(int assignmentNum, String dueDate,int chapterNum, int exNum){
        String assignInfo;
        assignInfo = ("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
        assignInfo += ("\nAssignment# " + assignmentNum );
        assignInfo += ("\n Chapter: " + chapterNum + " Exercise: " +  exNum);
        assignInfo +=("\n Due: "+ dueDate);
        assignInfo += ("\n\n");
         
        JOptionPane.showMessageDialog(null, assignInfo);
    }
    
    public static String GetPhonePlan(String minutes, String textMessages, String data)
    {
        int minutesNum = Integer.parseInt(minutes);
        int textMessageNum = Integer.parseInt(textMessages);
        double dataNum = Double.parseDouble(data);
        String cellPhonePlan = "";
        
        if(minutesNum < 500) // chooses a plan if less than 500 mintues is needed
        {
            if(dataNum == 0 && textMessageNum == 0) // selects plan A if no data or text is needed.
            {
                cellPhonePlan = "Plan A at $49 per Month";                
            }else if(textMessageNum > 0 && dataNum == 0) // selects plan B if text is needed.
            {
                cellPhonePlan = "Plan B at $55 per Month";
            }else if(dataNum > 0)
            {
                cellPhonePlan = GetDataPlan(dataNum); // returns cellphone plan that has data
            }
        }
        else // chooses a plan if more than 500 minutes is needed
        {
            if(textMessageNum < 100 && dataNum == 0) // selects plan B if more than 500 minutes is needed with 100 or less text messages
            {
                cellPhonePlan = "Plan C at $61 per Month";
            }else if(textMessageNum >= 100 && dataNum == 0)
            {
                cellPhonePlan = "Plan C at $70 per Month";
            }else if(dataNum > 0)
            {
                cellPhonePlan = GetDataPlan(dataNum); // returns cellphone plan that has data
            }
        }
       return cellPhonePlan; // returns choosen plan
    }
    
    public static String GetDataPlan(double dataNum)
    {
        if(dataNum < 2.0) // chooses plan based on number of gigs entered
        {
            return "Pland E at 79 per Month";
        }else
        {
            return "Plan F at $87 per Month";
        }       
    }
}
