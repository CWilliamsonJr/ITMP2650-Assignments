



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class PartyWithConstructor2
{
    private int guests;

    public PartyWithConstructor2(int numGuests)
    {
        guests = numGuests;
    }
    public int getGuests()
    {
        return guests;
    }

    public void setGuests(int guests)
    {
        this.guests = guests;
    }
    
    public void displayInvitation()
    {
        System.out.println("Please come to my party");
    }
}
