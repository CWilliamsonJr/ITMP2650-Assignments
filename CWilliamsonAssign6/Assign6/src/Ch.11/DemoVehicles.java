


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import com.vehicleswesell.vehicle.Sailboat;
import com.vehicleswesell.vehicle.Bicycle;

/**
 *
 * @author Clarence
 */
public class DemoVehicles
{
    
    public static void main(String[] args)
    {
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();
        
        JOptionPane.showMessageDialog(null, "\nVehicle description:\n" + aBoat.toString() + "\n" + aBike.toString());
    
    }
}
