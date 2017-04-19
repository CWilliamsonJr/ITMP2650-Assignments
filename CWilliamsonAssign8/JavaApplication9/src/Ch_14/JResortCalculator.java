/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Clarence
 */
public class JResortCalculator extends JFrame implements ItemListener
{
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMUIM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;
    
    JCheckBox weekendBox = new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox("Breakfast $" + BREAKFAST_PREMUIM, false);
    JCheckBox golfbox = new JCheckBox("Golf $" + GOLF_PREMIUM, false);
    
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for your stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $" + BASE_PRICE + ".");
    JLabel optionExplainLabel2 = new JLabel("Check the options you want.");

    public JResortCalculator()
    {
        super("REsort Price EStimator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(resortLabel);
        this.add(optionExplainLabel);
        this.add(optionExplainLabel2);
        this.add(weekendBox);
        this.add(breakfastBox);
        this.add(golfbox);
        this.add(priceLabel);
        this.add(totPrice);
        
        totPrice.setText("$"+ totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfbox.addItemListener(this);
    }
    
    

    @Override
    public void itemStateChanged(ItemEvent event)
    {
        Object source = event.getSource();
        int select = event.getStateChange();
        
        if(source == weekendBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += WEEKEND_PREMIUM;
        else
            totalPrice -= WEEKEND_PREMIUM;
        else if(source == breakfastBox)
        {
            if(select == ItemEvent.SELECTED)
                totalPrice += BREAKFAST_PREMUIM;
            else
                totalPrice -= BREAKFAST_PREMUIM;
        }
        else // if(source == golfbox) by default
            if(select == ItemEvent.SELECTED)
                totalPrice += GOLF_PREMIUM;
            else
                totalPrice -= GOLF_PREMIUM;
        totPrice.setText("$" + totalPrice);
    }
    
    public static void main(String[] args)
    {
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
    
}
