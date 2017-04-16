

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Clarence
 */
public class UseParty
{
    public static void main(String[] args)
    {
      int guests;      
      Party aParty = new Party();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter number of guests for the dinner party >> ");
      guests = keyboard.nextInt();
      aParty.setGuests(guests);
           
      System.out.println("The party has " + aParty.getGuests() + " guests");     
      
      aParty.displayInvitation();
    }
}
