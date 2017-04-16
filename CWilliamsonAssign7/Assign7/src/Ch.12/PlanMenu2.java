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
public class PlanMenu2
{
    public static void main(String[] args)
    {
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu2 selection = new PickMenu2 (briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(MenuException error)
        {
            guestChoice = error.getMessage();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
}
