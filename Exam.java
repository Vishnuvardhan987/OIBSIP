package OnlineExaminationSystem;

import java.util.Scanner;

public class Exam {
    private int score = 0;

    public void start() {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        long duration = 60 * 1000; // 60 seconds timer

        System.out.println("\n*** Exam Started ***");
        System.out.println("You have 60 seconds to complete the test.");

        askQuestion(sc, "Q1: What is the capital of France?\nA) Berlin\nB) Paris\nC) Rome", "B", startTime, duration);
        askQuestion(sc, "Q2: What is 5 + 3?\nA) 8\nB) 9\nC) 7", "A", startTime, duration);
        askQuestion(sc, "Q3: Java is a ___\nA) Database\nB) Operating System\nC) Programming Language", "C", startTime, duration);

        System.out.println("Exam completed! Your score: " + score + "/3");
    }

    private void askQuestion(Scanner sc, String question, String correctAns, long startTime, long duration) {
        if (System.currentTimeMillis() - startTime > duration) {
            System.out.println("Time up! Auto-submitted.");
            return;
        }

        System.out.println(question);
        System.out.print("Your answer (A/B/C): ");
        String ans = sc.nextLine().trim().toUpperCase();

        if (System.currentTimeMillis() - startTime > duration) {
            System.out.println("Time up! Auto-submitted.");
            return;
        }

        if (ans.equals(correctAns)) {
            score++;
        }
    }
}

