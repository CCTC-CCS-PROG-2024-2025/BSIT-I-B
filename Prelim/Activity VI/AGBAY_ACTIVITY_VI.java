            import java.util.Scanner;

class AGBAY_ACTIVITY_VI{

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First Number: ");
    int Age = sc.nextInt();
    System.out.println("Enter The Second Number: ");
    int Sage = sc.nextInt();

    int Sum = Age + Sage;
    int diff = Sage - Age;
    int prod = Age * Sage;

   
    System.out.println(Sum);
    System.out.println(diff);
    System.out.println(prod);


}
}