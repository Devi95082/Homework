package loginsystem;
import java.util.Scanner;
public class StudentMark 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int marks = -1; // default value
        int choice;

        do
        {
            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Enter Student Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                 case 1:
                    try 
                    {
                        System.out.print("Enter marks (0-100): ");
                        int inputMarks = sc.nextInt();

                        if (inputMarks < 0 || inputMarks > 100)
                        {
                            throw new InvalidMarksException("Marks should be between 0 and 100!");
                        }

                        marks = inputMarks;
                        System.out.println("Marks stored successfully.");

                    } 
                    catch (InvalidMarksException e)
                    {
                        System.out.println("Error: " + e.getMessage());
                    } 
                    catch (Exception e)
                    {
                        System.out.println("Invalid input! Please enter a number.");
                        sc.next(); // clear invalid input
                    }
                    break;
                     case 2:
                    if (marks == -1) {
                        System.out.println("No marks entered yet.");
                    } else {
                        System.out.println("Student Marks: " + marks);
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

                    
    }
}
    

