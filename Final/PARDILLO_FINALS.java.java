import java.util.Scanner;

public class PARDILLO_FINALS {

    // Method to calculate grade based on average score
    public static char calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';  // Excellent
        } else if (averageScore >= 80) {
            return 'B';  // Good
        } else if (averageScore >= 70) {
            return 'C';  // Satisfactory
        } else if (averageScore >= 60) {
            return 'D';  // Passing
        } else {
            return 'F';  // Fail
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Asking for the number of subjects (e.g., Math, Science, English)
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Looping through each student
        for (int student = 1; student <= numStudents; student++) {
            System.out.println("\nEnter scores for Student " + student + ":");

            double totalScore = 0;

            // Looping through each subject
            for (int subject = 1; subject <= numSubjects; subject++) {
                System.out.print("Enter score for subject " + subject + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }

            // Calculating average score for the student
            double averageScore = totalScore / numSubjects;

            // Printing the average score and grade for the student
            System.out.printf("Average score for Student %d: %.2f\n", student, averageScore);
            char grade = calculateGrade(averageScore);
            System.out.println("Grade for Student " + student + ": " + grade);
        }

        scanner.close();
    }
}