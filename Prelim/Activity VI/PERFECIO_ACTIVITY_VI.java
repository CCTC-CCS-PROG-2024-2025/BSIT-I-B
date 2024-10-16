import java.util.Scanner;

class PERFECIO_ACTIVITY_VI {
   public static void main(String[] args) {
    Scanner kitoy = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = kitoy.nextInt();
    System.out.println("Enter the second number");
    int z = kitoy.nextInt();

    int sum = a + z;
    int prod = a - z;
    int diff = a * z;
    System.out.println(sum);
    System.out.println(prod);
    System.out.println(diff);
    
   } 
}

