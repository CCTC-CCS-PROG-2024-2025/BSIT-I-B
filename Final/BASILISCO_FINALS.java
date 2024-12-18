import java.util.Scanner;

public class BASILISCO_FINALS {

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop to allow entering multiple student grades
        while (true) {
            // Ask for student name
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            
            // Ask for student score
            System.out.print("Enter score for " + studentName + ": ");
            int score = scanner.nextInt();
            scanner.nextLine();  
            
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
            } else {
                String grade = calculateGrade(score);
                System.out.println(studentName + "'s grade: " + grade);
            }

            // Ask if user wants to enter another student's grade
            System.out.print("Do you want to enter another student? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;  
            }
        }
        scanner.close();
        System.out.println("Grade program ended.");
    }
}

