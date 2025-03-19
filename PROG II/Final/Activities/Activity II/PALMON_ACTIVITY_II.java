import java.util.Scanner;
class PALMON_ACTIVITY_II{
    static void convertToInches(int feet){
        int inches = feet * 12;
        System.out.println("The height in inches is: " + inches);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in feet: ");
        int feet = sc.nextInt();
        System.out.println ("The height in feet is: " + feet);
        convertToInches(feet);
    }
}   