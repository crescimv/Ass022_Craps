import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declarations
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        //int die1 = rnd.nextInt(6) + 1;
        //int die2 = rnd.nextInt(6) + 1;
        //int crapsRoll = die1 + die2;
        boolean done=true; //boolean for reaching point
        boolean done2 = false; //boolean for replay of game
        String playAgain;

        //starting game
        while (!done2) {
            System.out.println("Game starting, rolling dice...");

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("You rolled " + die1 + " and " + die2);

            //conditions for crapsRoll dice sum
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Crapped out!");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Won with a Natural!");
            } else {
                System.out.println("The point is now " + crapsRoll);
                done=false;
            }

            //loop for if dice sum isn't 2, 3, 7, 11, or 12
                while (!done) {
                    int die3 = rnd.nextInt(6) + 1;
                    int die4 = rnd.nextInt(6) + 1;
                    int crapsRoll2 = die3 + die4;
                    System.out.println("Trying for point...");
                    System.out.println("You rolled " + die3 + " and " + die4);
                    if (crapsRoll2 == crapsRoll) {
                        System.out.println("Made point and won!");
                        done = true;
                    } else if (crapsRoll2 == 7) {
                        System.out.println("You rolled 7! You lost!");
                        done = true;
                    } else {
                        System.out.println("Re-rolling");
                    }
                }

            //prompts user to play again
            System.out.println("Would you like to play again? : [Y,N]");
            playAgain = input.next();
            if (playAgain.equalsIgnoreCase("Y")) {
                done2 = false;
            } else if (playAgain.equalsIgnoreCase("N")) {
                done2 = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
            }
        System.out.println("Thanks for playing!");
    }
    }

