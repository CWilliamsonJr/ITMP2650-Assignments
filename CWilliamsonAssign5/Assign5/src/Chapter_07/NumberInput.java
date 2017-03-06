/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

/**
 *
 * @author Clarence
 */
public class NumberInput
{
    public static void main(String[] args)
    {
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;
        
        inputString = JOptionPane.showInputDialog(null, "Enter a number");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
