import java.util.Scanner;

 class BAGATA_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Inter the first no. : ");    
        int number1 = sc.nextInt();
    System.out.println("Inter the Second no. : ");
        int number2 = sc.nextInt();
     
        int add = number1+number2;
        int mul = number1*number2;
        int sub = number1-number2;
    
    System.out.println(add);
    System.out.println(mul);
    System.out.println(sub);
    }
}