import java.util.Scanner;

class BUYTRAGO_ACTIVITY_VI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        int diff = n1 - n2;
        int prod = n1 * n2;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + diff);
        System.out.println("The Product is: " + prod);

    }
}