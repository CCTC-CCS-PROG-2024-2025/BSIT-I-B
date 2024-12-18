import java.util.Scanner;

public class SnackShop {
    public static void main(String[] args) {
        // Snack names and prices
        String[] snacks = {"Chips - ₱20.00", "Cookies - ₱35.00", "Soda - ₱15.00", "Candy - ₱10.00"};
        double[] prices = {20.00, 35.00, 15.00, 10.00};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message and menu display
        System.out.println("Welcome to the Snack Shop!");
        System.out.println("Here is our menu:");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println((i + 1) + ". " + snacks[i]);
        }

        // Variables for tracking the order
        double totalPrice = 0.0;
        StringBuilder orderDetails = new StringBuilder();
        boolean ordering = true;

        // Start ordering snacks
        while (ordering) {
            System.out.print("\nEnter the number of the snack you want to buy (1-4), or 0 to finish: ");
            int choice = scanner.nextInt();

            // Use switch statement for handling user choice
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    totalPrice += prices[choice - 1];
                    orderDetails.append(snacks[choice - 1]).append("\n");
                    System.out.println(snacks[choice - 1] + " added to your order.");
                    break;

                case 0:
                    ordering = false;
                    System.out.println("\nThank you for your order!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // Discount feature: Apply a 10% discount for orders over ₱100
            if (totalPrice > 100.00) {
                System.out.println("\nCongratulations! You've earned a 10% discount.");
                totalPrice *= 0.9; // Apply discount
                break; // Exit ordering loop after applying discount
            }
        }

        // Bonus feature: Free candy for orders over ₱50 but under ₱100
        if (totalPrice > 50.00 && totalPrice <= 100.00) {
            System.out.println("\nBonus! You get a free Candy!");
            orderDetails.append("Candy - ₱0.00 (Bonus)\n");
        }

        // Display order summary
        if (orderDetails.length() > 0) {
            System.out.println("\nYour order:");
            System.out.println(orderDetails.toString());
            System.out.printf("Total price: ₱%.2f\n", totalPrice);
        } else {
            System.out.println("No items were ordered.");
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }
}
