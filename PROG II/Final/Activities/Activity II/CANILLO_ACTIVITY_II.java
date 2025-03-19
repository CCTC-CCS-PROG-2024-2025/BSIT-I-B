import java.util.Scanner;

class CANILLO_ACTIVITY_II{
    
     static void converToInches(int feet){
     int inches = feet * 12;

     System.out.print("inches:"+ inches);
     
        }

        public static void main(String[] args) {
            Scanner sc =new  Scanner(System.in);
            System.out.print("Enter feet:");
            int feet = sc.nextInt();
            converToInches(feet);
            sc.close();
        }
    }
