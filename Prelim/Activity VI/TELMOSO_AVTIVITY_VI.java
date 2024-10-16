import java.util.Scanner;

class TELMOSO_ACTIVITY_VI {
    public static void main (String[] args) {
        Scanner kajjo = new Scanner (System.in);
        System.out.println("Enter the first number :");
        int t = kajjo.nextInt();
        System.out.println("Enter the second number: ");
        int a = kajjo.nextInt();

        int sum = t + a;
        int diff = t - a;
        int jo = t * a;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(jo);
    }
}