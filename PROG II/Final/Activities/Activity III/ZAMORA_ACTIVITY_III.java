import java.util.Scanner;

class ZAMORA_ACTIVITY_III {
    public static double ConvertToFahrenheit(int celsius) {
        return(celsius*9.0/5) +32;
    }
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius: ");
        int celsius = scanner.nextInt();
        double fahrenheit = ConvertToFahrenheit(celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}