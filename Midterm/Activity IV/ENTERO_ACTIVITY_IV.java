import java.util.Scanner;

class ENTERO_ACTIVITY_IV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a non-negative integer: ");

        int nni = sc.nextInt() ;
        
        if (nni < 0){
            System.out.println("Please Enter a non-negative integer: ");
          } else {
            int factorial = 1;

            for (int i = 1; i <= nni; i++ ){
                factorial *= i;
            }
          System.out.println("The factorial of " + nni + " is: " + factorial);
        }
    }
}