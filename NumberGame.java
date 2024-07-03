import java.util.Random;
import java.util.Scanner;
public class NumberGame {

    public static int guessingNumberGame() {
        
        Scanner sc = new Scanner(System.in);

        // Generating the random numbers
        int num = 1 + new Random().nextInt(100);

        // Given trials
        int trials = 5;

        int i, guess;

        System.out.println("Choose a number between 1 to 100 and guess the number within 5 trials.");

        // Iterating over Trials
        for (i = 0; i < trials; i++) {

            System.out.println("Guess a number:");

            guess = sc.nextInt();

            if (num == guess) {
                System.out.println("Congratulations! You guessed the number correctly.");
                return i + 1; // Number of attempts taken
            } 
            else if (num > guess && i != trials - 1) {
                System.out.println("The number guessed is greater than " + guess);
            } 
            else if (num < guess && i != trials - 1) {
                System.out.println("The number guessed is less than " + guess);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted all the trials.");
            System.out.println("The number was " + num);
        }

        return trials; // All attempts are used
    }


    // Driver Code
    public static void main(String[] args) {

        System.out.println("Welcome to an amazing NUMBER GAME!");
        System.out.println("Instructions for the game:");
        System.out.println("1. You will be asked to guess a number.");
        System.out.println("2. Enter your guess.");
        System.out.println("3. You will receive feedback whether the number is greater or less than your guess.");
        System.out.println("4. You have a maximum of 5 attempts to guess the correct number.");
        System.out.println("Let's get started!");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        
        int totalAttempts = 0;
        int roundsWon = 0;
        int roundsPlayed = 0;

        do {
            roundsPlayed++;
            int attempts = guessingNumberGame();
            totalAttempts = totalAttempts + attempts;

            if (attempts < 5) {
                roundsWon++;
            }

            System.out.println("Do you want to play again...");
            System.out.print("yes / no : ");
            String ans = sc.nextLine();

            if (ans.toLowerCase().equals("no")) {
                System.out.println("Thank you for playing the game!");
                System.out.println("Rounds Played: " + roundsPlayed);
                System.out.println("Rounds Won: " + roundsWon);
                System.out.println("Total Attempts: " + totalAttempts);
                break;
            }
        } while (true);
    }
}
