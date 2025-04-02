import java.util.Scanner;

public class SABULLEROS_ACTIVITY_III {

    public static double convertToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();

        double fahrenheit = convertToFahrenheit(celsius);

        System.out.println("Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}