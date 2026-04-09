package loginsystem;

import java.util.Scanner;
        
public class LoginSystem
{
    static final String USERNAME = "admin";
    static final String PASSWORD = "1234";


    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

        int attempts = 3;
        int choice;

        do {
            System.out.println("\n===== Smart Login System =====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
             switch (choice)
             {

                case 1:
                    try
                    {
                        while (attempts > 0) 
                        {
                            System.out.print("Enter Username: ");
                            String user = sc.nextLine();

                            System.out.print("Enter Password: ");
                            String pass = sc.nextLine();

                            if (user.equals(USERNAME) && pass.equals(PASSWORD)) 
                            {
                                System.out.println(" Login Successful!");
                                break;
                            }
                            else
                            {
                                attempts--;
                                if (attempts == 0)
                                {
                                    throw new AccountLockedException(" Account Locked! Too many failed attempts.");
                                }
                                System.out.println(" Invalid credentials!");
                                System.out.println("Remaining Attempts: " + attempts);
                            }
                        }
                    }
                    catch (AccountLockedException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                    case 2:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("️ Invalid choice!");
                              System.out.println("Invalid choice!");
            }

        } while (choice != 2);

    }
    
}
