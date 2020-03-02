import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import sun.lwawt.macosx.CSystemTray;

import java.util.Random;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to make an account? (Y/N)");
        String answer = input.next();
        if (!answer.equalsIgnoreCase("Y")) {
            return;
        }

        System.out.println("Hello, please provide your first name");
        String FirstName = input.next();
        System.out.println("Hello, please provide your last name");
        String LastName = input.next();

        Customer newCustomer = new Customer(FirstName, LastName);

        System.out.println("We require an intial deposit of $45.00");
        System.out.println("Would you like to make a deposit (Y/N)");
        answer = input.next();
        if (!answer.equalsIgnoreCase("Y")) {
            return;
        }
        System.out.println("How much would you like to deposit?");
        double deposit = input.nextDouble();
        while (deposit < 45) {
            System.out.println("It has to be more than $45.00");
            System.out.println("How much would you like to deposit?");
            deposit = input.nextDouble();
        }

        Random rand = new Random();
        int accountNumber = rand.nextInt(1000000);

        int routingNumber = rand.nextInt(1000000);

        newCustomer.OpenAccount(accountNumber, deposit);

        Account.PrintAccountInto(accountNumber, routingNumber, deposit, FirstName, LastName);

        System.out.println();
        System.out.println("Press 1 if you would you like to make a deposit?");
        System.out.println("Press 2 if you would you like to withdraw? ");
        System.out.println("Press 3 if would you would like to close your account");
        System.out.println("Press 4 if you would like to get your balance?");
        answer = input.next();
        if (answer.equals("1")) {
            System.out.println("How much would you like to deposit?");
            deposit = input.nextDouble();
            newCustomer.userAccount.DepositFunds(deposit);

//            this ensures the balance is updated.
//            System.out.println(newCustomer.userAccount.GetBalance());
        } else if (answer.equalsIgnoreCase("2")) {
            System.out.println("How much would you like to withdraw?");
            double balanceRemoved = input.nextDouble();
            newCustomer.userAccount.WithdrawFunds(accountNumber, deposit, balanceRemoved);
        } else if (answer.equals(3)) {
            System.out.println("We're sorry to see you go");
            newCustomer.CloseAccount();
        } else if (answer.equals(4)) {
            newCustomer.userAccount.GetBalance();
        }

    }
}
