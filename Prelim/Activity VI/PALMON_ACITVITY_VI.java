import java.util.Scanner;
/**
 * PALMON_ACITVITY_VI
 */
public class PALMON_ACITVITY_VI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 =sc.nextInt();

    
       int sum = num1 + num2;
       int diff = num1 - num2;
       int pod = num1 * num2;


       System.out.println(sum);
       System.out.println(diff);
       System.out.println(pod);

    }
}