import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 5;

        System.out.println("=== Task 2: Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }

            int guess = sc.nextInt();

            if (guess == numberToGuess) {
                System.out.println("🎉 Correct! You guessed it!");
                return;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
        }

        System.out.println("Game over! The number was: " + numberToGuess);
    }
}
