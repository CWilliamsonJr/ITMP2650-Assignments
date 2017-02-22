/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

/**
 *
 * @author ClevelandCodes
 */
public class DivideEvenly2
{
    public static void main(String[] args)
    {
        final int LIMIT = 100;
        int var;
        int number;
        
        System.out.print(LIMIT + " is evenly divisible by ");
        
        for(number = 1; number <= LIMIT; ++number)
        {
            System.out.print(number + " is evenly divisible by ");
            for(var = 1; var <= LIMIT; ++var)
            {
                if(number % var == 0)
                {
                    System.out.print(var + " ");
                   
                }
            }
            System.out.println();
        }
    }
}
