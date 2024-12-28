import java.util.ArrayList;
import java.util.Scanner;
//ShopLi program
public class BUYTRAGO_FINALS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "", password = "", loginUsername, loginPassword;

        System.out.println("Welcome to ShopLi - Your Online Shopping App!");
        showLoadingScreen("Initializing", 2);

        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Create a password: ");
        password = scanner.nextLine();
        showLoadingScreen("Signing up", 2);
        System.out.println("Sign up successful!");

        System.out.print("Enter your username: ");
        loginUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        loginPassword = scanner.nextLine();
        
        if (!loginUsername.equals(username) || !loginPassword.equals(password)) {
            System.out.println("Invalid login credentials.");
            scanner.close();
            return;
        }
        System.out.println("Login successful!");
        showLoadingScreen("Loading categories", 2);

        ArrayList<String> cart = new ArrayList<>();
        double totalPrice = 0.0;

        while (true) {
            System.out.println("Select a category:");
            System.out.println("1. Food & Drinks");
            System.out.println("2. Fashion");
            System.out.println("3. Electronics");
            System.out.println("4. Groceries");
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();

            switch (categoryChoice) {
                case 1:
                    showLoadingScreen("Loading Food & Drinks", 2);
                    totalPrice += selectItems(scanner, cart, "Food & Drinks", new String[]{
                            "Pizza - $15.99", "Burger - $8.49", "Soda - $2.49"});
                    break;
                case 2:
                    showLoadingScreen("Loading Fashion", 2);
                    totalPrice += selectItems(scanner, cart, "Fashion", new String[]{
                            "T-shirt - $12.99", "Jeans - $29.99", "Jacket - $49.99"});
                    break;
                case 3:
                    showLoadingScreen("Loading Electronics", 2);
                    totalPrice += selectItems(scanner, cart, "Electronics", new String[]{
                            "Headphones - $59.99", "Smartphone - $299.99", "Smartwatch - $199.99"});
                    break;
                case 4:
                    showLoadingScreen("Loading Groceries", 2);
                    totalPrice += selectItems(scanner, cart, "Groceries", new String[]{
                            "Milk - $1.99", "Bread - $2.49", "Eggs - $3.49"});
                    break;
                case 5:
                    showLoadingScreen("Calculating cart", 2);
                    viewCart(scanner, cart, totalPrice);
                    break;
                case 6:
                    checkout(scanner, totalPrice);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void showLoadingScreen(String task, int seconds) {
        System.out.print(task + "...");
        for (int i = 0; i < seconds; i++) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static double selectItems(Scanner scanner, ArrayList<String> cart, String category, String[] items) {
        double categoryTotal = 0.0;
        while (true) {
            System.out.println("Select an item to add to your cart (or type 'back' to go back):");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i]);
            }
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("back")) {
                break;
            }
            try {
                int itemChoice = Integer.parseInt(choice);
                if (itemChoice >= 1 && itemChoice <= items.length) {
                    String selectedItem = items[itemChoice - 1];
                    cart.add(selectedItem);
                    System.out.println("You added " + selectedItem + " to your cart.");
                    categoryTotal += getPriceFromItem(selectedItem);
                } else {
                    System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
        return categoryTotal;
    }

    public static double getPriceFromItem(String item) {
        return Double.parseDouble(item.split(" - ")[1].substring(1));
    }

    public static void viewCart(Scanner scanner, ArrayList<String> cart, double totalPrice) {
        while (true) {
            System.out.println("Your Cart:");
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty.");
            } else {
                for (String item : cart) {
                    System.out.println(item);
                }
            }
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Type 'back' to return to categories.");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("back")) {
                break;
            }
        }
    }

    public static void checkout(Scanner scanner, double totalPrice) {
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Would you like to pay via:");
        System.out.println("1. Cash on Delivery");
        System.out.println("2. Pay Online");
        int paymentChoice = scanner.nextInt();
        if (paymentChoice == 1) {
            System.out.println("You selected Cash on Delivery.");
        } else if (paymentChoice == 2) {
            System.out.println("You selected Pay Online. Payment is processing...");
            showLoadingScreen("Processing payment", 2);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Invalid payment choice.");
        }
    }
}
