import java.util.Scanner;

class BUYTRAGO_FINALS {
//Topics from (Basic Concepts - Control Flow) but I made it Interactive

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Basic Concepts
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your initial: ");
        char initial = sc.next().charAt(0);
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        System.out.println("Are you cute? (true or false)");
        boolean cute = sc.nextBoolean();
        System.out.println("edi wow");

        System.out.println("Now pick a number between 1-10");
        int a = sc.nextInt();
        System.out.println("Now pick a number between 10-20");
        int b = sc.nextInt();

        int sum =  a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        //If-else Statement
        System.out.println("Do you have a boyfriend/girlfriend? (true or false) ");
        boolean gg = sc.nextBoolean();
        if (gg) {
            System.out.println("edi wow sana all");
        } else {
            System.out.println("okay rana atleast happy");
        }

        //Switch Statement
        System.out.println("What day of the week is it? (1-7) ");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
        }

        // Control Flow: for loop
        System.out.println("Want to see a pyramid? Enter the number of rows you want");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // Control Flow: do-while loop
        System.out.println("Give me an amount, I'll count it down.");
        int countdown = sc.nextInt();

        do { 
            System.out.println(countdown);
            countdown--;
        } while (countdown > 0);


    }
}
