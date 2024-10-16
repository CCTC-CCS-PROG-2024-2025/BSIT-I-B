import java.util.Scanner;

class BASILISCO_ACTIVITY_VI{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int given1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int given2 = sc.nextInt();

        int sum = given1 + given2;
        int diff = given1 - given2;
        int prod = given1 * given2;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);




    }
}