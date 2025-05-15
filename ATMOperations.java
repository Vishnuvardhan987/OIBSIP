package ATM;

import java.util.Scanner;

public class ATMOperations {
    private double balance = 1000.00;
    private StringBuilder history = new StringBuilder();
    private String userId;
    Scanner sc = new Scanner(System.in);

    public ATMOperations(String userId) {
        this.userId = userId;
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showHistory();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    private void showHistory() {
        System.out.println("Transaction History:");
        System.out.println(history.length() > 0 ? history.toString() : "No transactions yet.");
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.append("Withdrew: ₹").append(amount).append("\n");
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            history.append("Deposited: ₹").append(amount).append("\n");
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void transfer() {
        System.out.print("Enter recipient User ID: ");
        String recipient = sc.next();
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.append("Transferred ₹").append(amount).append(" to ").append(recipient).append("\n");
            System.out.println("Transfer successful to " + recipient);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

