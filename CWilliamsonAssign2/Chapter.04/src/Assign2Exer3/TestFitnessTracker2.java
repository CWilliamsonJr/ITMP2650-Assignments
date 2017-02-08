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
public class TestFitnessTracker2 {
    public static void main(String[] args){
        
        DisplayAssigmentInfo(2, "Feburary 8, 2017", 4, 3);
        
        FitnessTracker2 tracker = new FitnessTracker2();
        
        System.out.println("Test of no parameter constructor using the get methods (part C)");
        System.out.println(tracker.getActivity() +" "+ tracker.getMinutes() +" minutes" + " on " + tracker.getDate());
        
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
