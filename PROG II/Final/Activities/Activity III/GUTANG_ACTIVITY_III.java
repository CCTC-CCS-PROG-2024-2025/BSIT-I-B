import java.util.Scanner;

public class GUTANG_ACTIVITY_III {
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = convertToFahrenheit(celsius);

    System.out.println("Fahrenheit: " + fahrenheit);
    
    scanner.close();

    }

}