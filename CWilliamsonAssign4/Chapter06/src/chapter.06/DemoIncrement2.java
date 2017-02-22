

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ClevelandCodes
 */
public class DemoIncrement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int v = 4;
        int plusPlusV = ++v;
        
        v = 4;
        int vPlusPlus = v++;
        
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
        
        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);
        
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
        
    }
    
}
