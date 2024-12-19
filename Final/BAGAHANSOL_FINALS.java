import java.util.Scanner;

public class BAGAHANSOL_FINALS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator!");
        System.out.println("Choose a shape to calculate its area:");

        // Menu for selecting the shape
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        double area = 0;

        // Perform the area calculation based on the user's choice
        switch (choice) {
            case 1:
                // Calculate the area of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius; // Area of circle: π * r^2
                System.out.println("Area of the circle: " + area);
                break;

            case 2:
                // Calculate the area of a rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width; // Area of rectangle: length * width
                System.out.println("Area of the rectangle: " + area);
                break;

            case 3:
                // Calculate the area of a triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height; // Area of triangle: 0.5 * base * height
                System.out.println("Area of the triangle: " + area);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid shape.");
                break;
        }

        scanner.close(); // Close the scanner to avoid resource leak
    }
}