public class BasicCalculator {
    public void run() {
        System.out.println("=== Task 1: Basic Calculator ===");
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
