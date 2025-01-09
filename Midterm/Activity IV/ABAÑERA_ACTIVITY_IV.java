import java.util.Scanner;

class ABANERA_ACTIVITY_IV{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a non-negative integer: ");

        int nni = sc.nextInt();
        //nni = non-negative integer

        if (nni < 0){
            System.out.println("Please Enter a non-negative integer. ");
         } else {
            int factorial = 1;

            for(int i = 1; i <= nni; i++ ){
                factorial *= i;

            }

            System.out.println("The Factorial of " + nni +"is: " + factorial);
        }


    }
}