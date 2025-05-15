package DigitalLibraryManagement;

import java.util.Scanner;

public class Admin {
    public static void adminMenu(Library library) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n-- Admin Menu --");
            System.out.println("1. Add Book\n2. Delete Book\n3. View Books\n4. Logout");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int id = sc.nextInt();
                    library.removeBook(id);
                    break;
                case 3:
                    library.showAllBooks();
                    break;
            }
        } while (choice != 4);
    }
}

