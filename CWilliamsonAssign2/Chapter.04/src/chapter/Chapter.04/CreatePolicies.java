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
public class CreatePolicies {
    public static void main(String[] args){
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastel");
        
        first.display();
        second.display();
        third.display();
        
        //CarInsurancePolicy fourth = new CarInsurancePolicy();
    }
}
