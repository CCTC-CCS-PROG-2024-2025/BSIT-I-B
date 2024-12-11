import java.util.Scanner;

class VILLARO_ACTIVITY_IV {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);

    }
}