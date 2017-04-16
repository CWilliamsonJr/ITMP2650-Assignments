/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import com.vehicleswesell.vehicle.Vehicle;
import com.vehicleswesell.vehicle.Sailboat;
import com.vehicleswesell.vehicle.Bicycle;
/**
 *
 * @author Clarence
 */
public class VehicleDatabase
{
    public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        for(x = 0; x < vehicles.length; ++x)
        {
            String userEntry;
            int vehicleType;
            userEntry = JOptionPane.showInputDialog("Please select the type of \n vehicle you want to enter: \n1 - Sailboat 2 - Bicycle");
            vehicleType = Integer.parseInt(userEntry);
            
            if(vehicleType == 1 )
            {
                vehicles[x] = new Sailboat();
            }
            else
            {
                vehicles[x] = new Bicycle();
            }
        }  
            StringBuffer outString = new StringBuffer();
            for(x = 0; x < vehicles.length; ++x)
            {
                outString.append("\n#" + (x + 1) + " ");
                outString.append(vehicles[x].toString());
            }
            
            JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" + outString);
        
    }
}
