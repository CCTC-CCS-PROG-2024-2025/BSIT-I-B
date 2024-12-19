import java.util.Scanner;

public class BAGAHANSOL_FINALS {

    // Main method: Entry point of the Java program
    public static void main(String[] args) {
        // 1. Printing to the console
        System.out.println("Welcome to Java Programming!");
        System.out.println("This is your first Java program!");

        // 2. Variable declarations and data types
        String name = "Java Learner";  // Text data
        int age = 18;                 // Whole number
        double score = 95.5;          // Decimal number
        boolean isBeginner = true;    // Boolean (true/false)

        // Display variables
        System.out.println("\nHere are some variables:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Is Beginner? " + isBeginner);

        // 3. Using conditional statements
        System.out.println("\nConditional Statements:");
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are still a minor.");
        }

        // 4. Loops in Java (Example: For Loop)
        System.out.println("\nCounting from 1 to 5 using a loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // 5. Custom method call
        System.out.println("\nCalling a custom method:");
        greet(name);
    }

    // A custom method to display a greeting
    public static void greet(String personName) {
        System.out.println("Hello, " + personName + "! Welcome to Java.");
    }
}