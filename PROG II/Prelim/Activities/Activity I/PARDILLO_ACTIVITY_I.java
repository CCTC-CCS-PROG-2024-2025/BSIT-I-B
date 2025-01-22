import java.util.Scanner;
class PARDILLO_ACTIVITY_I{

    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String[] names =new String[5];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter name " + (i + 1) );
            names[i] = sc.nextLine();
        }

        // Ask the user to enter a number to display a name
        System.out.println("Enter a number (1-5) corresponding to the name you want to display: ");
        int number= sc.nextInt();

        System.out.println(names[number-1]);

    }
}