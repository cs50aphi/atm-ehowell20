// header
public class CheckingAccount
{
    // instance variables
    private int balance;
    // constructor
    public CheckingAccount()
    {
        balance = 10;
    }
    public CheckingAccount(int startingBalance)
    {
        balance = startingBalance;
    }
    // methods
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
}