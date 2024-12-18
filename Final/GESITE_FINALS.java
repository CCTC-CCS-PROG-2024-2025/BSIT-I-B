import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        // Menu items and prices
        String[] menuItems = {
            "Burger - ₱57.99",
            "Chicken - ₱117.99",
            "Steak - ₱197.49",
            "Salad - ₱47.29",
            "Soda - ₱17.99",
        };
        double[] prices = {57.99, 117.99, 197.49, 47.29, 17.99};
        
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Welcome to the Restaurant!");
        System.out.println("Please choose from the following menu items:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i]);
        }

        // Initialize variables for the order
        double totalPrice = 0.0;
        StringBuilder orderDetails = new StringBuilder();
        boolean ordering = true;

        // The while loop for taking orders continuously until the user opts to finish
        while (ordering) {
            // Ask the user to choose an item
            System.out.print("\nEnter the number of the item you want to order (1-5), or 0 to finish: ");
            int choice = scanner.nextInt();
            
            // Use switch statement to handle the order choices
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    // Valid menu choice, add the item to the order
                    totalPrice += prices[choice - 1];
                    orderDetails.append(menuItems[choice - 1]).append("\n");
                    System.out.println(menuItems[choice - 1] + " added to your order.");
                    break;
                
                case 0:
                    // End the ordering process
                    ordering = false;
                    System.out.println("\nYour order is complete.");
                    break;
                
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            // Optional: check if the total order exceeds ₱300 and give a discount
            if (totalPrice > 300.00 && totalPrice <= 350.00) {  // Example of adding && operator here
                System.out.println("Congratulations! You've earned a 10% discount on your order.");
                totalPrice *= 0.9;  // Apply 10% discount
                break;
            }
        }

        // Display the order summary after finishing the order process
        if (orderDetails.length() > 0) {
            System.out.println("\nYour order:");
            System.out.println(orderDetails.toString());

            // Check if any discount was applied and print the final price
            System.out.println("Total price: ₱" + String.format("%.2f", totalPrice));
        } else {
            System.out.println("No items were ordered.");
        }

        // Adding a loop for a bonus feature: Give a free drink (Soda) on orders of more than ₱200.
        if (totalPrice > 200.00 && totalPrice < 250.00) {  // Example of adding && operator here
            System.out.println("As a bonus, you get a free Soda!");
            totalPrice -= prices[4]; // Deduct the price of Soda as it's free
        }

        // Display final order details after possible bonus
        System.out.println("\nFinal total price after any discounts or bonuses: ₱" + String.format("%.2f", totalPrice));

        scanner.close();
    }
}
