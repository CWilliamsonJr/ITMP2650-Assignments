/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Clarence
 */
public class Service
{
   private String _description;
   private double _price;
   private int _time;
   
   
   public Service(String desc, double price, int time)
   {
       _description = desc;
       _price = price;
       _time = time;
   }
   
   public String getDescription()
   {
       return _description;
   }
   
   public Double getPrice()
   {
       return _price;
   }
   
   public Integer getTime()
   {
       return _time;
   }   
}
