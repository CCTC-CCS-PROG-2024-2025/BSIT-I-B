import java.util.Scanner;

class MAGBANUA_FINALS {
    public static void main(String[] args) {
        // RESTAURANT INFORMATION
        String RestaurantName = "Welcome to MysticalFood!";
        String RestaurantMotto = "Where Every Bite Casts a Spell!";
        String location = "Located in 645 Hinulawan Street Toledo City, Cebu";
         
        // DECLARE VARIABLES
        int totalBill = 0;
        int UserChoice;
         
        // CREATE A SCANNER FOR USER INPUT
        Scanner scanner = new Scanner(System.in);

        // PRINT THE INFORMATION
        System.out.println(RestaurantName);
        System.out.println(RestaurantMotto);
        System.out.println(location);

        // PRINT THE FOOD MENU
        String intro = "Choose the Hogwarts finest meal of all!"; 
        String Pizza = "1. The Sorting Pizza: 499 pesos";
        String Burger = "2. The Gryffindor Chicken Burger: 299 pesos";
        String Fries = "3. The Golden Fries: 99 pesos";
        String FriedChicken = "4. Hagrid's Crispy Fried Chicken: 399 pesos";
        String exit = "5. For Exit";

        System.out.println(intro);
        System.out.println(Pizza);
        System.out.println(Burger);
        System.out.println(Fries);
        System.out.println(FriedChicken);
        System.out.println(exit);

        // USE DO WHILE LOOPS FOR CUSTOMERS TO ORDER MULTIPLE CHOICES
        do {
            System.out.print("Enter the item number to order (or 5 to exit): ");
            UserChoice = scanner.nextInt();

            switch (UserChoice) {
                case 1:
                    System.out.println("The Sorting Pizza!");
                    totalBill += 499;
                    break;
                case 2:
                    System.out.println("You ordered The Gryffindor Chicken Burger!");
                    totalBill += 299;
                    break;
                case 3:
                    System.out.println("You ordered The Golden Fries!");
                    totalBill += 99;
                    break;
                case 4:
                    System.out.println("You ordered Hagrid's Crispy Fried Chicken!");
                    totalBill += 399;
                    break;
                case 5:
                    System.out.println("Thank you for dining with us, fellow wizard!");
                    break;
                default:
                    System.out.println("Invalid spell! Please select a valid menu item.");
            }

            // DISPLAY THE CURRENT TOTAL BILL
            if (UserChoice >= 1 && UserChoice <= 4) {
                System.out.printf("Current Total: %d\n", totalBill);
            }

        } while (UserChoice != 5);  

        // CALCULATE AND DISPLAY THE FINAL TOTAL
        double finalTotal = totalBill;
        System.out.printf("Final Total: %.2f\n", finalTotal);
        
        // USE FOR LOOPS TO THANK THE CUSTOMER
        System.out.println("Thank You Wizard!");
        for (int i = 0; i < 1; i++) {
            System.out.println("Thanks for dining with us at MysticalWizard! Where wizards succumbs to the delicious food spells! ");
        }

        
        
    }
}
