package DigitalLibraryManagement;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Digital Library");
        System.out.print("Login as (admin/user): ");
        String role = sc.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.print("Enter Admin Password: ");
            String pass = sc.nextLine();
            if (pass.equals("admin123")) {
                Admin.adminMenu(library);
            } else {
                System.out.println("Invalid password.");
            }
        } else if (role.equalsIgnoreCase("user")) {
            User.userMenu(library);
        } else {
            System.out.println("Invalid role.");
        }

        sc.close();
    }
}
