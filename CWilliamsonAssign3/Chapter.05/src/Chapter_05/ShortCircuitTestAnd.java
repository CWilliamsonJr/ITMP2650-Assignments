/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Chapter_05;

/**
 *
 * @author Clarence
 */
public class ShortCircuitTestAnd
{
    public static void main(String[] args)
    {
        if(falseMethod() && trueMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");
    }
    
    public static boolean trueMethod()
    {
        System.out.println("True Method");
        return true;
    }
    
    public static boolean falseMethod()
    {
        System.out.println("False Method");
        return false;
    }
}
