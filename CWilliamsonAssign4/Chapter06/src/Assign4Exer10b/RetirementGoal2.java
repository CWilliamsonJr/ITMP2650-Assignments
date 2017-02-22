/*
 * Name: Clarence Williamson
 * Date: 2/22/17
 * Course: IT: 2650
 * Assignment #: 4
 * 
 */

import javax.swing.*;
import java.text.*;
/**
 *
 * @author ClevelandCodes
 */
public class RetirementGoal2
{
    public static void main (String[] args)
    {
        int yearsTilRetirement; // holds years till retirement as in
        double interestRate; // holds interest rate 
        long savingsPerYear; // holds the amount to save
        String retirementInfo; // holds the information about retirment
        
        DisplayAssigmentInfo2(4, "Feb. 22, 2017", 6, 10); // displays assignment info
        
        yearsTilRetirement = GetYearsTilRetirement(); // gets the years till retirement from users
        interestRate = GetInterestRate(); // gets interest rate from users
        savingsPerYear = GetSavingsPerYear(); // gets savings per year from user;
        retirementInfo = CalculateRetirement(yearsTilRetirement, interestRate, savingsPerYear);
        JOptionPane.showMessageDialog(null, retirementInfo);
        
    }
    /**
     * Calculates the Savings for retirement based on user input
     * @param years
     * @param intRate
     * @param savings
     * @return 
     */
    public static String CalculateRetirement( int years, double intRate, long savings)
    {
         
        String percentage = (intRate * 100) + "%";
        String retirementInfo = "If you save " + savings + " each year for " + years 
                + " years with " + percentage + " Interest       Without Interest" ;
        double compoundSavings = 0;
        double regularSavings = 0;
        DecimalFormat df = new DecimalFormat("#,###,###.00");
        
        for(int i  = 1; i <= years; i++)
        {
            regularSavings += savings;
            compoundSavings += savings;
            compoundSavings = ( compoundSavings * intRate) + compoundSavings;
            
            retirementInfo += "\nAfter year " + i + ": $" + df.format(compoundSavings) + "       $" + regularSavings;
        } 
        return retirementInfo;
    }
    
    
    /**
     * Gets years till retirement, keeps asking if value less than zero
     * @return 
     */
    public static int GetYearsTilRetirement()
    {       
        String numYears;
        int years;
        do
        {
            numYears = JOptionPane.showInputDialog(null,"Please enter Years till Retirment ");
            years = Integer.parseInt(numYears);            
        }while(years <= 0);
        
        return years;
    }
    
    /**
     * Gets interest rate from users as double
     * @return 
     */
    public static double GetInterestRate()
    {
        double rate;
        String interest;
        interest = JOptionPane.showInputDialog(null,"Please enter in interest rate(as decimal)");
        return rate = Double.parseDouble(interest);       
    }    
    
    /**
     * Gets the amount the user can save per year
     * @return 
     */
    public static long GetSavingsPerYear()
    {
        long savings;
        String amtToSave;
        
        amtToSave = JOptionPane.showInputDialog(null,"How much can you save annually");
        
        return savings = Long.parseLong(amtToSave);        
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
}
