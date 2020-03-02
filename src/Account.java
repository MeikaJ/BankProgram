public class Account {

    public int accountNumber;
    public double balance = 0 , minimumBalance, overdraftFee, balanceRemoved, InitialDeposit;


    //    constructor
    Account(int accountNumber, double intialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = intialDeposit;
        this.minimumBalance = 25.00;
        this.overdraftFee = 25.00;

    }


    public double GetBalance() {

        return balance;
    }

    public void DepositFunds(double deposit) {
        //double intialdeposit = 0;
        balance += deposit;
    }

    public double WithdrawFunds(int accountNumber, double balance, double balanceRemoved) {

balance -= balanceRemoved;

        return balance;
    }

    public static void PrintAccountInto(int accountNumber, int routingNumber, double deposit, String FirstName, String LastName) {
        System.out.println("Thanks for signing up with our bank");
        System.out.println("Your account information is as follows");
        System.out.println("Your account number is: " + accountNumber);
        System.out.println("Our routing number is: " + routingNumber);
        System.out.println("Your current balance is: $ " + deposit);
        System.out.println("We charge an overdraft fee of: $ 25.00");
        System.out.println("Thanks, " + FirstName + " " + LastName);

    }

}


//Account number
//Balance
//Minimum balance
//Overdraft fee

//methods needed
//GetBalance
// DepositFunds
// WithdrawFunds
// PrintAccountInfo