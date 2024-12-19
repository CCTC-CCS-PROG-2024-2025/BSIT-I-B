import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SEDILLO_FINALS{
    public static void main(String[] args) {
        // BIKESHOP INFORMATION
        String bikeshopName = "Welcome to ollidesbikeshop!";
        String bikeshopMotto = "Honk if you love bikes!";
        String location = "Located in Sangi Toledo City, Cebu";

        // SERVICE ITEMS
        String[] serviceItems = {
            "The Crankset - 3,500 pesos",
            "The Handle bar - 599 pesos",
            "The Spokes - 99 pesos",
            "The Saddle - 499 pesos"
        };
        
        int[] serviceItemsPrices = {3,500 , 599, 99, 499};
        
        // DECLARE VARIABLES
        int totalBill = 0;
        int userChoice;
        List<String> orderedItems = new ArrayList<>();
        
        // CREATE A SCANNER FOR USER INPUT
        Scanner scanner = new Scanner(System.in);

        // PRINT THE INFORMATION
        System.out.println(bikeshopName);
        System.out.println(bikeshopMotto);
        System.out.println(location);

        // BIKE SPECIFICATIONS
        System.out.println("The bicycle is a curious vehicle!");
        for (int i = 0; i < serviceItems.length; i++) {
            System.out.println((i + 1) + ". " + serviceItems[i]);
        }
        System.out.println("10. For Exit");

        // USE DO WHILE LOOPS FOR CUSTOMERS TO ORDER MULTIPLE CHOICES
        do {
            System.out.print("Enter the item number to order (or 10 to exit): ");
            userChoice = scanner.nextInt();

            if (userChoice >= 1 && userChoice <= 4) {
                orderedItems.add(serviceItems[userChoice - 1]);
                totalBill +=  serviceItemsPrices[userChoice - 1];
                System.out.printf("You ordered: %s\n", serviceItems[userChoice - 1]);
                System.out.printf("Current Total: %d pesos\n", totalBill);
            } else if (userChoice == 5) {
                System.out.println("Thank you for trusting with us, fellow cyclist!");
            } else {
                System.out.println("Thanks for trusting with us at ollidesbikeshop! Where here to fix your bike!");
            }

        } while (userChoice != 5);

        // CALCULATE DISCOUNT
        double finalTotal = totalBill;
        if (totalBill > 1000) {
            finalTotal *= 0.9; // 30% discount
            System.out.println("A 30% discount has been applied to your order!");
        }

        // DISPLAY ORDER SUMMARY
        System.out.println("\nYour Order Summary:");
        for (String item : orderedItems) {
            System.out.println("- " + item);
        }
        
        // DISPLAY THE FINAL TOTAL
        System.out.printf("Final Total: %.5f pesos\n", finalTotal);
        
        // THANK THE CUSTOMER
        System.out.println("Thank You, Cyclist!");
        System.out.println("Thanks for trusting with us at ollidesbikeshop! Where here to fix your bike!");

        // Close the scanner
        scanner.close();
    }
}