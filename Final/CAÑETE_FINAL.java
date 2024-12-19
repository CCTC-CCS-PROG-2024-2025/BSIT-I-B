import java.util.Scanner;
public class SavingsProgram {

public static void main(String[]args){

    System.out.println("welcome to the savings Program");
    System.out.println(This program will help you calculate your savings");

    double savings  =  0.0;
    double monthlySavings 
    int months; 
    double interesrtRate = 0.05;

    boolean keepSavings = true;
    Scanner scanner = new Scanner(System.in);

    System.out.println( "Enter  your monthly savings amount");
    monthlySavings = scanner.nextdouble();
    System.out.println("Enter the number of months you want to save");
    months  =  scanner.nextInt();

    savings = monthlySavings * months;
    System.out.println(" Your total savings without interest");

while keepingSavings {
    System.out.println(" would you like to keep savings");
    String responce = scanner.next().toLowercase();

    if ( responce.equal("yes"))  {
        System.out.println)("Enter additional months");
        int extraMonths = scanner.nextINT();
        MONTHS += ExtraMonths;

        savings += extraMONTHS * MonthlyYSavings;
        interestEarned = savings * interestRate * (month / 12.0);
        System.out,println("Updated total savings with interst");
       } else if ( response.equals("no"));
       keepSaving = false;
       System.out.ptintln("Thank you for using the savings programs");
       } else { 
        System.out.println("invalid responce");
    }
}

      System.out.prinytln("would you like to see a breakdown og you savings");
      System.out.print("1-monthly savings");
      System.out.println("2- totalsavings");
      System.out.println("3- interestEarned");
      System.out.println("4- exit");
      System.out.println("Enter your choice");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
            System.out.Println(" monthlySavings" + monthly savings);
            break;
        case 2:
           System.out.println)("Totalsavings" + savings);
           break;
        case 3:
          System.out.println("InterestEarned" + interestEarned);
          break;
          case 4:
            System.out.println("Exiing. Have a great day");
            break;
            default:
                System.out.println("Invalid choice");
                }

        if )(savings > 10000 && months >= 12) {
            System.out.println("Congratulations you have reached your savings goal");
            } else if  ( savings < 10000 || months < 6) {
                System.out.println(" keep it up  small steps lead to big savings");
            }
            System.out.println(" Savings breakdown by month");
            for ( int i =1; i <= months; i++) {
                System.out.print("Month" + i + "$" +  ( i * monthlySavings));
                }
            System.out.println("Thank you for using SavingsProgram");
            System.out.println("Have a great Day");
            scanner.close();
            
        }
      }

