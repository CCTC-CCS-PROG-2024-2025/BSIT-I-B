import.java.util.Scanner;

class DELATOR_ACTIVITY_II {
    public static void convertToInches(int feet) {
        return feet * 12;
    } 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet: ");
        int feet = scanner.nectInt();

        int inches = convertToInches(feet);
        System.out.println("Inches: "+ inches);

        scanner.close();
    }
}