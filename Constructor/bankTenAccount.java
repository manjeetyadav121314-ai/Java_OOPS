import java.util.Scanner;

public class bankTenAccount {
    public static void main(String[] args) {

        Account[] account = new Account[10];
        Scanner sc = new Scanner(System.in);

        String name;
        int accountNo;
        float balance;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name : ");
            name = sc.nextLine();

            sc.nextLine();
            System.out.print("Enter Account No : ");
            accountNo = sc.nextInt();

            System.out.print("Enter balance : ");
            balance = sc.nextFloat();

            account[i] = new Account(name, accountNo, balance);
        }
        System.out.println("\n---All Account Details---");
        for (int i = 0; i < 10; i++) {
            account[i].display();
        }
        sc.close();
    }
}

class Account {
    String name;
    int accountNo;
    float balance;

    Account(String name, int accountNo, float balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Your Name : " + name);
        System.out.println("your Account no : " + accountNo);
        System.out.println("you Balance : " + balance);
    }
}