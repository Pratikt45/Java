import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");
        
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < secretNumber) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number (" + secretNumber + ") in " + attempts + " attempts!");
                break;
            }
        }
        
        scanner.close();
    }
}