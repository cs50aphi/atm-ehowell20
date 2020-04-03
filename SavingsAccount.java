// header
public class SavingsAccount
{
    // instance variables
    private int balance;
    // private int interest ??
    // constructor
    public SavingsAccount()
    {
        balance = 100;
        // interest = ????
    }
    public SavingsAccount(int startingBalance)
    {
        balance = startingBalance;
        // interest = ???
    }
    // method
    // deposit
    public void deposit(int value)
    {
        balance += value;
    }
    // withdraw
    public void withdraw(int value)
    {
        balance -= value;
    }
    // get balance
    public int getBalance()
    {
        return balance;
    }
    // increase balance by interest rate
}