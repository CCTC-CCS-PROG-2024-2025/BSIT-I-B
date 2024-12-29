import java.util.Scanner;

public class SAURO_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents;

        // Get the number of students
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        // Initialize variables
        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];
        double totalGrades = 0;
        int passedCount = 0;

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter name: ");
            studentNames[i] = scanner.next();
            System.out.print("Enter grade: ");
            studentGrades[i] = scanner.nextDouble();

            // Validate the grade input
            while (studentGrades[i] < 0 || studentGrades[i] > 100) {
                System.out.print("Invalid grade! Enter a grade between 0 and 100: ");
                studentGrades[i] = scanner.nextDouble();
            }

            totalGrades += studentGrades[i];

            // Check if the student passed
            if (studentGrades[i] >= 50) {
                passedCount++;
            }
        }

        // Calculate average grade
        double averageGrade = totalGrades / numStudents;

        // Display results
        System.out.println("\n--- Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + "'s Grade: " + studentGrades[i]);
        }

        System.out.println("\nClass Average: " + averageGrade);
        System.out.println("Number of Students Passed: " + passedCount);
        System.out.println("Number of Students Failed: " + (numStudents - passedCount));

        // Close the scanner
        scanner.close();
    }
}