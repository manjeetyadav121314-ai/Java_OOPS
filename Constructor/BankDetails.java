import java.util.Scanner;

class Bank_Account {

    private String accountNumber;
    private String accountName;
    private double balance;

    public Bank_Account(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 1000;
    }

    public String get_Account_Number() {
        return accountNumber;
    }

    public String get_Account_Name() {
        return accountName;
    }

    public double get_Balance() {
        return balance;
    }

    public void deposite(double amount) {
        balance = balance + amount;
    }

    public boolean withdrow(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account Number : ");
        String accountNo = sc.nextLine();

        System.out.print("Enter the account holder name : ");
        String name = sc.nextLine();

        Bank_Account account = new Bank_Account(accountNo, name);

        System.out.print("Enter the deposit amount : ");
        double amount = sc.nextDouble();

        account.deposite(amount);

        System.out.println("\nAccount Number : " + account.get_Account_Number());
        System.out.println("Account Holder Name : " + account.get_Account_Name());
        System.out.println("Balance : " + account.get_Balance());

        System.out.print("\nEnter the withdrow amount : ");
        double withdrowAmount = sc.nextDouble();

        boolean result = account.withdrow(withdrowAmount);
        if (result) {
            System.out.println("\nWithdrowal Successful.");
        } else {
            System.out.println("Insuficient balance.");
        }

        System.out.println("Final Balance : " + account.get_Balance());

        sc.close();

    }
}
