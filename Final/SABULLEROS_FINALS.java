import java.util.Scanner;

public class SABULLEROS_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Declare arrays for student names and grades
        String[] names = new String[numStudents];
        double[] grades = new double[numStudents];

        double totalGrades = 0;
        int passedCount = 0;

        // Collect student information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            System.out.print("Enter name: ");
            names[i] = scanner.next();

            System.out.print("Enter grade: ");
            grades[i] = scanner.nextDouble();

            // Validate grade input
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.print("Invalid grade! Enter a grade between 0 and 100: ");
                grades[i] = scanner.nextDouble();
            }

            totalGrades += grades[i];
            if (grades[i] >= 50) {
                passedCount++;
            }
        }

        // Compute class average
        double average = totalGrades / numStudents;

        // Display results
        System.out.println("\n--- Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i] + "'s Grade: " + grades[i]);
        }

        System.out.printf("\nClass Average: %.2f%n", average);
        System.out.println("Number of Students Passed: " + passedCount);
        System.out.println("Number of Students Failed: " + (numStudents - passedCount));

        scanner.close();
    }
}
