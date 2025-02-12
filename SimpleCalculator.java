
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        while (continueCalculating) {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square root");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 7) {
                System.out.println("\nExiting calculator...");
                break;
            }

            double num1, num2 = 0, result = 0;

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            if (choice != 6) {
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            switch (choice) {
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 - num2;
                case 3 -> result = num1 * num2;
                case 4 -> {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero not allowed.");
                        continue;
                    }
                }
                case 5 -> {
                    result = 1;
                    for (int i = 0; i < num2; i++) {
                        result *= num1;
                    }
                }
                case 6 -> {
                    if (num1 < 0) {
                        System.out.println("Cannot calculate square root of a negative number.");
                        continue;
                    }
                    result = Math.sqrt(num1);
                }
                default -> {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            System.out.println("\nResult: " + result);
            System.out.println();
        }
        scanner.close();
    }
}
