import javax.swing.*;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;  // 1 to 100
        int attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            String input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Game cancelled.");
                break;
            }

            try {
                int guess = Integer.parseInt(input);
                attempts++;

                if (guess < 1 || guess > 100) {
                    JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 100.");
                } else if (guess < target) {
                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
                } else if (guess > target) {
                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
                } else {
                    guessed = true;
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
            }
        }
    }
}
