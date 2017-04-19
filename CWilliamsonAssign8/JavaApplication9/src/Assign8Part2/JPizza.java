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
public class JPizza extends JFrame implements ItemListener
{
    
    int totalPrice = 0;
    final int SMALL_PIZZA = 7;
    final int MEDIUM_PIZZA = 9;
    final int LARGE_PIZZA = 11;
    final int EXTRA_LARGE_PIZZA = 14;
    final int TOPPING = 1;
    Boolean toppingSelected;
    String[] pizzaSizeArray = {"Small", "Medium","Large","Extra Large"};
    String[] pizzaToppingsArray = {"Cheese","Sausage","Pepperoni","Ham","Mushrooms"};
    JComboBox<String> pizzaSize = new JComboBox<>(pizzaSizeArray); // combox box to hold the pizza sizes
    JComboBox<String> pizzaToppings = new JComboBox<>(pizzaToppingsArray); // combo box to  hold the pizza toppings.
    JLabel lblPizzaSize = new JLabel("Pizza Size");
    JLabel lblPizzaToppings = new JLabel("Pizza Toppings");
    JLabel lblTotalPrice = new JLabel("Total Price");
    JTextField txtTotalPrice = new JTextField(8);
    
    
    
    public JPizza()
    {
        super("Pizza Order Program");
        toppingSelected = false;
        totalPrice = SMALL_PIZZA;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lblPizzaSize);
        add(pizzaSize);
        add(lblPizzaToppings);
        add(pizzaToppings);
        add(lblTotalPrice);
        add(txtTotalPrice);
        txtTotalPrice.setText("$" + totalPrice);
        pizzaToppings.addItemListener(this);       
        pizzaSize.addItemListener(this);
        
    }
    
    public static void main(String[] args)
    {
        final int WIDTH = 175;
        final int HEIGHT = 300;
        JPizza aPizza = new JPizza();        
        aPizza.setSize(WIDTH, HEIGHT);
        aPizza.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getSource();
        int selectedIndex;
        int selectedEvent = e.getStateChange();
        
        if(source == pizzaToppings)
        {
            selectedIndex = pizzaToppings.getSelectedIndex();
            
            if(selectedIndex == 0)
            {
                if(toppingSelected)
                {
                    toppingSelected = false;
                    totalPrice -= 1;
                    txtTotalPrice.setText("$" + totalPrice);   
                }
                            
            }
            else
            {
               if(!toppingSelected)
               {
                   toppingSelected = true;
                   totalPrice += 1;
                   txtTotalPrice.setText("$" + totalPrice);                   
               }                
            }           
        }
        else
        {
            selectedIndex = pizzaSize.getSelectedIndex();
            switch(selectedIndex)
            {
                case 0:
                    totalPrice = SMALL_PIZZA;
                    break;
                case 1:
                    totalPrice = MEDIUM_PIZZA;
                    break;
                case 2:
                    totalPrice = LARGE_PIZZA;
                    break;
                case 3:
                    totalPrice = EXTRA_LARGE_PIZZA;
                    break;
            }
            
            if(toppingSelected)
            {
                totalPrice += 1;
            }
            
            txtTotalPrice.setText("$" + totalPrice);  
        }
    }
}
