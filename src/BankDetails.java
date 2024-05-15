public class BankDetails {
    public static void main(String[] args) {
        // Creating an instance of the InnerBankDetails class
        InnerBankDetails account = new InnerBankDetails();

        // Printing the initial account details
        System.out.println(account.AccountName);
        System.out.println(account.AccountID);
        System.out.println(account.AccountBalance);

        // Depositing 600 into the account and printing the updated balance
        System.out.println(account.Deposite(600));
        System.out.println(account.AccountBalance);

        // Withdrawing 700 from the account and printing the updated balance
        System.out.println(account.WithDraw(700));
    }
}

// Class representing bank account details
class InnerBankDetails {
    // Instance variables for account ID, account name, and account balance
    String AccountID = "B22110006115";
    String AccountName = "Muhammad Sarim";
    double AccountBalance = 0;

    // Method to deposit money into the account
    double Deposite(double amount) {
        // Adding the deposited amount to the account balance
        AccountBalance = AccountBalance + amount;
        return AccountBalance; // Returning the updated account balance
    }

    // Method to withdraw money from the account
    double WithDraw(double amount) {
        if (AccountBalance >= amount) {
            // Deducting the withdrawal amount from the account balance
            AccountBalance = AccountBalance - amount;
            return AccountBalance; // Returning the updated account balance
        } else {
            return (0); // Returning 0 if withdrawal amount exceeds account balance
        }
    }

    // Default constructor for InnerBankDetails class
    InnerBankDetails() {
    }

    // Parameterized constructor for InnerBankDetails class
    InnerBankDetails(String aci, String acn, double acb) {
        // Initializing account details with provided values
        AccountName = acn;
        AccountID = aci;
        AccountBalance = acb;
    }
}