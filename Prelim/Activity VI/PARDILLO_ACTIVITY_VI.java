import java.util.Scanner;

class PARDILLO_ACTIVITY_VI {
    public static void main(String[] args){
        Scanner cj = new Scanner(System.in);
        System.out.println("Enter the first number");
        int d = cj.nextInt();
        System.out.println("Enter the second number");
        int e = cj.nextInt();

        int sum = d + e;
        int diff = d - e;
        int prod = d * e;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
    }
}
