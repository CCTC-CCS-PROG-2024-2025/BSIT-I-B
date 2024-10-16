import java.util.Scanner;

class CANILLO_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int age1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int age2 = sc.nextInt();
         
        int sum = age1 + age2;
        int dif = age1 - age2;
        int prod = age1 * age2;

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(prod);

    }
}

    

