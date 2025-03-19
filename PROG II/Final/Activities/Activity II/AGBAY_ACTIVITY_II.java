import java.util.Scanner;

public class AGBAY_ACTIVITY_II {
   static void double convertToDouble(double feet){
    return feet * 12;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number in feet: ");
    double feet = sc.nextDouble();

    double inches = convertToDouble(feet);

    System.out.println(feet + " feet is equal to " + inches + " inches.");
    scanner.close();
   }
}




