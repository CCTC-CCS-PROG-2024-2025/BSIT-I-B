import java.util.Scanner;

class SALAPI_ACTIVITY_VI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First number: ");
        int n1 =sc.nextInt();
        System.out.println("Enter your Second number");
        int n2 =sc.nextInt();

        int sum = n1 + n2 ;
        int diff = n1 - n2 ;
        int prod = n1 * n2 ;

        System.out.println("The sum is: " + sum);
        System.out.println("The diff is: " + diff);
        System.out.println("The prod is: " + prod);
    }


}
