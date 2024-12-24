import java.util.Scanner;

public class SANCHEZ_FINALS {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        // Validate the input
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else {
            // Determine the grade using control flow
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the grade
            System.out.println("The student's grade is: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
