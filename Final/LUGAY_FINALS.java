import java.util.Scanner ;

class LUGAY_FINALS {
    
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Basic Concepts: Variables, Data Types
        System.out.println("=== Grade Calculator ===");

        // Input: Student's name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Input: Scores
        System.out.print("Enter score for Math: ");
        int mathScore = scanner.nextInt();

        System.out.print("Enter score for Science: ");
        int scienceScore = scanner.nextInt();

        System.out.print("Enter score for English: ");
        int englishScore = scanner.nextInt();

        // Control Flow: Decision-Making (if-else)
        int average = calculateAverage(mathScore, scienceScore, englishScore);
        char grade = determineGrade(average);

        // Output Results
        System.out.println("\n=== Results ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Average Score: " + average);
        System.out.println("Grade: " + grade);

        // Control Flow: Loops (for loop example)
        System.out.println("\nDetails:");
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.println("Math Score: " + mathScore);
                    break;
                case 2:
                    System.out.println("Science Score: " + scienceScore);
                    break;
                case 3:
                    System.out.println("English Score: " + englishScore);
                    break;
            }
        }

        // Method example: Say Goodbye
        sayGoodbye();
    }

    // Method: Calculate Average
    public static int calculateAverage(int math, int science, int english) {
        return (math + science + english) / 3;
    }

    // Method: Determine Grade based on average
    public static char determineGrade(int average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method: Goodbye Message
    public static void sayGoodbye() {
        System.out.println("\nThank you for using the Grade Calculator!");
    }
}
