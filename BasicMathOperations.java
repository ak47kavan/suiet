import java.util.Scanner;

public class BasicMathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Read user choice
        int choice = scanner.nextInt();

        // Read two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the selected operation
        switch (choice) {
            case 1:
                // Addition
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                // Multiplication
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                // Division
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
