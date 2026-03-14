package bankmanagementsystem;
public class BankAccount 
{
   private double acnumber;
   private String name;
    private double balance;
   private double deposite;
   private double withdraw;

    public BankAccount(double acnumber, String name, double balance)
    {
        this.acnumber = acnumber;
        this.name = name;
        this.balance = balance;
    }

    public double getAcnumber()
    {
        return acnumber;
    }

    public void setAcnumber(double acnumber)
    {
        this.acnumber = acnumber;
    }

    public String getName() 
    
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }  
    
    void deposit(double amt)
    {
        deposite=amt;
        balance=balance+amt;
    }
    void withdraw(double amt)
    {
        withdraw=amt;
        if(amt>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
             balance=balance-amt;
        }
       
    }
    void display()
    {
        System.out.println("Deposite : "+deposite);
        System.out.println("withdraw : "+withdraw);
        System.out.println("Account Holder name : "+name);
        System.out.println("Account Number : "+acnumber);
        System.out.println("Balance : "+balance);
    }

    
    
}
