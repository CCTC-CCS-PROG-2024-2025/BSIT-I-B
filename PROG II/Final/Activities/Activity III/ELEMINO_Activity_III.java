
import java.util.Scanner; // Correcting the import statement

class ELEMINO_Activity_III {

    public static double convertToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Correctly using Scanner

        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();

        double fahrenheit = convertToFahrenheit(celsius);

        System.out.println("Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}