import java.util.Scanner;

class ENTERO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter your First number");
        int N1 = sc.nextInt();
        System.out.println("Enter your Second number");
        int N2 = sc.nextInt();

        int sum = N1 + N2;
        int diff = N1 - N2;
        int prod = N1 * N2;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + diff);
        System.out.println("The Product is: " + prod);
        
    }

    
}
