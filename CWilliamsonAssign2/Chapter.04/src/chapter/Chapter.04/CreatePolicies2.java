//package chapter.pkg04;

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
public class CreatePolicies2 {
    public static void main(String[] args){
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastel");
        
        first.display();
        second.display();
        third.display();
        
        //CarInsurancePolicy fourth = new CarInsurancePolicy();
    }
}
