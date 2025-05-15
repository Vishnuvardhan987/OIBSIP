package OnlineExaminationSystem;

import java.util.Scanner;

public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User student = new User("student", "1234");

        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (student.login(uname, pass)) {
            int choice;
            do {
                System.out.println("\n---- Online Examination Menu ----");
                System.out.println("1. Update Profile and Password");
                System.out.println("2. Take Exam");
                System.out.println("3. Logout");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        student.updateProfile();
                        break;
                    case 2:
                        Exam exam = new Exam();
                        exam.start();
                        break;
                    case 3:
                        System.out.println("Logging out...");
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } while (choice != 3);
        } else {
            System.out.println("Invalid login credentials.");
        }

        sc.close();
    }
}

