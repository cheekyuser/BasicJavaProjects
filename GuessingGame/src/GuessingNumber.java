import java.util.Random;
public class GuessingNumber {
    Random number=new Random();
    private int maxGuesses;//How many times player can try
    private int numToGuess;//the number player tried to guess
    private int numGuess;//how many times player guesses

//Constructor
    public  GuessingNumber(int maxGuesses) {
        this.numToGuess = number.nextInt(50);
        this.maxGuesses = maxGuesses;
        this.numGuess = 0;

    }
//Getters
    public int getMaxGuesses() {
        return maxGuesses;
    }

    public int getNumToGuess() {
        return numToGuess;
    }

    public int getNumGuess(){ return numGuess; }


}
