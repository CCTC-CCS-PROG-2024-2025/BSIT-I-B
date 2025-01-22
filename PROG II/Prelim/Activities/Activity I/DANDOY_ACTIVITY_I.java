import java.util.Scanner;

public class DANDOY_ACTIVITY_I {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] names = new String[5];

            for (int i = 0; i < names.length; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }

            System.out.print("Enter a number corresponding to a name (1 to 5): ");
            int index = scanner.nextInt();
            
            if (index >= 1 && index <= 5) {
                System.out.println("Selected name: " + names[index - 1]);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        }
    }
}
