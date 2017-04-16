package Ch_12;

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
public class PlanMenu
{
    public static void main(String[] args)
    {
        Menu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
}
