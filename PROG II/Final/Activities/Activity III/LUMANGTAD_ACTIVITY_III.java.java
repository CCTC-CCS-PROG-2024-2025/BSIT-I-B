import java.util.Scanner;

public class LUMANGTAD_ACTIVITY_III {
    // Method to convert Celsius to Fahrenheit
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert and display result
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(Fahrenheit);
        
        
    }
}