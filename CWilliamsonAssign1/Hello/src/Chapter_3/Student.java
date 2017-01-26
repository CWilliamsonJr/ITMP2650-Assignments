/**
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * Prints Hello World
 */
//package Chapter_3;


public class Student {
   
    private int numberID; // stores the ID number for the student
    private double creditsEarned; // stores current amount of credits earned for the student
    private int pointsEarned; // stores the current amount of points earned for the student.
    
    /**
     * 
     * @return studentID
     */
    public int GetStudentID(){
     return numberID;   
    }
    
    /**
     * 
     * @param id: takes a number to set for student ID
     */
    public void SetStudentID(int id){
      numberID = id;   
    }
    
    /**
     * 
     * @return current credits earned for the student.
     */
    public double GetCreditsEarned(){
        return creditsEarned;
    }
    
    /**
     * 
     * @param credits: sets the credits for the student. 
     */
    public void SetCreditsEarned(int credits){
        creditsEarned = credits;
    }
    
    /**
     * 
     * @return current points earned for the student
     */
    public int GetPointsEarned(){
        return pointsEarned;
    }
    
    /**
     * 
     * @param points: sets current points earned for the student 
     */
    public void SetPointsEarned(int points){
        pointsEarned = points;
    }
    
    /**
     * 
     * @return: gets the current G.P.A for the student
     */
    public double CalcGPA(){
        return pointsEarned / creditsEarned;
    }
}
