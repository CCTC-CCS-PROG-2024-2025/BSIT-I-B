import java.util.Scanner;

class PARDILLO_ACTIVITY_VI{
    public static void main (String[]args){
        Scanner shiid = new Scanner (System.in);
        System.out.println("enter the first number:");
        int c =  shiid.nextInt();
        System.out.println("enter the second number:");
        int z =  shiid.nextInt();
        
        int hoy = c + z;
        int hey = c - z;
        int hi = c * z;
        System.out.println(hoy);
        System.out.println(hey);
        System.out.println(hi);
    }
}