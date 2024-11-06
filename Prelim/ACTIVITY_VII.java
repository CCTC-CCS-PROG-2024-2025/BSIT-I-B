import java.util.Scanner;

public class PARDILLO_ACTIVITY_VII{
    public static void main(String[]ars){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter a non-negative integer:");
        int number =scanner.nextlnt();

        int factorial =1;

        for(int i =1;i<=number;i++){
            factorial *=i;
        }

        System.out.println("The factorial of"+number+ "is:"+factorial);
    }
}