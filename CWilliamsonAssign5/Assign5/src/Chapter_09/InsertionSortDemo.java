

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Clarence
 */
public class InsertionSortDemo
{
    public static void main(String[] args)
    {
        int[] someNums = new int[5];
       
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;
        
        for(a = 0; a < someNums.length; a++)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();        
        }
        
        a = 1;
        
        while(a < someNums.length)
        {
            temp = someNums[a];
            b = a - 1;
            while(b >= 0 && someNums[b] > temp)
            {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }        
    }
    
    public static void display(int[] someNums, int a)
    {
        System.out.print("Iteration " + a + ": ");
        for(int x = 0; x < someNums.length; x++)
        {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}
