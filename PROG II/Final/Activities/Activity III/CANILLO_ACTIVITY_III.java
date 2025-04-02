import java.util.Scanner;

class CANILLO_ACTIVITY_III{
  
    static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temparature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.print(fahrenheit);

    }


}
