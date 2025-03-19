
import java.util.Scanner;
public class VILLARO_ACTIVITY_II {
    static void conversion(double feet, double inches) {
        double conversion = (feet * 12);
        conversion = inches;
        System.out.println (feet + "ft converted to inches is: " inches);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Feet");
        double feet = sc.nextDouble();
        conversion( double feet, double inches);
    }
}
