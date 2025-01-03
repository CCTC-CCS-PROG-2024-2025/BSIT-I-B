import java.util.Scanner;


public class BAGATA_FINALS{

    // Global constant and variables for the entire program
    static final double PI = 3.14159; // Example of a constant
    static Scanner scanner = new Scanner(System.in); // Global Scanner for input

    public static void main(String[] args) {
        System.out.println("=== Comprehensive Java Program ===\n");

        // Input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
        
        // Voting eligibility
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        // Primitive types and variables    
        char grade = 'B';         
        boolean isStudent = true;

        // Display values
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is student: " + isStudent);

        
        // Arithmetic operations
        int num1 = 12, num2 = 8;
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + ((double) num1 / num2));

        // Constants
        System.out.println("Value of PI: " + PI);

        

        // Switch case
        System.out.println("\nChoose a drink option (1-4):");
        System.out.println("1. Coffee\n2. Tea\n3. Water\n4. None");
        System.out.println("Inter your chosen drink: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("You chose Coffee.");
            case 2 -> System.out.println("You chose Tea.");
            case 3 -> System.out.println("You chose Water.");
            case 4 -> System.out.println("You chose None.");
            default -> System.out.println("Invalid choice.");
        }

        // Loops
        System.out.println("\nCounting from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Countdown
        System.out.println("Countdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("T-minus " + countdown);
            countdown--;
        }
        System.out.println("Liftoff!");

        // Single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Multi-dimensional array
        String[][] animals = {{"Dog", "Cat"}, {"Bird", "Fish"}, {"Horse", "Sheep"}};
        System.out.println("\nMulti-dimensional Array:");
        for (String[] row : animals) {
            for (String animal : row) {
                System.out.print(animal + " ");
            }
            System.out.println();
        }

        // User input array
        System.out.println("\nEnter 3 numbers: ");
        int[] userNumbers = new int[3];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
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
        BAGATA_FINALS obj = new BAGATA_FINALS();
        obj.displayMessage("This is an instance method!");

        // Method with parameters
        System.out.print("Enter two numbers to multiply: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Multiplication result: " + multiply(a, b));

        // Method returning a value
        System.out.println("The maximum number you entered is: " + findMax(userNumbers));

        // Overloaded methods
        System.out.println("Multiplying 4 and 7: " + multiply(4, 7));
        System.out.println("Multiplying 5.5 and 3.2: " + multiply(5.5, 3.2));

        scanner.close();
    }

    // Static method
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Enjoy the program.");
    }

    // Instance method
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Method with parameters
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Method to find the maximum in an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Overloaded method for multiplication
    public static double multiply(double x, double y) {
        return x * y;
    }
}