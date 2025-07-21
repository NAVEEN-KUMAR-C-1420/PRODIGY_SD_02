import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;  

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 10:");
        System.out.print("Enter your guess: ");

        int userGuess = scanner.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("Correct! You guessed it right.");
        } else {
            System.out.println("oops! Wrong guess. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
