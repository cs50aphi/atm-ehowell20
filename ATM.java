import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount(15);
        SavingsAccount savings = new SavingsAccount(100);
    }
}