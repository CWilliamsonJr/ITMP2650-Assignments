//package Chapter_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Chapter_2;
import java.util.Scanner;
/**
 *
 * @author ClevelandCodes
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
