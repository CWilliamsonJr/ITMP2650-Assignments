

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author Clarence
 */
public class JAction2 extends JFrame implements ActionListener
{
    JLabel label = new JLabel("Enter your name");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");
    
    
    
    public JAction2()
    {
        super("Frame with Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
        button.addActionListener(this);
        field.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        
        if(source == button)
            label.setText("You clicked the button");
        else
            label.setText("You Pressed Enter");
    }
    
    public static void main(String[] args)
    {
        JAction2 aFrame = new JAction2();
        final int WIDTH = 250;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
