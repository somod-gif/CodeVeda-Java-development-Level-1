import java.util.Scanner;

public class FactorialRecursion {

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial not defined for negative numbers!");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Task 3: Factorial using Recursion ===");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            System.out.println("Factorial of " + num + " = " + factorial(num));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
