import java.util.Scanner;

class MAGBANUA_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        
        System.out.println("Please Enter Five Names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        
        System.out.println("Enter a Number Between 1 to 5 to Display a Name:");
        int index = scanner.nextInt();

        
        if (index >= 1 && index <= 5) {
            System.out.println("The Name at Position " + index + " is: " + names[index - 1]);
        } else {
            System.out.println("Please Enter a Number Between 1 and 5.");
        }

        
    }
}
