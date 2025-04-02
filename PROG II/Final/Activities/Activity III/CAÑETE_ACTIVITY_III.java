
import java.util.Scanner;

public class CAÑETE_ACTIVITY_III {

  public static int
  convertToInches(int feet) {
    return feet * 12;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter feet:");
      
      int feet = sc.nextInt();
      int inches = convertToInches(feet);
      System.out.println("Inches: " + inches);

      sc.close();
  }
}

