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
public class JDemoFrame
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       JFrame aFrame = new JFrame("This is a frame");
       final int WIDTH = 250;
       final int HEIGHT = 250;
       aFrame.setSize(WIDTH, HEIGHT);
       aFrame.setVisible(true);
    }
    
}
