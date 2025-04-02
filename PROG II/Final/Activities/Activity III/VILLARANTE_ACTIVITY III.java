import java.util.Scanner;

public class VILLARANTE_Activity_III {
    
    // Method to convert Celsius to Fahrenheit
    public static double convertToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();
        
        // Call the conversion method
        double fahrenheit = convertToFahrenheit(celsius);
        
        // Display the result
        System.out.println("Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
-