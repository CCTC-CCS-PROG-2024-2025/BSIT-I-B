import java.util.Scanner;

public class LUMANGTAD_ACTIVITY_VII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

    }

}