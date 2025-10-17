import java.util.Scanner;

public class CodvedaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        NumberGuessingGame game = new NumberGuessingGame();
        FactorialRecursion factorial = new FactorialRecursion();

        int choice;
        do {
            System.out.println("\n=== Codveda Java Internship Main Menu ===");
            System.out.println("1. Task 1 - Basic Calculator");
            System.out.println("2. Task 2 - Number Guessing Game");
            System.out.println("3. Task 3 - Factorial using Recursion");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter 1-4.");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculator.run();
                    break;
                case 2:
                    game.run();
                    break;
                case 3:
                    factorial.run();
                    break;
                case 4:
                    System.out.println("Exiting program... Thank you for exploring Codveda tasks!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
