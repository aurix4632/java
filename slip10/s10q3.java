
import java.io.*;
import java.util.*;

class InsufficientFund extends Exception
{
}

class SavingsAccount
{
    Scanner sc=new Scanner(System.in);
    int accno;
    String name;
    double balance;
    
    public SavingsAccount(int a, String n, double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public void withdraw()
    {
        try
        {
            System.out.print("Enter amount to be withdrawn : ");
            double wd=sc.nextDouble();
            balance-=wd;
            if(balance<500)
            {
                throw new InsufficientFund();
            }
        }
        catch(InsufficientFund e)
        {
            System.out.println("Insufficient Fund, minimum balance required is 500");
        }
    }
    
    public void deposit()
    {
        System.out.print("Enter amount to be deposited : ");
        double de=sc.nextDouble();
        balance+=de;
    }
    
    public void view()
    {
        System.out.print("Current balance available : "+balance);
    }
}

class s10q3
{
    public static void main(String[] args) throws IOException
    {
        SavingsAccount s=new SavingsAccount(101,"XYZ",1000);
        s.deposit();
        s.withdraw();
        s.view();
    }
}

