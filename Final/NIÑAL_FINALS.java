import java.util.Scanner;

public class NIÑAL_FINALS {

    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  // Return "Not a Number" if division by zero
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Math Program!");

        // Ask user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask user to select the math operation
        System.out.println("\nSelect an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        // Control flow to execute the correct operation
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }

        scanner.close();  // Close the scanner
    }
}

