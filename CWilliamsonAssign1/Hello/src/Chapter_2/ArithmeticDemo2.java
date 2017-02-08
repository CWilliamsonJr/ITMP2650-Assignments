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
 * @author Clarence
 */
public class ArithmeticDemo2 {
    public static void main(String[] args){
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an double >> ");
        firstNumber = input.nextDouble();
        
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;
        
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
