

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package chapter.pkg04;

/**
 *
 * @author Clarence
 */
public class TestDogs3 {
    public static void main(String[] args)
    {        
        DogTriathlonParticipant3 dog1 = new DogTriathlonParticipant3("Bowser", 1, 85, 89, 0);
        dog1.display();
        
        DogTriathlonParticipant3 dog2 = new DogTriathlonParticipant3("Rush", 3, 78, 72, 80);
        dog2.display();
        
        DogTriathlonParticipant3 dog3 = new DogTriathlonParticipant3("Ginter", 3, 90, 86, 72);
        dog3.display();
    }
}
