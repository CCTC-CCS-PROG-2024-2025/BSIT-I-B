import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's score (0-100): ");
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Please enter a score between 0 and 100.");
        } else {
            
            char grade;
            String result;

            if (score >= 90) {
                grade = 'A';
                result = "Passed";
            } else if (score >= 80) {
                grade = 'A';
                result = "Passed";
            } else if (score >= 75) {
                grade = 'B';
                result = "Passed";
            } else if (score >= 70) {
                grade = 'C';
                result = "Passed";
            } else if (score >= 60) {
                grade = 'D';
                result = "Failed";
            } else {
                grade = 'F';
                result = "Failed";
            }

            System.out.println("For a score of " + score + ", your grade is '" + grade + "'. Result: " + result + ".");
        }

    }
}
