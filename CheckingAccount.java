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
    // get balance
    public int getBalance()
    {
        return balance;
    }
}