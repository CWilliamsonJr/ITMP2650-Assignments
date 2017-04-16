/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.folder;

/**
 *
 * @author Clarence
 */
public class TestFolder
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      int a , b;
      a = 1;
      while(a <= 5)
      {
        System.out.print( a );
        b = a;
        while(b >= 1)
        {
            System.out.print( b );
            --b;
        }
        System.out.println(  );
        ++a;
      }
      
      //System.out.println("The value of c is " + c);
    }
    
}
