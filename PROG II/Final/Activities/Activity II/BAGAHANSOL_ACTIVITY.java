import java.util.Scanner;

public class BAGAHANSOL_ACTIVITY_II {
    public static int feetToInches(int feet){
        return feet * 12;

    }

    public static void main( String[] args) {
        Scanner scanner = new scanner(System.in);

        System.out.print("Enter the number of feet : ");
        int feet = scanner.nextInt() ;

        int inches = feetToInches(feet) ;
        System.out.println("Inches: " + inches);
        
        scanner.close();
        
    }
}