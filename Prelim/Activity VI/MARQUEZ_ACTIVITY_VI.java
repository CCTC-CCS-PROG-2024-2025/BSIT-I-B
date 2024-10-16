import java.util.Scanner;

class MARQUEZ_ACTIVITY_VI {

    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        System.out.println("Verify if you're 18+");
        int age = dev.nextInt();
        System.out.println("I know you lied, Try Again");
        int real = dev.nextInt();

        System.out.println(age);
        System.out.println(real);

    }
}