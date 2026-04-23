
package com.mycompany.bankaccountmenu;
import java.util.Scanner;
public class BankAccountMenu 
{
    private double balance;

    // Constructor
    public BankAccountMenu(double initialBalance)
    {
        this.balance = initialBalance;
    }

    // Deposit
    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance += amount;
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
            throw new IllegalArgumentException("Invalid withdraw amount");
        }
        if (amount > balance) 
        {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    // Check Balance
    public double getBalance() 
    {
        return balance;
    }

    // Menu-driven program
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccountMenu account = new BankAccountMenu(initialBalance);

        while (true) 
        {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try 
            {
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        System.out.println("Deposit successful!");
                        break;

                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                        System.out.println("Withdrawal successful!");
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
