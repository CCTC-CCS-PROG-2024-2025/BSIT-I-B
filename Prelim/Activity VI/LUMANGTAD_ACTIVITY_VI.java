import java.util.Scanner;

class LUMANGTAD_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num3 = sc.nextInt();
        System.out.println("Enter the first number: ");
        int num4 = sc.nextInt();

        int sum = num3 + num4;
        int diff = num3 - num4;
        int prod = num3 * num4;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
    }
}