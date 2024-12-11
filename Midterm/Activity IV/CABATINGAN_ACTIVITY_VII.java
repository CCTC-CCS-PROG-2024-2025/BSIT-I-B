import java.util.Scanner;

public class CABATINGAN_ACTIVITY_VI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number in factorial");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++){
           factorial *= 1;
        }
        System.out.println("The Factorial of  "+ num + " is " + factorial);
    }
}