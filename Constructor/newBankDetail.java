import java.util.Scanner;

class BankDeatil {

    private String accountNo;
    private String name;
    private double balance;

    BankDeatil(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
    }

    public String get_Account_No() {
        return accountNo;
    }

    public String get_Name() {
        return name;
    }

    public double get_Balance() {
        return balance;
    }

    public void deposit(double amount) {
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

public class newBankDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Account Number : ");
        String accountNo = sc.nextLine();

        System.out.print("Enter the account holder name : ");
        String name = sc.nextLine();

        BankDeatil account = new BankDeatil(accountNo, name);

        System.out.print("\nEnter the deposit amount : ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);

        System.out.println("\nAccount number : " + account.get_Account_No());
        System.out.println("Account holder name : " + account.get_Name());
        System.out.println("Balance : " + account.get_Balance());

        System.out.print(" \nEnter the withdrowal amount : ");
        double withdrowalAmount = sc.nextDouble();

        boolean result = account.withdrow(withdrowalAmount);
        if (result) {
            System.out.println("\nWithdrowal successful.");
        } else {
            System.out.println("Insuficient Balance.");
        }
        System.out.println("Final balance : " + account.get_Balance());

        sc.close();
    }
}
