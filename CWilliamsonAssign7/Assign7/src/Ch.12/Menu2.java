

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
import javax.swing.*;
public class Menu2
{
    protected String[] entreeChoice = {"Rosemary Chicken", "Beef wellington", "Maine Lobster"};
    private String menu = "";
    private int choice;
    protected char[] initial = new char[entreeChoice.length];
    
    public String displayMenu() throws MenuException
    {
        for (int x = 0; x < entreeChoice.length; x++)
        {
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
            initial[x] = entreeChoice[x].charAt(0);
        }
        
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
        for (int y = 0; y < entreeChoice.length; y++)
        {
            if(input.charAt(0) == initial[y]) 
                throw (new MenuException((entreeChoice[y])));
        }
        choice = Integer.parseInt(input);
        return(entreeChoice[choice - 1]);
    }
}
