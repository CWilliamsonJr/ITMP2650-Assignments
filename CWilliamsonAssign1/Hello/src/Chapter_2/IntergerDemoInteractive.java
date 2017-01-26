/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */
//package Chapter_2;
import java.util.Scanner;
/**
 *
 * @author ClevelandCodes
 */
public class IntergerDemoInteractive {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);        
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
        
        System.out.println("The int is " + anInt); 
        System.out.println("The byte is " + aByte); 
        System.out.println("The short is " + aShort); 
        System.out.println("The long is " + aLong);
        
    }
}
