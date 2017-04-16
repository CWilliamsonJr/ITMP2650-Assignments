
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class DinnerPartyWithConstructor extends PartyWithConstructor
{
    private int dinnerChoice;

    public int getDinnerChoice()
    {
        return dinnerChoice;
    }

    public void setDinnerChoice(int dinnerChoice)
    {
        this.dinnerChoice = dinnerChoice;
    }    
    
    @Override
    public void displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
