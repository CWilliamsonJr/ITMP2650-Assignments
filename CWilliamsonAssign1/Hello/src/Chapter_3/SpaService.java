/*
 * Name: Clarence Williamson
 * Date: 1/26/17
 * Course: IT: 2650
 * Assignment #: 1
 * 
 */

/**
 * Class that is used to make a new spa service object
 * that contains a description of the service along with the price.
 * @author Clarence
 */
public class SpaService {
    private String serviceDescription;
    private double price;
    
    public SpaService(){
        price = 0;
        serviceDescription = "XXX";
    }
    /**
     * sets the name of the service
     * @param service - name of the service
     */
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    
    /**
     * sets the price of the service
     * @param pr - price of the service
     */
    public void setPrice(double pr){
        price = pr;
    }
    
    /**
     * gets the current name of the service 
     * @return - returns the name of the service
     */
    public String getServiceDescription(){
        return serviceDescription;
    }
    
    /**
     * gets the current price set for the service
     * @return - returns the current price.
     */
    public double getPrice(){
        return price;
    }
}
