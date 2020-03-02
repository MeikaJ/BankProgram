public class Customer {
    String FirstName, LastName;
    Account userAccount;
    Double InitialDeposit;

    //constructor
    Customer(String FirstName, String LastName) {
        //        we need the this. because we are using the same variable name.
        this.FirstName = FirstName;
        this.LastName = LastName;
        userAccount = null;
    }

    public void OpenAccount(int accountNumber, double InitialDeposit) {

        userAccount = new Account(accountNumber, InitialDeposit);

    }

// static doesnt have access to fields declared
    public void CloseAccount() {
        userAccount = null;
        System.out.println("You account has been removed");

    }
}


//First name
//Last name
//Account (Note that the Customer class must contain an account class within the customer class.)


//methods
//OpenAccount
//CloseAccount