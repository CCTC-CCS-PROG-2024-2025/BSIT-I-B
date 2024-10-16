import java.util.Scanner;

class MAGBANUA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please put your first number hehe: ");
        int number01 = sc.nextInt();
        System.out.println("Please put your second number hehe: ");
       int number02 = sc.nextInt();
       
        int sum = number02 + number01;
        int diff = number01 - number02;
        int prod = number02 * number01;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);


    }
}