import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        // number of transactions gone by
        int transaction = 0;
        // response to atm question
        String answer = "G";
        // exit machine when true
        boolean quit = false;
        // response value (when chosing between accounts)
        int value = 0;
        // deposit/withdraw/transfer credit value
        double credits = 0;
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
            answer = kb.next();
            switch (answer)
            {
                case "D":
                case "d":
                    // deposit
                    System.out.print("Deposit to: (1)Checking or (2)Savings? ");
                    value = kb.nextInt();
                    System.out.print("How many credits do you want to deposit? ");
                    credits = kb.nextInt();
                    if (value == 1)
                    {
                        // deposit into checking
                        checking.deposit(credits);
                    }
                    else if (value == 2)
                    {
                        // deposit into savings
                        savings.deposit(credits);
                    }
                    // if user does not enter 1 or 2
                    else
                    {
                        System.out.println("Not a valid option");
                    }
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    break;
                case "W":
                case "w":
                    // withdraw
                    System.out.print("Withdraw from: (1)Checking or (2)Savings? ");
                    value = kb.nextInt();
                    System.out.print("How many credits do you want to withdraw? ");
                    credits = kb.nextInt();
                    if (value == 1)
                    {
                        // withdraw from checking
                        // if withdaw value more then savings balance, do not allow
                        if (credits > checking.getBalance())
                        {
                            System.out.println("Insufficient funds");
                        }
                        else
                        {
                            // withdraw from checking
                            checking.withdraw(credits);
                        }
                    }
                    else if (value == 2)
                    {
                        // withdraw from savings
                        // if withdaw value more then savings balance, do not allow
                        if (credits > savings.getBalance())
                        {
                            System.out.println("Insufficient funds");
                        }
                        else
                        {
                            // withdraw from savings
                            savings.withdraw(credits);
                        }
                    }
                    // if user does not enter 1 or 2
                    else
                    {
                        System.out.println("Not a valid option");
                    }
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    break;
                case "c":
                case "C":
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    break;
                case "T":
                case "t":
                    // transfer
                    System.out.print("Transfer from: (1)Checking to Savings or (2)Savings to Checking? ");
                    value = kb.nextInt();
                    System.out.print("How many credits do you want to transfer? ");
                    credits = kb.nextInt();
                    if (value == 1)
                    {
                        // checking to savings
                        // checks if transfer value larger than account balance
                        if (credits > checking.getBalance())
                        {
                            System.out.println("Insufficient Funds");
                        }
                        else
                        {
                            // withdraw from checking
                            checking.withdraw(credits);
                            // deposit into savings
                            savings.deposit(credits);
                        }
                    }
                    else if (value == 2)
                    {
                        // savings to checking
                        // checks if transfer value larger than account balance
                        if (credits > savings.getBalance())
                        {
                            System.out.println("Insufficient Funds");
                        }
                        else
                        {
                            // withdraw from savings
                            savings.withdraw(credits);
                            // deposit into checking
                            checking.deposit(credits);
                        }
                    }
                    // if user does not enter 1 or 2
                    else
                    {
                        System.out.println("Not a valid option");
                    }
                    // print both account balances
                    System.out.println("Your checking account has " + checking.getBalance() + " credits");
                    System.out.println("Your savings account has " + savings.getBalance() + " credits");
                    break;
                case "Q":
                case "q":
                    // marks quit as true to break loop
                    quit = true;
                    break;
                // if user does not enter d, w, t, or q
                default:
                    System.out.println("Not a valid option");

            }
            // increase transaction number after every transaction
            transaction++;
            // calculate interest after 5 transactions
            if ((transaction % 5) == 0)
            {
                savings.applyInterest();
                // print both account balances
                System.out.println("Your checking account has " + checking.getBalance() + " credits");
                System.out.println("Your savings account has " + savings.getBalance() + " credits");
            }
        }
        while (!quit);
    }
}
