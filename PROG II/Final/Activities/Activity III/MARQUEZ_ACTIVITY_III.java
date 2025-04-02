import java.util.Scanner;

class MARQUEZ_ACTIVITY_III{

    static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input The Temperature In Celsius");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit);
    }

}