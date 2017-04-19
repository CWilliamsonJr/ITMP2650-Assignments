/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class CreateJFrameWithComponents
{
    public static void main(String[] args)
    {
        JFrameWithComponents aFrame = new JFrameWithComponents();
        final int WIDTH = 350;
        final int HEIGHT = 100;
        
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
