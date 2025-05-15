package DigitalLibraryManagement;

import java.util.Scanner;

public class User {
    public static void userMenu(Library library) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- User Menu --");
            System.out.println("1. View Books\n2. Issue Book\n3. Return Book\n4. Email Query\n5. Logout");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Query sent to admin@example.com (simulated).");
                    break;
            }
        } while (choice != 5);
    }
}
