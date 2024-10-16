import java.util.Scanner;

class SEDILLO_ACTIVITY_VI {
     public static void main(String[] args){
        Scanner jave = new Scanner(System.in);
        System.out.println("Enter the first number");
        int d = jave.nextInt();
        System.out.println("Enter the first number");
        int e = jave.nextInt();

        int sum = d + e;
        int diff = d - e;
        int prod = d * e;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
    } 
}
