import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Student Details
        String studentName = "SUNDY LEB DAAN"; // Student's name
        String birthDate = "AUGUST 21, 2005"; // Student's birthdate
        int studentID = 20242046; // Student's ID

        // Displaying Student Information
        System.out.println("Student Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Birthdate: " + birthDate);
        System.out.println("Student ID: " + studentID);
        System.out.println("----------------------------------");

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        // Main loop for the calculator
        while (continueCalculation) {
            // Variables to store numbers and operation
            double num1, num2, result = 0;
            char operation;

            // Taking input from the user
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /, %): ");
            operation = scanner.next().charAt(0);

            // Switch statement for operation selection
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            // Display the result
            System.out.println("Result: " + result);

            // Conditional statement to check positive or negative result
            if (result > 0) {
                System.out.println("The result is positive.");
            } else if (result < 0) {
                System.out.println("The result is negative.");
            } else {
                System.out.println("The result is zero.");
            }

            // Asking the user if they want to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userChoice = scanner.next();
            if (!userChoice.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }
        }

        // Using a for loop to display numbers from 1 to 10
        System.out.println("\nNumbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Final message
        System.out.println("\nThank you for using the calculator!");
        System.out.println("Program created by " + studentName + ", ID: " + studentID);
        scanner.close();
    }
}
