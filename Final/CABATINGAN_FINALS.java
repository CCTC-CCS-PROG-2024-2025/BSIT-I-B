import java.util.Scanner;

class CABATINGAN_FINALS {
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Insert Username in order to play!");
    String InputName = sc.nextLine();
    System.out.println("Welcome to the Silly Game, " + InputName + "!");

    System.out.print("This is a game, It is a literal silly guessing game!");
    System.out.print(" Guess this number from 1 - 10, " + InputName + "!");
    
    int num1  = sc.nextInt();
    System.out.println(num1);
    
    switch (num1) {
      case 1:
        System.out.println("Nope.");
        System.out.println("Try again.");
        break;
      case 2:
        System.out.println("No.");
        System.out.println("Try again.");
        break;
      case 3:
        System.out.println("I have two eyes, I see three things, " + InputName + ".");
        System.out.println("Try again.");
        break;
      case 4:
        System.out.println("Turn around, " + InputName + ".");
        System.out.println("Every now and then, I get a little bit lonely");
        System.out.println("And you're never coming 'round");
        System.out.println("TURN AROUND! Try again..");
        break;
      case 5:
        System.out.println("When in doubt, go to library.");
        break;
      case 6:
        System.out.println("You shall not PASS!");
        break;
      case 7:
        System.out.println("The cake is a lie, " + InputName + "!");
        break;
      case 8:
        System.out.println("Stand proud. You're strong. Well done, " + InputName + ".");
        System.out.println("YOU WIN!");
        break;
      case 9: 
        System.out.println("Nuh uh");
        break;
      case 10:
        System.out.println("Wrong guess, " + InputName + ".");
        System.out.println("Try again.");
        break;
    }
    
    }
  }