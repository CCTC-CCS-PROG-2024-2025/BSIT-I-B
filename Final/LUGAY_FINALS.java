import java.util.Scanner;

public class SnackShop {
    public static void main(String[] args) {
        // Snack names and prices
        String[] snacks = {"Chips", "Cookies", "Soda", "Candy"};
        double[] prices = {20.0, 35.0, 15.0, 10.0};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message and menu display
        System.out.println("Welcome to the Snack Shop!");
        System.out.println("Here is our menu:");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println((i + 1) + ". " + snacks[i] + " - ₱" + prices[i]);
        }

        // Variables to keep track of total price
        double totalPrice = 0;
        boolean ordering = true;

        // Start ordering snacks
        while (ordering) {
            System.out.print("\nEnter the number of the snack you want to buy (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= snacks.length) {
                totalPrice += prices[choice - 1];
                System.out.println(snacks[choice - 1] + " added to your order.");
            } else if (choice == 0) {
                ordering = false; // Exit the loop
                System.out.println("Thank you for your order!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Display the total price
        System.out.printf("Your total bill is: ₱%.2f\n", totalPrice);
        System.out.println("Have a nice day!");

        scanner.close();
    }
}
