/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_07;

/**
 *
 * @author Clarence
 */
public class StringBuilderMethods
{
     public static void main(String[] args)
     {
         StringBuilder str = new StringBuilder("singing");
         System.out.println(str);
         
         str.append(" in the dead of ");
         System.out.println(str);
         
         str.insert(0, "Black");
         System.out.println(str);
         
         str.insert(5, " bird ");
         System.out.println(str);
     }
}
