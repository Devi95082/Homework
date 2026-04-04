package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
    public static void main(String[] args) throws IOException 
    {
       /* File st = new File("E:\\NetBeans Program \\Student.txt");
           if(st.createNewFile())
       {
           System.out.println("New File is Created Successfully");
       }
       else
       {
           System.out.println("File is already exist");
       }*/
           
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("\n===== File Management System =====");
            System.out.println("1. Write Data");
            System.out.println("2. Read Data");
            System.out.println("3. Append Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
             
            switch (choice)
             {

                case 1:
                      
                {
                    try 
                    {
                        FileWriter fw = new FileWriter("student.txt");
                        System.out.print("Enter data to write: ");
                        String data = sc.nextLine();
                        fw.write(data);
                        fw.close();
                        System.out.println("Data written successfully (Old data overwritten).");
                    }
                    catch (IOException e) 
                    {
                        System.out.println("Error writing file.");
                    }
                }
                break;

                case 2:
                {    
                    try
                    {
                        FileReader fr = new FileReader("student.txt");
                        BufferedReader br = new BufferedReader(fr);

                        System.out.println("\n--- File Content ---");
                        String line;
                        while ((line = br.readLine()) != null)
                        {
                            System.out.println(line);
                        }

                        br.close();
                        fr.close();
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("Error reading file.");
                    }
                }       
                break;
                case 3:
                {   
                    try
                    { 
                        FileWriter fw = new FileWriter("student.txt", true);
                        System.out.print("Enter data to append: ");
                        String data = sc.nextLine();
                        fw.write("\n" + data);
                        fw.close();
                        System.out.println("Data appended successfully.");
                    }
                    catch (IOException e) 
                    {
                        System.out.println("Error appending file.");
                    }
                }
                break;
                
                case 4:
                    System.out.println("Exiting program...");
                break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
                    
                        

                    
        
    }
    
}
