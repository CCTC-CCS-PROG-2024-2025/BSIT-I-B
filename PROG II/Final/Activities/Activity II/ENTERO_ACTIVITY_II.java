import java.util.Scanner;

class ENTERO_ACTIVITY_II {
    static void conversion(double feet){
        double inches = (feet * 12);
        System.out.println(feet + "ft converted to inches is: " + inches + " inches.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the feet:");
        double feet = sc.nextDouble();
        conversion(feet);   
    }
}
    