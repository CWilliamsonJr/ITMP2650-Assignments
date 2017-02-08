/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */
import java.util.Scanner;
/**
 *
 * @author Clarence Williamson
 */
public class ArithmeticDemo3 {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        int sum; // stores the sumation of two numbers 
        int difference; // stores the subtraction of two numbers
        double average; // stores the average of two numbers.
        Scanner input = new Scanner(System.in); // gets user input.
        
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber; // adds the numbers
        difference = firstNumber - secondNumber; // subtracts the numbers.
        average =  sum / 2.0; //gets the avgerage of the numbers.
        
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
