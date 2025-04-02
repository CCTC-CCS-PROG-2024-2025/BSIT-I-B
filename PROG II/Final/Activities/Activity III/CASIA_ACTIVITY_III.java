import java.util.Scanner;

public class CASIA_ACTIVITY_III {

    public static double convertCelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        
        double fahrenheit = convertCelsiusToFahrenheit();
        
       
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}