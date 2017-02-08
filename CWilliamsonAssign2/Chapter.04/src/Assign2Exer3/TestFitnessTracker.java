/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign2Exer3;

/**
 *
 * @author Clarence
 */
public class TestFitnessTracker {
    public static void main(String[] args){
        
        DisplayAssigmentInfo(2, "Feburary 8, 2017", 4, 3);
        
        FitnessTracker tracker = new FitnessTracker();
        
        System.out.println("Test of no parameter constructor using the get methods (part A)");
        System.out.println(tracker.getActivity() +" "+ tracker.getMinutes() +" minutes" + " on " + tracker.getDate());
        
        System.out.print("\n");
        
        System.out.println("Test with parameter constructor using the get methods (part B)");
        FitnessTracker tracker2 = new FitnessTracker("Biking",25,"2017-02-05");
        System.out.println(tracker2.getActivity() +" "+ tracker2.getMinutes() +" minutes" + " on " + tracker2.getDate());
        
        
    }
    /**
     * 
     * @param assignmentNum
     * @param dueDate
     * @param chapterNum
     * @param exNum 
     */
    public static void DisplayAssigmentInfo(int assignmentNum, String dueDate,int chapterNum, int exNum){
         System.out.println("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
         System.out.print("Assignment# " + assignmentNum );
         System.out.print(" Chapter: " + chapterNum + " Exercise: " +  exNum);
         System.out.print(" Due: "+ dueDate);
         System.out.print("\n\n");
    }
}
