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
public class TestDogs2 {
    public static void main(String[] args){
        
        DogTriathlonParticipant2 dog1 = new DogTriathlonParticipant2("Bowser", 1, 85, 89, 0);
        dog1.display();
        
        DogTriathlonParticipant2 dog2 = new DogTriathlonParticipant2("Rush", 2, 78, 72, 80);
        dog2.display();
        
        DogTriathlonParticipant2 dog3 = new DogTriathlonParticipant2("Ginter", 3, 90, 86, 72);
        dog3.display();
    }
}
