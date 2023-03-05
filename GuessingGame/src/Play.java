import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {
    Scanner scanner = new Scanner(System.in);
    GuessingNumber guessingNum = new GuessingNumber(5);

    public void play() {
        int guesses = guessingNum.getNumGuess();
        int max_guess = guessingNum.getMaxGuesses();
        int num = guessingNum.getNumToGuess();
        System.out.println("Number is ready! Type your guess: ");
        while (guesses != max_guess) {
            try {
                int guess = scanner.nextInt();
                guesses++;
                if (guess == num) {
                    System.out.println("Congrats!\nThe number: " + num + "\nGuess: " + guesses);
                    break;
                }
                System.out.println(guess < num ? "Guess is smaller than the actual number." : "Guess is bigger than the actual number.");
                if (guesses == max_guess) {
                    System.out.println("You have used " + max_guess + " trial. The actual number was " + num);
                    break;
                }
                System.out.println("Type your next guess: ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // clear the scanner buffer
            }
        }
    }
}

