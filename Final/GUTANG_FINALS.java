import java.util.Scanner;

public class GUTANG_FINALS {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Ask the user what operation they want to perform
        System.out.println("Choose an operation:");
        System.out.println("1. Calculate factorial");
        System.out.println("2. Check if prime");
        int choice = scanner.nextInt();

        // Control flow using if-else and switch statements
        if (choice == 1) {
            // Calculate the factorial
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        } else if (choice == 2) {
            // Check if the number is prime
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            // Print whether the number is prime or not
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
