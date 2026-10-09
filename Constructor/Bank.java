import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        int accountNo;
        String name;
        float balance;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        name = sc.nextLine();

        System.out.print("Enter the Account number : ");
        accountNo = sc.nextInt();

        System.out.print("Enter the balance : ");
        balance = sc.nextFloat();

        Account ac = new Account(accountNo, name, balance);

        ac.display();
        sc.close();

    }
}

class Account {

    int accountNo;
    String name;
    float balance;

    Account(int accountNo, String name, float balamce) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balamce;
    }

    public void display() {
        System.out.println("Your account number : " + accountNo);
        System.out.println("Your name : " + name);
        System.out.println("your bank balance : " + balance);
    }

}
