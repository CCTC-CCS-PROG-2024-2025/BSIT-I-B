import java.util.Scanner;

public class GRADE_CALCULATOR_BY_ENTERO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("FIRST NAME: ");
        String firstName = sc.nextLine();

        System.out.println("MIDDLE NAME: ");
        String middleName = sc.nextLine();

        System.out.println("SURNAME: ");
        String surName = sc.nextLine();

        System.out.println("Welcome Consolatrixian! " + firstName + " " + middleName + " " + surName + "!\n");

        String[] subjects = {
            "PROGRAMMING", "COMP 1", "HCI", "THEOLOGY", "GE 2", "P.E", "MODERN MATH", "NSTP"
        };
        int[] grades = new int[subjects.length];

        
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("ENTER YOUR GRADE IN " + subjects[i] + ": ");
            grades[i] = sc.nextInt();

            if (grades[i] >= 75) {
                System.out.println(subjectFeedback(subjects[i], true));
            } else {
                System.out.println(subjectFeedback(subjects[i], false));
            }
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        float average = total / (float) subjects.length;

        
        System.out.println("\n--- FINAL RESULTS ---");
        System.out.println("TOTAL POINTS: " + total);
        System.out.println("AVERAGE GRADE: " + average + "%");
    }

    private static String subjectFeedback(String subject, boolean isPassed) {
        if (isPassed) {
            switch (subject) {
                case "PROGRAMMING":
                    return "Excellent! Congratulations!";
                case "COMP 1":
                    return "Congratulations, You did it!";
                case "HCI":
                    return "Great! Keep Designing!";
                case "THEOLOGY":
                    return "Great! Praying.";
                case "GE 2":
                    return "Great! Keep Studying!";
                case "P.E":
                    return "Stay Healthy.";
                case "MODERN MATH":
                    return "Keep it up little Einstein!";
                case "NSTP":
                    return "You're good to go!";
                default:
                    return "Well done!";
            }
        } else {
            switch (subject) {
                case "PROGRAMMING":
                    return "More Study!";
                case "COMP 1":
                    return "Needs improvement!";
                case "HCI":
                    return "Needs more Designing!";
                case "THEOLOGY":
                    return "More Reading!";
                case "GE 2":
                    return "Needs Study!";
                case "P.E":
                    return "More Exercise.";
                case "MODERN MATH":
                    return "Keep Practicing.";
                case "NSTP":
                    return "Needs Community Service.";
                default:
                    return "Keep trying!";
            }
        }
    }
}