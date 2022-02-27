abstract class Accounts
{
    String accountHoldersName;
    String address;
    int accountNumber;
    float balance;
    abstract void withdrawal(float amt); 
    abstract void deposit(float amt); 
    Accounts(int acno, String n, String addr, float b)
    {
        accountNumber=acno;
        accountHoldersName=n;
        address=addr;
        balance=b;
    }
    void display()
    {
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holders Name:"+accountHoldersName);
        System.out.println("Address:"+address);
        System.out.println("Account Balance: Rs."+balance);
    }
 }

 

class SBAccounts extends Accounts
{
    float rateOfInterest;
    
    void calculateAmount() 
    { 
        
    }
    SBAccounts(int acno, String n, String addr, float b, float rate)
    {
        super(acno, n, addr, b); 
        rateOfInterest=rate;
    }
    void withdrawal(float amt){}
    void deposit(float amt){}
    
    void display() 
    {
        super.display();
        System.out.println("Rate of Interest:"+rateOfInterest+"%");
    }
}

 

public class account_t
{
    public static void main(String args[])
    {
        Accounts ac;
        ac=new SBAccounts(123, "SANKET", "DHANBAD", 125000.00f,102.0f);
        ac.display();
    }
    
}