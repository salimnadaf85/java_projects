package salimn;

import java.util.Scanner;


class Bankaccount {

    private double balance;

    public Bankaccount(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATMa {

    private Scanner scanner;
    private Bankaccount userAccount;

    public ATMa(Bankaccount userAccount) {
        this.userAccount = userAccount;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            display();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance:" + userAccount.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed. Insufficient  invalid amount.");
                    }
                    break;

                case "2":
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    if (userAccount.deposit(depositAmount)) {
                        System.out.println("Deposit successful. Current balance:" + userAccount.checkBalance());
                    } else {
                        System.out.println("Deposit failed. Invalid amount.");
                    }
                    break;

                case "3":
                    System.out.println("Current balance: " + userAccount.checkBalance());
                    break;

                case "4":
                    System.out.println("Exiting ATM. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
public class third {
    public static void main(String[] args) {
        Bankaccount userAccount = new Bankaccount(1000);
        ATMa atm = new ATMa(userAccount);
        atm.run();
    }
}

