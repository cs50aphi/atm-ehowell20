import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // number of transactions gone by
        int transaction = 0;
        // response to atm question
        String answer = "G";
        // deposit/withdraw/transfer credit value
        int value = 0;
        Scanner kb = new Scanner(System.in);
        // creates checking account with default balance
        CheckingAccount checking = new CheckingAccount();
        // creates savings account with default balance
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Hi! How may I help you?");
        // loops the machine options until user quits
        do
        {
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit? ");
            answer = kb.nextLine();
            if (answer.equalsIgnoreCase("D"))
            {
                // deposit
                System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                value = kb.nextInt();
                if (value == 1)
                {
                    // deposit into checking
                    System.out.print("How many credits do you want to deposit? ");
                    value = kb.nextInt();
                    checking.deposit(value);
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                }
                else
                {
                    // deposit into savings
                    System.out.print("How many credits do you want to deposit? ");
                    value = kb.nextInt();
                    savings.deposit(value);
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                }
            }
            else if (answer.equalsIgnoreCase("W"))
            {
                // withdraw
                System.out.print("Withdraw from: (1)Checking or (2)Savings? ");
                value = kb.nextInt();
                if (value == 1)
                {
                    // withdraw from checking
                    System.out.print("How many credits do you want to withdraw? ");
                    value = kb.nextInt();
                    // if withdaw value more then savings balance, do not allow
                    if (value > checking.getBalance())
                    {
                        System.out.println("Insufficient funds");
                        // print both account balances
                        System.out.println("Your checking account has " + checking.getBalance() + " credits");
                        System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    }
                    else
                    {
                        checking.withdraw(value);
                        // print both account balances
                        System.out.println("Your checking account has " + checking.getBalance() + " credits");
                        System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    }
                }
                else
                {
                    // withdraw from savings
                    System.out.print("How many credits do you want to withdraw? ");
                    value = kb.nextInt();
                    // if withdaw value more then savings balance, do not allow
                    if (value > savings.getBalance())
                    {
                        System.out.println("Insufficient funds");
                        // print both account balances
                        System.out.println("Your checking account has " + checking.getBalance() + " credits");
                        System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    }
                    else
                    {
                        savings.withdraw(value);
                        // print both account balances
                        System.out.println("Your checking account has " + checking.getBalance() + " credits");
                        System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("C"))
            {
                // check balance
                System.out.println("Your checking account has " + checking.getBalance() + " credits");
                System.out.println("Your savings account has " + savings.getBalance() + " credits");
            }
            else if (answer.equalsIgnoreCase("T"))
            {
                // transfer
            }
            transaction++;
        }
        while (!answer.equals("q") && !answer.equals("Q"));
    }
}
