import java.util.Scanner;

class GESITE_ACTIVITY_II {
    public static int convertToInches (int feet){
        return feet * 12;
    }
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the number of feet");
            int feet=sc.nextInt();
            int inches =convertToInches(feet);
            System.out.println("Inches: " +inches);
        
        }
    }
