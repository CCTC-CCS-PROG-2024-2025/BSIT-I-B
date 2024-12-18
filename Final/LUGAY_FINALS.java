import java.util.Scanner;

class LUGAY_FINALS {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        // ==========================================
        // BASIC CONCEPT
        // ==========================================

        // Getting Started with Java
        System.out.println("Welcome to Java Programming!");

        // Multiple Statements
        System.out.println("This is statement 1.");
        System.out.println("This is statement 2.");

        // Program Structure
        System.out.println("Program Structure Example: class, main method, and statements.");

        // Variables
        int myNumber = 10;
        String myText = "Hello, Java!";
        System.out.println("Number: " + myNumber);
        System.out.println("Text: " + myText);

        // Variable Types
        int integerVar = 25;
        double doubleVar = 3.14;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("Integer: " + integerVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("Boolean: " + boolVar);

        // Doing Math
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Java Comments
        // This is a single-line comment
        /* This is a multi-line comment */
        System.out.println("Comments help explain code but don't affect the program.");

        // ==========================================
        // CONTROL FLOW
        // ==========================================

        Scanner scanner = new Scanner(System.in);

        // Taking User Input
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Conditionals
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Switch Statement
        System.out.print("Choose a number (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose 1.");
                break;
            case 2:
                System.out.println("You chose 2.");
                break;
            case 3:
                System.out.println("You chose 3.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Multiple Conditions
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0 && number <= 10) {
            System.out.println("Number is between 1 and 10.");
        } else if (number > 10 || number < 0) {
            System.out.println("Number is out of range.");
        } else {
            System.out.println("Number is zero.");
        }

        // While Loops
        int counter = 1;
        System.out.println("While Loop Example (Count to 5):");
        while (counter <= 5) {
            System.out.println("Count: " + counter);
            counter++;
        }

        // For Loops
        System.out.println("For Loop Example (Count to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // End of program
        System.out.println("\nProgram execution completed. Thank you!");
        scanner.close();
    }
}
