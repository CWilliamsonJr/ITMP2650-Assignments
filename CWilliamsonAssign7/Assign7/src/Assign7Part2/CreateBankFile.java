/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

/**
 *
 * @author Clarence
 */
public class CreateBankFile
{
    public static void main(String[] args)
    {
        // Making variables needed to create the files
        Scanner input = new Scanner(System.in);
        Path bankFile = Paths.get("C:\\Users\\Clarence\\Dropbox\\ITMP2650-Assignments\\CWilliamsonAssign7\\Assign7\\src\\Assign_7\\BankRecords.txt"); // path to save file
        final String NAME_FORMAT = "        "; // name length.
        final int NAME_LENGTH = NAME_FORMAT.length();
        String delimiter = ",";
        String balance = "$00,000.00 ";
        double acctBal;
        String acctNum = "ID#0000" ;
        String idString;
        int id;
        String lastName;
        String pattern = "##,###.00";
        FileChannel fcBank = null;
        String s =  acctNum + " " + NAME_FORMAT + " " + balance + System.getProperty("line.separator"); // combines everything into one string.
        final int RECSIZE = s.length();
        final String QUIT = "zzz";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        
        DisplayAssigmentInfo(7, "April 4th, 2017", 13, 9);
        createEmptyFile(bankFile, s); // makes the blank file.
        
        try
        {
            StringBuilder sb;
            fcBank = (FileChannel) Files.newByteChannel(bankFile, CREATE, WRITE);
            System.out.print("Enter customer account number >> ");
            idString = input.nextLine();            
            while(!(idString.equals(QUIT)))
            {
                id = Integer.parseInt(idString);
                sb = new StringBuilder();
                if(idString.length() < 4) // appends leading zeros to Id
                {
                    int appendZero = 4 - idString.length();
                    for (int i = 0; i < appendZero; i++)
                    {
                        sb.append("0");
                    }                
                }
                 idString = "ID#" +  sb.toString() + id;  
                
                System.out.print("Enter Last Name for customer >> ");
                lastName = input.nextLine();
                sb = new StringBuilder(lastName);
                sb.setLength(NAME_LENGTH); // truncates the last name to 8 spaces
                
                lastName = sb.toString();
                
                System.out.print("Enter in account balance >> ");
                balance = input.nextLine();
                acctBal = Double.parseDouble(balance);
                balance = "$" + decimalFormat.format(acctBal);
                s = idString + " " + lastName  +  " " + balance; // combines everything to be wrote to file
                
                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                
                fcBank.position(id * RECSIZE); // writes at specified postition
                fcBank.write(buffer);
                
                System.out.print("Enter next customer account number or " + QUIT + " to quit >> ");
                idString = input.nextLine(); 
                
            } // end of while
            
            fcBank.close();
        } // end of try
        catch(Exception e)
        {
            
        }
    }
    
    // creates the blank file.
    public static void createEmptyFile(Path file, String s)
    {
        final int NUMRECS = 10000;
        
        try
        {
            OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
            
            for (int count = 0; count < NUMRECS; count++)
            {
                writer.write(s, 0, s.length());
            }
            
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
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
