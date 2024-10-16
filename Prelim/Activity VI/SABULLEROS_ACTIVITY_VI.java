import java.util.Scanner;

public class SABULLEROS_ACTIVITY_VI {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
       int num1 = input.nextInt();
       System.out.println("Enter The second Number: ");
       int num2 = input.nextInt();

       int sum = num1 + num2;
       int diff;
       if (num1 > num2) {
        diff = num1 - num2;
       }
       else {
        diff = num2 - num1;

       }
       int prod = num1 * num2;

       System.out.println("Sum = "+ sum);
       System.out.println("different ="+ diff);
       System.out.println("Product ="+ prod);

     }
}
    