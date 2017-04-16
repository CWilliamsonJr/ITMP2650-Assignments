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
public class InsuredCarDemo
{
    public static void main(String[] args)
    {
        InsuredCar myCar = new InsuredCar();
        
        JOptionPane.showMessageDialog(null, myCar.toString());
    }
}
