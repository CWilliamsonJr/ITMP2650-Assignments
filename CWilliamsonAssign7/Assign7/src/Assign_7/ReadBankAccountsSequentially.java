/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

/**
 *
 * @author Clarence
 */
public class ReadBankAccountsSequentially
{
    public static void main(String[] args)
    {
        String fileName = "C:\\Users\\Clarence\\Dropbox\\ITMP2650-Assignments\\CWilliamsonAssign7\\Assign7\\src\\Assign_7\\BankRecords.txt" ; // location for file
        Path file = Paths.get(fileName);
        String[] array = new String[3]; // array to hold values
        String s;
        DisplayAssigmentInfo(7, "April 4th, 2017", 13, 9);
        try
        {
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
            System.out.println("\nAll Bank Records: \n");
            s = reader.readLine(); // reads each line from file
            
            while(s != null) // loops through each line printing only the vaild lines.
            {
                
                array = s.split(" ");
                if(!array[0].equals("ID#0000"))
                {
                    System.out.println( array[0] + " " + array[1] + " " + array[2]);
                }
                s = reader.readLine();
            }       
            
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
    
    public static void DisplayAssigmentInfo(int assignmentNum, String dueDate,int chapterNum, int exNum){
         System.out.println("Name: Clarence Williamson IT 2650 Java Programming, Spr 2017, CRN 13906");
         System.out.print("Assignment# " + assignmentNum );
         System.out.print(" Chapter: " + chapterNum + " Exercise: " +  exNum);
         System.out.print(" Due: "+ dueDate);
         System.out.print("\n\n");
    }
}
