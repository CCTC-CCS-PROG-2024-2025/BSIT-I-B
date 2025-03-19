import java.util.Scanner;

class ZAMORA_ACTIVITY_II {
    public static int FeettoInchesConverter (int feet) {
      return feet *12;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert feet:");
        int feet = sc.nextInt();

        int inches = FeettoInchesConverter(feet);
        System.out.println("Inches:" + inches);

        sc.close();
    }
}