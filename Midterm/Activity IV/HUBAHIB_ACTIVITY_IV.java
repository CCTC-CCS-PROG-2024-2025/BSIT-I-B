import java.util.Scanner;

class HUBAHIB_ACTIVITY_IV{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Factorial number error");
        } else {
            int Factorial = 1;
            for(int i = 1; i<=num; i++){
                Factorial *= i;
            } 
            System.out.println("Factorial of " + num + " = " + Factorial);
            sc.close();
        }
    } 
}