import java.util.Scanner;
class ENTERO_ACTIVITY_I_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String [5];
     
        System.out.println("ENTER YOUR NAME");

        for ( int x = 0; x < name.length; x++) {
            System.out.println("Enter name" + " : ");

            name [x] = sc.nextLine();
        }

        System.out.println("YOU ENTERED THE NAME: ");
        for (int x = 0; x < name.length; x++) {
            System.out.println((x + 1) + ". " + name[x]);
        }
        
     }
}