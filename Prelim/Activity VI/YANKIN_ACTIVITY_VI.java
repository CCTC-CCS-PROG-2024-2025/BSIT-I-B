import java.util.Scanner;

public class YANKIN_ACTIVITY_VI{
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1 = sc.nextLine();
    System.out.println("Enter the second number:");
    System.out.println("Enter the second number;");
    int num2 = sc.nextLine();  

    int sum = num1 + num2;
    int diff= num1 - num2;
    int proud= num1 * num2;
    int qout= num1/ num2;

    System.out.println(sum);
    System.out.println(diff);
    System.out.println(proud);
    System.out.println(qout);
    

       
    }
}