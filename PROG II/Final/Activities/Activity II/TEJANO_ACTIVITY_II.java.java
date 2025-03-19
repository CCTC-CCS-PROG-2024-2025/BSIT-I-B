import java.util.Scanner;

public class FeetToInchesConverter {
    // Method to convert feet to inches
    public static int convertToInches(int feet) {
        return feet * 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of feet: ");
        int feet = scanner.nextInt();

        // Convert and display result
        int inches = convertToInches(feet);
        System.out.println("Inches: " + inches);

        scanner.close();
    }
}

