/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */
//package Chapter_3;

/**
 * 
 * 
 * 
 * @author ClevelandCodes
 */
public class ShowStudent {
    public static void main(String[] args){
        DisplayAssigmentInfo(1, "Feb 1, 2017", 3, 12); // displays assignment info
        
        Student student = new Student(); // makes a new student object
        student.SetStudentID(234); // sets student ID
        student.SetPointsEarned(65); // sets points earned for the student
        student.SetCreditsEarned(18); // sets credits earned for the student
        
        // Prints out student information.
        System.out.println("Student ID: " + student.GetStudentID());
        System.out.println("Student G.P.A is " + student.CalcGPA());
        System.out.println("Grade Points Earned:" + student.GetPointsEarned());
        System.out.println("Credits Earned: " + student.GetCreditsEarned());
        
    }
   /**
    * Displays information about the assignment. Takes four arguments 
    * @param assignmentNum: assignment number as @int
    * @param dueDate: Due date for current assignment as String
    * @param chapterNum: chapter number of the assignment as @int
    * @param exNum: exercise in the chapter for the assignment  as @int 
    */
    public static void DisplayAssigmentInfo(int assignmentNum, String dueDate,int chapterNum, int exNum){
         System.out.println("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
         System.out.print("Assignment# " + assignmentNum );
         System.out.print(" Chapter: " + chapterNum + " Exercise: " +  exNum);
         System.out.print(" Due: "+ dueDate);
         System.out.print("\n\n");
    }
}

/*
public class Student {
    private int numberID;
    private double creditsEarned;
    private int pointsEarned;

    public int GetStudentID(){
     return numberID;   
    }
    
    public void SetStudentID(int id){
      numberID = id;   
    }
    
    public double GetCreditsEarned(){
        return creditsEarned;
    }
    
    public void SetCreditsEarned(int credits){
        creditsEarned = credits;
    }
    
    public int GetPointsEarned(){
        return pointsEarned;
    }
    
    public void SetPointsEarned(int points){
        pointsEarned = points;
    }
    
    public double CalcGPA(){
        return pointsEarned / creditsEarned;
    }
}
//*/