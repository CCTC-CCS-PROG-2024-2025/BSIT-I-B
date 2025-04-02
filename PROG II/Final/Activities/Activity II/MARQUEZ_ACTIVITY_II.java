import java.util.Scanner;

class MARQUEZ_ACTIVITY_II{

static void convertToInches(int feet){
    int inches = feet * 12;

    System.out.println("inches" + inches);

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Feet");
    int feet = sc.nextInt();
    convertToInches(feet);
    sc.close();

    }
}