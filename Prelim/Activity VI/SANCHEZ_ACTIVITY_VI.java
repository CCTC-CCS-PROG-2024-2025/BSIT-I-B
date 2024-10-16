import java.util.Scanner;

class SANCHEZ_ACTIVITY_VI {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1= sc.nextInt();
        System.out.println("Enter your second number");
        int num2= sc.nextInt();

        int sum= num1+num2;
        int diff= num1-num2;
        int prod= num2*num1;
        int qout= num1/num2;



        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(qout);
      }
    }
