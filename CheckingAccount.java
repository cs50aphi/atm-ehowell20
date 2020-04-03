// header
public class CheckingAccount
{
    // instance variables
    private double balance;
    // constructor
    public CheckingAccount()
    {
        balance = 10;
    }
    public CheckingAccount(double startingBalance)
    {
        balance = startingBalance;
    }
    // methods
    // deposit
    public void deposit(double value)
    {
        balance += value;
    }
    // withdraw
    public void withdraw(double value)
    {
        balance -= value;
    }
    // get balance
    public double getBalance()
    {
        return balance;
    }
}