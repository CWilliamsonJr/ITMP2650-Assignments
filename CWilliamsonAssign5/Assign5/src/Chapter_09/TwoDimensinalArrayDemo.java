/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Clarence
 */
public class TwoDimensinalArrayDemo
{
    public static void main(String[] args)
    {
        int[][] count = new int[3][3];
        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;
        
        System.out.print("Enter a row or " + QUIT + " to quit > ");
        row = input.nextInt();
        
        while(row != QUIT)
        {
            System.out.print("Enter a column > ");
            column = input.nextInt();
            if(row <  count.length && column < count[row].length)
            {
                count[row][column]++;
                
                for(int r = 0; r < count.length; r++)
                {
                    for(int c = 0; c < count[r].length; c++)
                    {
                        System.out.print(count[r][c] + " ");
                    }
                    
                    System.out.println();
                }
            }else
            {
                System.out.println("Invaild posistion selected");
            }
            
            System.out.print("Enter a new row or " + QUIT + " to quit > ");
            row = input.nextInt();
        }
    }
}
