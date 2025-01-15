import java.util.Scanner;
class MAGBANUA_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String [5];
     
        System.out.println("Enter your Desired Name: ");

        for ( int x = 0; x < name.length; x++) {
            System.out.println("Enter name" + " : ");

            name [x] = sc.nextLine();
        }

        System.out.println("You entered a name: ");
        for (int x = 0; x < name.length; x++) {
            System.out.println((x + 1) + ". " + name[x]);
        }
        
     }
}