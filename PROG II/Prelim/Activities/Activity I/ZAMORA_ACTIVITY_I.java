import java.util.Scanner;

class ZAMORA_ACTIVITY_1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String [] names = new String [5];

        //Insert
        for (int t = 0; t <= 4; i++) {
            System.out.println ("Insert Name" + (t + 1));
            names [t] = scanner.nextLine();
        }
        //Enter a number
        System.out.println("Enter another number:");
        int num = scanner.nextInt();
        System.out.println(names [num-1]);
    }
}