import java.util.Scanner;

public class MAGBANUA_ACTIVITY_II {
    
    static void conversion(double feet, double inches) {
       
        double totalInches = (feet * 12) + inches;
        System.out.println(feet + "ft and " + inches + "in converted to inches is: " + totalInches);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter the feet:");
        double feet = sc.nextDouble();
        
        
        System.out.println("Enter the inches:");
        double inches = sc.nextDouble();
        
        
        conversion(feet, inches);
    }
}
