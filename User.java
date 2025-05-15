package OnlineExaminationSystem;

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User(String uname, String pass) {
        this.username = uname;
        this.password = pass;
    }

    public boolean login(String uname, String pass) {
        return this.username.equals(uname) && this.password.equals(pass);
    }

    public void updateProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new username: ");
        username = sc.nextLine();
        System.out.print("Enter new password: ");
        password = sc.nextLine();
        System.out.println("Profile updated successfully!");
    }
}

