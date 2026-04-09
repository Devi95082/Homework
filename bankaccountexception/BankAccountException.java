package bankaccountexception;

import java.util.Scanner;
public class BankAccountException 
{ 
    static double balance=5000;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
       
        int choice;
        do
        {
             System.out.println("Enter Your Choice : ");
             choice=sc.nextInt();
             switch(choice)
             {
                case 1:
                {
                    System.out.println("Enter Withdraw Amount : ");
                    double amt=sc.nextDouble();
                    try 
                    {
                        withdraw(amt);
                    } 
                      catch (InsufficentException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 2 :
                    checkBalance();
                    break;

                case 3:
                    System.out.println("Thank you for using ATM!");
                    break;
                    
             }
             
             
            
        }while(choice!=3);
        
    }
     public static void withdraw(double amount) throws InsufficentException
     {
        if (amount > balance)
        {
            throw new InsufficentException("Insufficient Balance!");
        } 
        else
        {
            balance =balance- amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    
    public static void checkBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
    
}
