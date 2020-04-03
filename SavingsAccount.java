// header
public class SavingsAccount
{
    // instance variables
    private double balance;
    private double interest;
    // constructor
    public SavingsAccount()
    {
        balance = 100;
        interest = 0.1;
    }
    public SavingsAccount(double startingBalance, double startingInterest)
    {
        balance = startingBalance;
        interest = startingInterest;
    }
    // method
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
    // increase balance by interest rate
    public void applyInterest()
    {
        balance += (balance * interest);
    }
}