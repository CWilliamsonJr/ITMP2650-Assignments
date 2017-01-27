/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Chapter_3;

/**
 *
 * @author Clarence
 */
public class SpaService {
    private String serviceDescription;
    private double price;
    
    public SpaService(){
        price = 0;
        serviceDescription = "XXX";
    }
    
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    
    public void setPrice(double pr){
        price = pr;
    }
    
    public String getServiceDescription(){
        return serviceDescription;
    }
    
    public double getPrice(){
        return price;
    }
}
