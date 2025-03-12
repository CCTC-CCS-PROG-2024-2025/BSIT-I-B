import java.util.Scanner;

public class DANDOY_ACTIVITY_VI {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            int difference = num2 - num1;
            int product = num1 * num2;

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
        }
    }
}

