import java.util.Scanner;

public class PALMON_ACTIVITY_VII {

    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = k.nextInt();
        
        int factorial = 1; 
        
        for (int i = 1; i <= x; i++) {
            factorial *= i; 
        }
        
        System.out.println("Factorial of " + x + " is: " + factorial);
    }
}
