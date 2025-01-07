import java.util.Scanner; // Import Scanner for user input

class PARDILLO_FINAL {
    public static void main(String[] args) {
        // Variables (declared and initialized)
        boolean running = true;
        Scanner scanner = new Scanner(System.in); // Taking user input

        System.out.println("Welcome to the Simple Java Calculator!\n");

        // While Loop to keep the program running until the user decides to exit
        while (running) {
            // Program Structure and User Prompt
            System.out.println("Please select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit\n");

            // Taking user input for the operation
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            // Using a switch statement to handle choices
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    // Taking user input for numbers
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();

                    // Conditionals for checking division by zero
                    if (choice == 4 && num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!\n");
                    } else {
                        // Multiple Conditions to determine operation
                        double result = 0;
                        if (choice == 1) {
                            result = num1 + num2; // Doing Math (Addition)
                        } else if (choice == 2) {
                            result = num1 - num2; // Doing Math (Subtraction)
                        } else if (choice == 3) {
                            result = num1 * num2; // Doing Math (Multiplication)
                        } else {
                            result = num1 / num2; // Doing Math (Division)
                        }

                        // Displaying the result
                        System.out.println("The result is: " + result + "\n");
                    }
                    break;

                case 5:
                    // Exiting the program
                    running = false;
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    break;

                default:
                    // Handling invalid inputs
                    System.out.println("Invalid choice. Please select a valid option (1-5).\n");
            }
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}