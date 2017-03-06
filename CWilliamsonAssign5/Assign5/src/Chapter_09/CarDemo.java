/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class CarDemo
{
    public static void main(String[] args)
    {
        Car firstCar = new Car(2012, Model.MINIVAN, Color.BLUE);
        Car secondCar = new Car(2014, Model.CONVERTIBLE, Color.RED);
        
        firstCar.display();
        secondCar.display();
    }
}
