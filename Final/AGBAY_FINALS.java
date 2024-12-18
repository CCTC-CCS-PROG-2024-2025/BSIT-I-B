import java.util.Scanner;

public class AGBAY_FINALS {

    // Global constant and variables for the entire program
    static final double PI = 3.14159; // Example of a constant
    static Scanner scanner = new Scanner(System.in); // Global Scanner for input

    public static void main(String[] args) {
        System.out.println("=== Comprehensive Java Program ===\n");

        // Primitive types and variables
        int age = 25;             // Integer type
        double height = 5.9;      // Double type
        char grade = 'A';         // Character type
        boolean isStudent = true; // Boolean type

        // Display values
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is student: " + isStudent);

        // Input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // String input
        System.out.println("Welcome, " + name + "!");

        // Type conversion
        int roundedHeight = (int) height; // Explicit casting
        System.out.println("Rounded Height (int): " + roundedHeight);

        // Arithmetic operations
        int num1 = 15, num2 = 7;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Casting to ensure division works properly

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Constants
        System.out.println("Value of PI: " + PI);

        // Example: Determine eligibility to vote
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        if (userAge >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Switch case example: Select a meal
        System.out.println("\nChoose a meal option (1-3):");
        System.out.println("1. Burger\n2. Pizza\n3. Salad");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose Burger.");
                break;
            case 2:
                System.out.println("You chose Pizza.");
                break;
            case 3:
                System.out.println("You chose Salad.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Loops: Print numbers from 1 to 10
        System.out.println("\nCounting from 1 to 10 using loops:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop: Countdown
        System.out.println("Countdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("T-minus " + countdown);
            countdown--;
        }
        System.out.println("Liftoff!");

        // Single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements (Single-dimensional):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Multi-dimensional array
        String[][] students = {
            {"Alice", "Bob"},
            {"Charlie", "Diana"},
            {"Eve", "Frank"}
        };

        System.out.println("\nMulti-dimensional Array (Student Names):");
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }

        // Array input example
        System.out.println("\nEnter 5 numbers to populate an array:");
        int[] userNumbers = new int[5];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int num : userNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Static method call
        greetUser(name);

        // Instance method call
        AGBAY_FINALS obj = new AGBAY_FINALS();
        obj.displayMessage("Instance Method Example!");

        // Method with parameters
        System.out.print("\nEnter two numbers to add: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int additionResult = add(a, b);
        System.out.println("Addition result: " + additionResult);

        // Method returning a value
        int maxNumber = findMax(userNumbers);
        System.out.println("The maximum number in your array is: " + maxNumber);

        // Overloaded methods
        System.out.println("Multiplying 5 and 3: " + multiply(5, 3));
        System.out.println("Multiplying 4.5 and 2.2: " + multiply(4.5, 2.2));

        // Closing the scanner
        scanner.close();
    }

    // Static method
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to the Java program.");
    }

    // Instance method
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Method with parameters and return value
    public static int add(int x, int y) {
        return x + y;
    }

    // Method to find the maximum number in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Overloaded method for multiplication (int version)
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method for multiplication (double version)
    public static double multiply(double a, double b) {
        return a * b;
    }
}
