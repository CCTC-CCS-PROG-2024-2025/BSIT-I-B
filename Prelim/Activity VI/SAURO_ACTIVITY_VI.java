import java.util.Scanner;

class SAURO_ACTIVITY_VI {
    public static void main(String[] args){
        Scanner berlat = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = berlat.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = berlat.nextInt();


        int sum = num1 - num2;
        int prod = num2 * num1;
        int diff = num1 - num2;

        System.out.println(sum);
        System.out.println(prod);
        System.out.println(diff);




    }
    
    
}
