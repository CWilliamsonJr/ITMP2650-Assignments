/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class DemoBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x  = 1111;
        System.out.println("In first block x is" + x);
        
        {
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }
        
        {
            int y = 3333;
            System.out.println("In the third block x is " + x);
            System.out.println("In the third block y is " + y);
            demoMethod();
            System.out.println("After method block x is " + x);
            System.out.println("After method block y is " + y);
        }
        
        System.out.println("At the end x is " + x);
    }
    
    public static void demoMethod(){
        
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod block y is " + y);
    }
}
