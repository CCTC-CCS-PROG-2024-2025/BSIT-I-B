import java.util.Scanner;

public class ENTERO_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("ENTER ATLEAST 5 NAMES:");
        for (int i = 0; i <= 4; i++) {
            System.out.print("ENTER NAME " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        System.out.print("ENTER A NUMBER FROM 1-5: ");
        int index = scanner.nextInt();
        if (index >= 1 && index <= 5) {
            System.out.println("POSITION " + index + " is: " + names[index - 1]);
        } else {
            System.out.println("ENTER A NUMBER FROM 1-5.");
        }

        
    }
}
