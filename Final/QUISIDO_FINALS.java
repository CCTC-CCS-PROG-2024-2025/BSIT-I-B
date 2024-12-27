import java.util.Scanner;

public class QUISIDO_FINALS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Math Quiz!");

        // Initialize score
        int score = 0;

        // Question 1: Addition
        System.out.println("Question 1: What is 7 + 5?");
        System.out.println("1. 10");
        System.out.println("2. 11");
        System.out.println("3. 12");
        System.out.println("4. 13");
        System.out.print("Your answer (1/2/3/4): ");
        int answer1 = scanner.nextInt();

        if (answer1 == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is 12.");
        }

        // Question 2: Subtraction
        System.out.println("Question 2: What is 15 - 9?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.println("4. 8");
        System.out.print("Your answer (1/2/3/4): ");
        int answer2 = scanner.nextInt();

        if (answer2 == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is 6.");
        }

        // Question 3: Multiplication
        System.out.println("Question 3: What is 6 * 4?");
        System.out.println("1. 20");
        System.out.println("2. 22");
        System.out.println("3. 24");
        System.out.println("4. 28");
        System.out.print("Your answer (1/2/3/4): ");
        int answer3 = scanner.nextInt();

        if (answer3 == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is 24.");
        }

        // Question 4: Division
        System.out.println("Question 4: What is 16 / 4?");
        System.out.println("1. 3");
        System.out.println("2. 4");
        System.out.println("3. 5");
        System.out.println("4. 6");
        System.out.print("Your answer (1/2/3/4): ");
        int answer4 = scanner.nextInt();

        if (answer4 == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is 4.");
        }

        // Display final score
        System.out.println("Quiz finished! Your total score is: " + score + " out of 4.");

        // Close the scanner
        scanner.close();
    }
}

