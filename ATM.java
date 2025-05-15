package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Interface");

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (BankDatabase.authenticateUser(userId, pin)) {
            ATMOperations operations = new ATMOperations(userId);
            operations.showMenu();
        } else {
            System.out.println("Invalid user ID or PIN. Exiting...");
        }

        sc.close();
    }
}
