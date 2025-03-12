import java.util.Scanner; // Importing Scanner class for user input

public class PALMON_FINALS {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        int numberToGuess = 42; 
        int userGuess = 0; 
        int numberOfTries = 0; 
        

        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); 
           
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the right number!");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

       
        scanner.close();
    }
}
