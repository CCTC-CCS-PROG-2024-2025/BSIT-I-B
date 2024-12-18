import java.util.Scanner;

public class DELATOR_FINALS {
    public static void main(String[] args) {
        
        // 1. Key Concepts - Variables, Data Types, and Output
        System.out.println("Welcome to Introduction to Java!");

        // Declaring and initializing variables of different types
        int age = 25;
        double salary = 50000.75;
        boolean isJavaFun = true;
        char grade = 'A';
        String message = "Java Programming";

        // Displaying the values of these variables
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);

        // 2. Using Arithmetic Operators
        int num1 = 10, num2 = 5;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // 3. Conditional Statements (if-else)
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // 4. Switch Statement Example
        int day = 3;  // 1=Sunday, 2=Monday, 3=Tuesday, ...
        switch (day) {
            case 1:
                System.out.println("It's Sunday.");
                break;
            case 2:
                System.out.println("It's Monday.");
                break;
            case 3:
                System.out.println("It's Tuesday.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }

        // 5. Loops - For Loop
        System.out.println("\nPrinting numbers from 1 to 5 using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 6. For Loop with a Sum
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // Add each number to the sum
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}